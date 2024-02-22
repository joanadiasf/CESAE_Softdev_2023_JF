import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {
  FormControl,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { AnimaisService } from '../../services/animais.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs';
@Component({
  selector: 'app-animais-editar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [AnimaisService],
  templateUrl: './animais-editar.component.html',
  styleUrl: './animais-editar.component.scss'
})
export class AnimaisEditarComponent {
animaisId:string='';
  formularioAnimais: FormGroup = new FormGroup({
    nome: new FormControl('', Validators.required),
    especie: new FormControl('', Validators.required),
    raca: new FormControl('', Validators.required),
    sexo: new FormControl('', Validators.required),
    dataNascimento: new FormControl('', Validators.required),
    tutorId: new FormControl('', Validators.required),
  });
  criarSubscription?: Subscription;
  submitted: boolean = false;

  constructor(
    private route: ActivatedRoute,
    private animaisService: AnimaisService,
    private router: Router
  ) {}

  handleSubmit(): void {
    this.submitted = true;

    if (this.formularioAnimais.valid) {
      this.criarSubscription = this.animaisService
        .update({
          id:this.animaisId,
          nome: this.formularioAnimais.controls['nome'].value,
          especie: this.formularioAnimais.controls['especie'].value,
          raca: this.formularioAnimais.controls['raca'].value,
          sexo: this.formularioAnimais.controls['sexo'].value,
          dataNascimento: this.formularioAnimais.controls['dataNascimento'].value,
          tutorId: this.formularioAnimais.controls['tutorId'].value,
          
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
    this.animaisId = this.route.snapshot.paramMap.get('id') || '';
  }

  ngOnDestroy() {
    this.criarSubscription?.unsubscribe();
  }
}
