import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { MinhaListaComponent } from './minha-lista/minha-lista.component';
import { ListaAnimaisComponent } from './lista-animais/lista-animais.component';

export const routes: Routes = [
  {
    path: 'primeira',
    title: 'Primeira Página',
    component: PrimeiraPaginaComponent,
  },
  {
    path: 'segunda',
    title: 'Segunda Página',
    component: SegundaPaginaComponent,
    children: [
      {
        path: 'aaa',
        title: 'Aaa | Segunda Página',
        component: SegundaAaaPaginaComponent,
      },
      {
        path: 'bbb',
        title: 'Bbb | Segunda Página',
        component: SegundaBbbPaginaComponent,
      },
    ],
  },
  {
    path: 'minha-lista', 
    title: 'minha lista',
    component: MinhaListaComponent
  },
  {
    path: 'lista-animais', 
    title: 'lista animais',
    component: ListaAnimaisComponent
  },


/******************************************************/
  {path: "",redirectTo: "/primeira",pathMatch:"full"},
  {path: "**", title: "404", component: NotFoundComponent,}
];
