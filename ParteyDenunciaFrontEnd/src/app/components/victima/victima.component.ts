import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-victima',
  templateUrl: './victima.component.html',
  styleUrls: ['./victima.component.css']
})
export class VictimaComponent implements OnInit {
  
  ngOnInit(): void {
  }

  // textBoxDisabledRedes = true;
  // textBoxDisabledDenunciado = true;
  miFormulario: FormGroup;


  tpResidencia: any = ['Institucional', 'Particular', 'Situacion de Calle']        
  conoceDenunciado: any = ['Si','No']

  

  constructor(private fb: FormBuilder) {
    this.miFormulario = this.fb.group({
      nombre: [  , [ Validators.required ] ],
      redesSociales:[  , [ ] ],
      tipoResidencia: [],
    })
  }

  

  // habilitarCampoRedes(){
  //   this.textBoxDisabledRedes = !this.textBoxDisabledRedes;
  // }

  // habilitarCampoDenunciado()
  // {
  //   this.textBoxDisabledDenunciado = !this.textBoxDisabledDenunciado;
  // }


}
