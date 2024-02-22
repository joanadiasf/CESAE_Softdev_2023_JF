import { Component } from '@angular/core';
import { MarcacoesListaComponent } from '../../components/marcacoes-lista/marcacoes-lista.component';
import { RouterLink } from '@angular/router';
import { TutoresListaComponent } from '../../components/tutores-lista/tutores-lista.component';
import { AnimaisListaComponent } from '../../components/animais-lista/animais-lista.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [MarcacoesListaComponent,RouterLink,TutoresListaComponent,AnimaisListaComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

}
