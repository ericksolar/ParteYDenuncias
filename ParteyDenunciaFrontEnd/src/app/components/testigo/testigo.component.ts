import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-testigo',
  templateUrl: './testigo.component.html',
  styleUrls: ['./testigo.component.css']
})
export class TestigoComponent implements OnInit {

  textBoxDisabledRedes = true;

  ngOnInit(): void {

  }

  miFormulario: FormGroup = this.fb.group({

    // nombre: [ , [ Validators.required ] ],
    // nombreSocial: [],
    // tipoDocumentoIdentificacion: [  , [ Validators.required ] ],
    // numeroDocumentoIdentificacion: [  , [ Validators.required ] ],
    // fechaNacimiento:[],
    // ciudadNacimiento:[],
    // idioma:[],
    // nacionalidad:[  , [ Validators.required ] ],
    // escolaridad:[],
    // estadoMigratorio: [ , [ Validators.required ] ],
    // sexoRegistral: [],
    // identidadGenero: [],
    // alias: [],
    // puebloOriginario: [],
    // profesion: [],
    // estadoCivil:[],
    // estado: [, [ Validators.required ] ],
    // lesiones:  [ , ],
    // tipoDireccion: [, [ Validators.required ] ],
    // calle: [ , [ Validators.required ] ],
    // numero: [, [ Validators.required ] ],
    // departamento: [],    
    // block: [],  
    // poblacion: [],
    // sector: [],   
    // region: [ , Validators.required],
    // comuna: [ , Validators.required],
    // observacion: [],
    // datosContacto: [ , Validators.required],
    // telefonoFijo: [],   
    // telefonoMovil: [, Validators.required],
    // correo: [], 
    // redesSociales:[],
    // login:[],   
    // conoceDununciado:[],        
    // relacionDenunciado: [],
    // otrosTestigos: [],   
    // pruebaHechos: [],

  })

  constructor(private fb: FormBuilder) { }

  habilitarCampoRedes(){
    this.textBoxDisabledRedes = !this.textBoxDisabledRedes;
  }



}
