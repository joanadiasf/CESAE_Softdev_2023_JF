export interface ICidade {
    id : number;
    nome : string;
    pais : string;
    populacao ?: number;  // ?: torna o atributo nao obrigatorio
}