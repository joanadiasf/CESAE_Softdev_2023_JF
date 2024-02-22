import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {
  FormControl,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { MarcacoesService } from '../../services/marcacoes.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-marcacoes-editar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [MarcacoesService],
  templateUrl: './marcacoes-editar.component.html',
  styleUrl: './marcacoes-editar.component.scss',
})
export class MarcacoesEditarComponent {
  marcacaoId: string = '';
  formularioMarcacao: FormGroup = new FormGroup({
    tipo: new FormControl('', Validators.required),
    animalId: new FormControl('', Validators.required),
    tutorId: new FormControl('', Validators.required),
    dataHora: new FormControl('', Validators.required),
    realizada: new FormControl('', Validators.required),
    cancelada: new FormControl('', Validators.required),
  });
  criarSubscription?: Subscription;
  submitted: boolean = false;

  constructor(
    private route: ActivatedRoute,
    private marcacoesService: MarcacoesService,
    private router: Router
  ) {}

  handleSubmit(): void {
    this.submitted = true;

    if (this.formularioMarcacao.valid) {
      this.criarSubscription = this.marcacoesService
        .update({
          id: this.marcacaoId,
          tipo: this.formularioMarcacao.controls['tipo'].value,
          animalId: this.formularioMarcacao.controls['animalId'].value,
          tutorId: this.formularioMarcacao.controls['tutorId'].value,
          dataHora: this.formularioMarcacao.controls['dataHora']?.value,
          realizada: this.formularioMarcacao.controls['realizada'].value,
    cancelada: this.formularioMarcacao.controls['cancelada']?.value,
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
    this.marcacaoId = this.route.snapshot.paramMap.get('id') || '';
  }

  ngOnDestroy() {
    this.criarSubscription?.unsubscribe();
  }
}
