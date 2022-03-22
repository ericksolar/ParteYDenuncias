import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-imputado',
  templateUrl: './imputado.component.html',
  styleUrls: ['./imputado.component.css']
})
export class ImputadoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  selectedValue: string = '';
  selectedTipoDocumento: string = '';

}
