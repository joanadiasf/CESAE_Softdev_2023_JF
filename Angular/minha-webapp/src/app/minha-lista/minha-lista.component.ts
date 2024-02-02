import { Component } from '@angular/core';
import { MinhaListaItemComponent } from '../minha-lista-item/minha-lista-item.component';
import { CidadesService } from '../services/cidades.service';
import { ICidade } from '../models/cidade.model';

@Component({
  selector: 'app-minha-lista',
  standalone: true,
  imports: [MinhaListaItemComponent],
  templateUrl: './minha-lista.component.html',
  styleUrl: './minha-lista.component.scss',
})
export class MinhaListaComponent {
  cidades: Array<ICidade> = [];

  constructor(private cidadesService: CidadesService) {

     console.log('MinhaListaComponent.constructor()');
    //...

    
  }

  ngOnChange() {
    console.log('MinhaListaComponent.ngOnChange()');
    /*É executado sempre que o Angular deteta
uma mudança em uma propriedade de entrada (@Input).
Recebe um objeto do tipo SimpleChanges que contém os
valores atuais e anteriores das propriedades alteradas */
  }

  ngOnInit() {
    console.log('MinhaListaComponent.ngOnInit()');
    /*É executado uma vez depois que o Angular
termina de inicializar as propriedades de entrada. É usado
para realizar operações de inicialização que dependem dos
dados de entrada, como fazer requisições HTTP, atribuir
valores a propriedades, etc…*/

this.cidades = this.cidadesService.cidades;
  }

  adicionarCidade(){
    this.cidadesService.create({nome: 'Lisboa',pais: 'Portugal'});
  }

  ngDoCheck() {
    console.log('MinhaListaComponent.ngDoCheck()');
    /*É executado a cada ciclo de deteção de
mudanças do Angular, que é o mecanismo que o Angular usa
para verificar se há mudanças nos dados e atualizar a view. É
usado para implementar uma lógica personalizada de
deteção de mudanças, que pode ser mais complexa ou
específica do que a padrão do Angular*/
  }

  ngAfterContentChecked(){

    /*É executado depois de cada ciclo
de deteção de mudanças do Angular, depois que o conteúdo
projetado é verificado. É usado para realizar operações que
dependem das mudanças no conteúdo projetado, como
atualizar valores, aplicar estilos, etc… */
  }

  ngAfterViewInit() {

    /* É executado uma vez depois que o Angular
inicializa a view do e as views dos seus filhos. É usado para
realizar operações que dependem da view, como aceder
elementos DOM, manipular dados, etc… */
  }
 
  ngAfterViewChecked() {

    /* É executado depois de cada ciclo de
deteção de mudanças do Angular, depois que a view e as
views dos filhos são verificadas. É usado para realizar
operações que dependem das mudanças na view, como
atualizar valores, aplicar estilos, etc… */
  }
 
  ngOnDestroy() {
    console.log('MinhaListaComponent.ngOnDestroy()');
    /* É executado uma vez antes que o Angular
destrua o componente ou diretiva. É usado para realizar
operações de limpeza, como cancelar subscrições, desalocar
recursos, remover event listeners, etc… */
  }
}
