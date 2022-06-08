import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { TPSituacionDenuncia } from '../models/tp-situacion-denuncia';

@Injectable({
  providedIn: 'root'
})
export class TpSituacionDenunciaService {

  url:string = "http://localhost:8080/api/tipos-situacion-denuncia/"

  constructor(private http: HttpClient) { }

  getAllTPSituacionDenuncia(): Observable<TPSituacionDenuncia[]>{
    return this.http.get<TPSituacionDenuncia[]>(this.url).pipe(
      catchError( this.handleError)
    );
  }

  handleError(error: HttpErrorResponse){
    console.log(error)
     return throwError('error en el server'|| error.error.title)
  }
}
