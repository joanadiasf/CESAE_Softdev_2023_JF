import { Component } from '@angular/core';
import { MinhaListaItemComponent } from '../minha-lista-item/minha-lista-item.component';

@Component({
  selector: 'app-minha-lista',
  standalone: true,
  imports: [MinhaListaItemComponent],
  templateUrl: './minha-lista.component.html',
  styleUrl: './minha-lista.component.scss'
})
export class MinhaListaComponent {

  cidades: Array<{nome:string, pais:string, populacao:number}> =[
    {nome:'Porto',pais:'Portugal', populacao:78450},
    {nome:'Milao',pais:'Italia', populacao:181494},
    {nome:'Berlim',pais:'Alemanha', populacao:1620343},
    {nome:'Seoul',pais:'Coreia do Sul', populacao:2148271},
    {nome:'Paris',pais:'Franca', populacao:3645000}
  ]

}
