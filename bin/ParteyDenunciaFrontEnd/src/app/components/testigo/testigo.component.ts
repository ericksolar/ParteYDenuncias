import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-testigo',
  templateUrl: './testigo.component.html',
  styleUrls: ['./testigo.component.css']
})
export class TestigoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  selectedTipoDocumento: string = '';
  IdentidadGenero: string = '';
  Domicilio: string = '';
  DatosContacto: string = '';
  RelacionDenunciado: string = '';

}
