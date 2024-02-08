import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CidadesService } from '../services/cidades-ls.service';
import { ICidade } from '../models/cidade.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-formulario-cidade-td',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario-cidade-td.component.html',
  styleUrl: './formulario-cidade-td.component.scss'
})
export class FormularioCidadeTdComponent {
  
  nomeCidade: string = '';
  paisCidade: string = '';
  populacaoCidade: number = 0;

  constructor(private cidadeService:CidadesService, private router: Router){
    //...
  }

  formSubmit(){
    console.log('nome',this.nomeCidade)

    let novaCidade: ICidade= {
      id: 0,
      nome:this.nomeCidade,
      pais:this.paisCidade,
      populacao:this.populacaoCidade
    }

    this.cidadeService.create(novaCidade);

    this.router.navigate(['/minha-lista']);
  }
}
