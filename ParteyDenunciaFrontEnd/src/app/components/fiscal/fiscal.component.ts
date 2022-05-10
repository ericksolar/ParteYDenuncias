import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fiscal',
  templateUrl: './fiscal.component.html',
  styleUrls: ['./fiscal.component.css']
})
export class FiscalComponent implements OnInit {

  textBoxDisabledFiscal = true;

  constructor() { }

  ngOnInit(): void {
  }

  habilitarCampoFiscal(){
    this.textBoxDisabledFiscal = !this.textBoxDisabledFiscal;
  }
}
