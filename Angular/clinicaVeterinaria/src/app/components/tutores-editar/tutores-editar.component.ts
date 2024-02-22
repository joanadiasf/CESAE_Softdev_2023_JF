import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {
  FormControl,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { TutoresService } from '../../services/tutores.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs';
@Component({
  selector: 'app-tutores-editar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [TutoresService],
  templateUrl: './tutores-editar.component.html',
  styleUrl: './tutores-editar.component.scss'
})
export class TutoresEditarComponent {
tutorId:string='';
  formularioTutores: FormGroup = new FormGroup({
    nome: new FormControl('', Validators.required),
    telemovel: new FormControl('', Validators.required),
    email: new FormControl('', Validators.required),
  });
  criarSubscription?: Subscription;
  submitted: boolean = false;

  constructor(
    private route: ActivatedRoute,
    private tutoresService: TutoresService,
    private router: Router
  ) {}

  handleSubmit(): void {
    this.submitted = true;

    if (this.formularioTutores.valid) {
      this.criarSubscription = this.tutoresService
        .update({
          id:this.tutorId,
          nome: this.formularioTutores.controls['nome'].value,
          telemovel: this.formularioTutores.controls['telemovel'].value,
          email: this.formularioTutores.controls['email'].value,
        })
        .subscribe({
          next: (value) => {
            this.router.navigate(['/']);
          },
          error: (err) => {
            console.error('Erro ao criar uma nova marcação!', err);
          },
        });
    }
  }
  ngOnInit() {
    this.tutorId = this.route.snapshot.paramMap.get('id') || '';
  }

  ngOnDestroy() {
    this.criarSubscription?.unsubscribe();
  }
}
