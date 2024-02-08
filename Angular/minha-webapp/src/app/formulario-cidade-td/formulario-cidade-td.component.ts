import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CidadesService } from '../services/cidades-ls.service';
import { ICidade } from '../models/cidade.model';
import { ActivatedRoute,  Router } from '@angular/router';

@Component({
  selector: 'app-formulario-cidade-td',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario-cidade-td.component.html',
  styleUrl: './formulario-cidade-td.component.scss'
})
export class FormularioCidadeTdComponent {

  minhaCidade: ICidade = {
    id: 0,
    nome: '',
    pais: '',
    populacao: 0
  };

  constructor(private cidadeService:CidadesService, 
              private router: Router,
              private route: ActivatedRoute
  ) {
  }

  ngOnInit(){
    this.minhaCidade.id = parseInt(this.route.snapshot.paramMap.get('id') ??  '0') ; //ele e uma string e precisa de passar pra nr, dai o parseInt

    if(this.minhaCidade.id > 0){

      this.minhaCidade= this.cidadeService.read(this.minhaCidade.id);

   
    }

    console.log('id:',this.minhaCidade.id);
  }

  formSubmit(){
    console.log('nome',this.minhaCidade.nome)

    let novaCidade: ICidade= {
      id: 0,
      nome: this.minhaCidade.nome,
      pais: this.minhaCidade.pais,
      populacao: this.minhaCidade.populacao
    }

    this.cidadeService.create(novaCidade);

    this.router.navigate(['/minha-lista']);
  }
}
