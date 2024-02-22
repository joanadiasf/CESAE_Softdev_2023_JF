import { Component } from '@angular/core';
import { CidadesService } from '../services/cidades-api.service';
import { HttpClientModule } from '@angular/common/http';
import { ICidade } from '../models/cidade.model';
import { ActivatedRoute, Router } from '@angular/router';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-form-api',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [CidadesService],
  templateUrl: './form-api.component.html',
  styleUrl: './form-api.component.scss',
})
export class FormApiComponent {
  form: FormGroup;

  minhaCidade: ICidade = {
    id: '',
    nome: '',
    pais: '',
  };

  constructor(
    private cidadesService: CidadesService,
    private route: ActivatedRoute,
    private formBuilder: FormBuilder,
    private router: Router
  ) {
    this.form = formBuilder.group({
      nome: ['', Validators.required],
      pais: ['', Validators.required],
      populacao: [0, Validators.min(1000)],
    });
  }

  ngOnInit() {
    this.minhaCidade.id = this.route.snapshot.paramMap.get('id') ?? '';
    console.log('id:', this.minhaCidade.id);

    if (this.minhaCidade.id) {
      this.cidadesService.read(this.minhaCidade.id).subscribe((cidade) => {
        console.log(cidade);
        this.minhaCidade = cidade;
        this.form.controls['nome'].setValue(cidade.nome);
        this.form.controls['pais'].setValue(cidade.pais);
        this.form.controls['populacao'].setValue(cidade.populacao);
      });
    }
  }

  formSubmit() {
    console.log('if', this.form.invalid);
    if (this.form.invalid) {
      // nao fazer nada
    } else {
      console.log('id', this.minhaCidade.id);
      if (this.minhaCidade.id) {
        // editar cidade
        this.cidadesService
          .update({
            id: this.minhaCidade.id,
            nome: this.form.controls['nome'].getRawValue(),
            pais: this.form.controls['pais'].getRawValue(),
            populacao: this.form.controls['populacao'].getRawValue(),
          })
          .subscribe({
            next: (data) => {
              console.log('foi editado');
              this.router.navigate(['/minha-lista']);
            },
            error: (error) => {
              console.error('não foi editado');
              alert('erro ao editar');
            },
          });
      } else {
        // ou criar cidade
        this.cidadesService
          .create({
            nome: this.form.controls['nome'].getRawValue(),
            pais: this.form.controls['pais'].getRawValue(),
            populacao: this.form.controls['populacao'].getRawValue(),
          })
          .subscribe({
            next: (data) => {
              console.log('foi criado');
              this.router.navigate(['/minha-lista']);
            },
            error: (error) => {
              console.error('não foi criado');
              alert('erro ao criar');
            },
          });
      }
    }
  }
}
