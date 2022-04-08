import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-victima',
  templateUrl: './victima.component.html',
  styleUrls: ['./victima.component.css']
})
export class VictimaComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  selectedTipoDocumento: string ='';
  IdentidadGenero: string ='';
  Domicilio: string ='';
  DatosContacto: string ='';
  Convive: string ='';
  RelacionDenunciado: string ='';
}
