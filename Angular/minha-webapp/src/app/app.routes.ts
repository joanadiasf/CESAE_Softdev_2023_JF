import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { MinhaListaComponent } from './minha-lista/minha-lista.component';
import { ListaAnimaisComponent } from './lista-animais/lista-animais.component';
import { FormularioCidadeTdComponent } from './formulario-cidade-td/formulario-cidade-td.component';
import { FormApiComponent } from './form-api/form-api.component';

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
  
    /*{
      path: 'formulario-cidade-td', 
      title: 'Criar - formulario cidade (Template-driven forms)',
      component: FormularioCidadeTdComponent
    },
    {
      path: 'formulario-cidade-td/:id',   //os : faz com que seja uma variavel
      title: 'Editar - formulario cidade (Template-driven forms)',
      component: FormularioCidadeTdComponent
    },*/

  {
    path: 'formulario-cidade-td',
    children:[
      {
        path:'',
        title: 'Criar - formulario cidade (Template-driven forms)',
        component: FormularioCidadeTdComponent,
      },
      {
        path:':id',
        title: 'Editar - formulario cidade (Template-driven forms)',
        component: FormularioCidadeTdComponent,
      }
    ]

  },
  {
    path: 'form-api',
    children:[
      {
        path:'',
        title: 'Criar - formulario cidade (reactive forms)',
        component: FormApiComponent,
      },
      {
        path:':id',
        title: 'Editar - formulario cidade (reactive forms)',
        component: FormApiComponent,
      }
    ]

  },
  {
    path: 'lista-animais', 
    title: 'lista animais',
    component: ListaAnimaisComponent
  },


/******************************************************/
  {path: "",redirectTo: "/minha-lista",pathMatch:"full"}, //rota por defeito
  {path: "**", title: "404", component: NotFoundComponent,}
];
