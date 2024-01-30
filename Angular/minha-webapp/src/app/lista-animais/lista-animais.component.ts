import { Component } from '@angular/core';
import { ListaAnimaisItemComponent } from '../lista-animais-item/lista-animais-item.component';

@Component({
  selector: 'app-lista-animais',
  standalone: true,
  imports: [ListaAnimaisItemComponent],
  templateUrl: './lista-animais.component.html',
  styleUrl: './lista-animais.component.scss'
})
export class ListaAnimaisComponent {

  animais: Array<{nome:string,especie:string,raca:string,idade:number}> =[

    {nome:'Tobias',especie:'Macaco',raca:'Macaco',idade: 1},
    {nome:'Bobi',especie:'Cao',raca:'Labrador',idade:5},
    {nome:'Pantufa',especie:'Leao',raca:'Leao',idade:20},
    {nome:'Bolinhas',especie:'Girafa',raca:'Girafa',idade:25},
    {nome:'Jose',especie:'Koala',raca:'Koala',idade:2}
  ]

}
