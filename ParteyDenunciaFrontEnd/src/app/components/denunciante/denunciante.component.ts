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
    tipoDocumento: [  , [ Validators.required ] ],
    numeroDocumento: [  , [ Validators.required ] ],
    nombre: [  , [ Validators.required ] ],
    nombreSocial: [],
    fechaNacimiento: [  , [ Validators.required ] ],
    ciudadNacimiento:[  , [ Validators.required ] ],
    idioma: [],
    nacionalidad:[ '' , [ Validators.required ] ],
    escolaridad: [''],
    estadoMigratorio: [''],
    sexoRegistral:[ '' , [ Validators.required ] ],
    identidadGenero: [''],
    alias: [''],
    puebloOriginario: [''],
    profesion: [''],
    estadoCivil: [''],
    tipoContacto: [''],
    telefonoFijo: [''],
    telefonoMovil: [''],
    correo: [''],
    redesSociales: [''],
    login: [''],
    tipoDireccion: [],
    calle:[ '' , [ Validators.required ] ],
    numero:[ '' , [ Validators.required ] ],
    depto: [''],
    block: [''],
    poblacion: [''],
    sector: [''],
    region:[ '' , [ Validators.required ] ],
    comuna: [''],
    referenciaDireccion: [''],
    nna: [''],
    parentesco: [''],
    referenteVictima:[''],
    contoHechos: [''],
    supoHechos: [''],
  });

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
