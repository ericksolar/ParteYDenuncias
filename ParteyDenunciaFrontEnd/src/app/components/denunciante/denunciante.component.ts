import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-denunciante',
  templateUrl: './denunciante.component.html',
  styleUrls: ['./denunciante.component.css']
})
export class DenuncianteComponent implements OnInit {

  textBoxDisabledRedes = true;
  textBoxDisabledDenunciante = true;

  ngOnInit(): void {
  }

  miFormulario: FormGroup = this.fb.group({
    nombre: [  , [ Validators.required ] ],
    tipoDocumento: [  , [ Validators.required ] ],
    numeroDocumento: [  , [ Validators.required ] ],
    fechaNacimiento: [  , [ Validators.required ] ],
    ciudadNacimiento:[  , [ Validators.required ] ],
    nacionalidad:[  , [ Validators.required ] ],
    sexoRegistral:[  , [ Validators.required ] ],
    radio:[  , [ Validators.required ] ],
    redesSociales:[  , [ ] ],
    login: [  , [ ] ],
    calle:[  , [ Validators.required ] ],
    numero:[  , [ Validators.required ] ],
    region:[  , [ Validators.required ] ],
  })

  constructor(private fb: FormBuilder) {}

  campoValido(campo: string){
    return this.miFormulario.controls[campo].errors 
            && this.miFormulario.controls[campo].touched;
  }

  habilitarCampoRedes(){
    this.textBoxDisabledRedes = !this.textBoxDisabledRedes;
  }

  habilitarCampoDenunciante()
  {
    this.textBoxDisabledDenunciante = !this.textBoxDisabledDenunciante;
  }


}
