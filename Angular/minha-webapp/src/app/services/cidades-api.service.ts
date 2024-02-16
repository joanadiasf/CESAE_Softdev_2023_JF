import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class CidadesService {
  //funciona tipo o Singleton

  cidades: Array<ICidade> = [];

  constructor(private http: HttpClient) {}

  limparDados(): void {}

  reporDados(): void {}

  //crud
  create(novaCidade: ICidade): void {}

  readAll(): Observable<any> {
    //tambem pode ser chamado de método get
    return this.http.get('http://localhost:3000/cidades');
  }

  read(id: number): Observable<any> {
    return this.http.get('http://localhost:3000/cidades/' + id);
  }

  update(cidade: ICidade): void {}

  delete(cidade: ICidade): void {}
}
