import { Injectable } from '@angular/core';
import {ICidade} from '../models/cidade.model'

@Injectable({
  providedIn: 'root'
})
export class CidadesService { //funciona tipo o Singleton

  cidades: Array<ICidade> = [];


  constructor() { 
  }

  limparDados() :void { }

  reporDados() :void { }

  //crud
  create(novaCidade: ICidade) :void { }

  readAll() :void { }

  read(id:number){ }

  update(cidade: ICidade) :void { }

  delete(cidade: ICidade) :void { }

}
