import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-imputado',
  templateUrl: './imputado.component.html',
  styleUrls: ['./imputado.component.css']
})
export class ImputadoComponent implements OnInit {

  textBoxDisabledRedes = true;
  textBoxDisabledDetenido =  true;
  
  miFormulario: FormGroup = this.fb.group({
    nombre: [  , [ Validators.required ] ],
    tipoDocumento: [ null , [ Validators.required ] ],
    numeroDocumento: [  , [ Validators.required ] ],
    fechaNacimiento: [  , [ Validators.required ] ],
    ciudadNacimiento:[  , [ Validators.required ] ],
    nacionalidad:[ null , [ Validators.required ] ],
    sexoRegistral:[ null , [ Validators.required ] ],
    redesSociales:[  , [ ] ],
    login: [  , [ ] ],
    calle:[  , [ Validators.required ] ],
    numero:[  , [ Validators.required ] ],
    region:[  , [ Validators.required ] ],
  })

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  habilitarCampoRedes(){
    this.textBoxDisabledRedes = !this.textBoxDisabledRedes;
  }

  deshabilitarDetenido(){
    this.textBoxDisabledDetenido = !this.textBoxDisabledDetenido;
  }



}
