import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-victima',
  templateUrl: './victima.component.html',
  styleUrls: ['./victima.component.css']
})
export class VictimaComponent implements OnInit {

  textBoxDisabledRedes = true;
  textBoxDisabledDenunciado = true;

  miFormulario: FormGroup = this.fb.group({
    nombre: [  , [ Validators.required ] ],
    redesSociales:[  , [ ] ],

  })

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
  }

  habilitarCampoRedes(){
    this.textBoxDisabledRedes = !this.textBoxDisabledRedes;
  }

  habilitarCampoDenunciado()
  {
    this.textBoxDisabledDenunciado = !this.textBoxDisabledDenunciado;
  }


}
