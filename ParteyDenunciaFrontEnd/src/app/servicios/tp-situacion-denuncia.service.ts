import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { TpSituacionDenuncia } from '../models/tp-situacion-denuncia';

@Injectable({
  providedIn: 'root'
})
export class TpSituacionDenunciaService {

  url:string = "http://localhost:8080/api/tipos-situacion-denuncia/"

  constructor(private http: HttpClient) { }

  getAllTPSituacionDenuncia(): Observable<TpSituacionDenuncia[]>{
    return this.http.get<TpSituacionDenuncia[]>(this.url).pipe(
      catchError( this.handleError)
    );
  }

  handleError(error: HttpErrorResponse){
    console.log(error)
     return throwError('error en el server'|| error.error.title)
  }
}
