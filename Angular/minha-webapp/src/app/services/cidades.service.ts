import { Injectable } from '@angular/core';
import {ICidade} from '../models/cidade.model'

@Injectable({
  providedIn: 'root'
})
export class CidadesService { //funciona tipo o Singleton

  cidades: Array<ICidade> = [
    { nome: 'Porto', pais: 'Portugal', populacao: 78450 },
    { nome: 'Milao', pais: 'Italia', populacao: 181494 },
    { nome: 'Berlim', pais: 'Alemanha', populacao: 1620343 },
    { nome: 'Seoul', pais: 'Coreia do Sul', populacao: 2148271 },
    { nome: 'Paris', pais: 'Franca', populacao: 3645000 },
  ];


  constructor() { 
  }

  create(novaCidade: ICidade ){
    this.cidades.push(novaCidade);
  }
}
