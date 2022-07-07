import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { catchError, Observable, throwError } from 'rxjs';
import { TpConduccion } from '../models/tp-conduccion';

@Injectable({
  providedIn: 'root'
})
export class TpConduccionService {

  url:string = "http://localhost:8080/api/tipos-conduccion/"

  constructor(private http: HttpClient) { }

  getAllTpConduccion(): Observable<TpConduccion[]>{
    return this.http.get<TpConduccion[]>(this.url).pipe(
      catchError( this.handleError)
    );
  }

  handleError(error: HttpErrorResponse){
    console.log(error)
     return throwError('error en el server'|| error.error.title)
  }

}
