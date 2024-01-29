import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';

export const routes: Routes = [
    {path: "primeira",title: "Primeira Pagina",component: PrimeiraPaginaComponent}, //caminho  dominio/primeira  vai pra pagina
    {path: "segunda",title: "Segunda Pagina", component: SegundaPaginaComponent, 
    children: [

        {path: "aaa",title: "AAA -Segunda Pagina",component: SegundaAaaPaginaComponent},
        {path: "bbb",title: "BBB-Segunda Pagina", component: SegundaBbbPaginaComponent}
    ]}
];
