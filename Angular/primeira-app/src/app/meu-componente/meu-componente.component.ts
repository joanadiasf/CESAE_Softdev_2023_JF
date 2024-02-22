import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-meu-componente',
  standalone: true,
  imports: [],
  templateUrl: './meu-componente.component.html',
  styleUrl: './meu-componente.component.scss'
})
export class MeuComponenteComponent {
 //@Input({ required:true}) meuNome = "Sirius";  required - fica obrigatorio
@Input({alias: "meu-nome"}) meuNome = "Sirius";  //alias - nome que queremos dar a propriedade - funciona so pro input - podemos so por "meu-nome" sem escrever alias

// @Input() meuNome = "Sirius";

 mensagem = "I'm so sleepy 😴";
 imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkK4c3vGQxtyaZpwnWgzxDdcOcwMwzoW-mwg&usqp=CAU";

@Output() mudancaContador : EventEmitter<number> = new EventEmitter <number>();
contador : number = 0

 imagens: string []= [
  "https://t1.ea.ltmcdn.com/pt/posts/4/8/5/gato_fraco_o_que_fazer_24584_orig.jpg",
  "https://sadanduseless.b-cdn.net/wp-content/uploads/2021/02/cat-taxidermy14.jpg"

];

 /* arr: Array<string>  funciona da mesma forma que o exemplo a cima */

obj: {id:number,nome:string}={        
  id:80,
  nome:"joanaa"
};

pCorTexto: string= "#336699";
pCorFundo: string= "#99ccff";
pAlterarCores: boolean = true;

 alterarImagem(): void {
    this.imagem = this.imagens[1];
    /*this.obj.nome;  como chamar um objeto */
 }

 alterarImagem2(): void {
  this.imagem = this.imagens[2];
}

alterarCores(): void {
  let cor: string = this.pCorTexto
  this.pCorTexto= this.pCorFundo
  this.pCorFundo=cor
}

alterarAtivo(): void{
  this.pAlterarCores = false;
}


incrementar(): void {

  this.contador++;
   this.mudancaContador.emit(this.contador);
}

}
