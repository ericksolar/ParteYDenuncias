import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-denunciante',
  templateUrl: './denunciante.component.html',
  styleUrls: ['./denunciante.component.css']
})
export class DenuncianteComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  selectedTipoDocumento: string ='';
  zonaDelito: string ='';
  prueba1: string ='';
  prueba2: string ='';
  IdentidadGenero: string ='';
  TipoContacto: string ='';
  TipoDireccion: string ='';

}
