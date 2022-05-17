import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormArray, Validators } from '@angular/forms';

@Component({
  selector: 'app-denunciante',
  templateUrl: './denunciante.component.html',
  styleUrls: ['./denunciante.component.css']
})
export class DenuncianteComponent implements OnInit {

  textBoxDisabledRedes = true;
  textBoxDisabledDenunciante = true;

  miFormulario: FormGroup;

  ngOnInit(): void {
  }

  constructor(private fb: FormBuilder) {
    this.miFormulario = this.fb.group({
       tipoDocumento: this.fb.array([]) ,
       numeroDocumento: this.fb.array([]) ,
       nombre: this.fb.array([]) ,
       nombreSocial: this.fb.array([]) ,
       fechaNacimiento: this.fb.array([]) ,
       ciudadNacimiento:this.fb.array([]) ,
       idioma: this.fb.array([]) ,
       nacionalidad:this.fb.array([]) ,
       escolaridad: this.fb.array([]) ,
       estadoMigratorio: this.fb.array([]) ,
       sexoRegistral:this.fb.array([]) ,
       identidadGenero: this.fb.array([]) ,
       alias: this.fb.array([]) ,
       puebloOriginario: this.fb.array([]) ,
       profesion: this.fb.array([]) ,
       estadoCivil: this.fb.array([]) ,
       tipoContacto: this.fb.array([]) ,
       telefonoFijo: this.fb.array([]) ,
       telefonoMovil: this.fb.array([]) ,
       correo: this.fb.array([]) ,
       redesSociales: this.fb.array([]) ,
       login: this.fb.array([]) ,
       tipoDireccion: this.fb.array([]) ,
       calle: this.fb.array([]) ,
       numero: this.fb.array([]) ,
       depto: this.fb.array([]) ,
       block: this.fb.array([]) ,
       poblacion: this.fb.array([]) ,
       sector: this.fb.array([]) ,
       region: this.fb.array([]) ,
       comuna: this.fb.array([]) ,
       referenciaDireccion: this.fb.array([]) ,
       nna: this.fb.array([]) ,
       parentesco: this.fb.array([]) ,
       referenteVictima: this.fb.array([]) ,
       contoHechos: this.fb.array([]) ,
       supoHechos: this.fb.array([]) ,
   }); 
  }

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

  nuevoDenunciante(): FormGroup {
    return this.fb.group({
      tipoDocumento: [],
      numeroDocumento: [],
      nombre: [],
      nombreSocial: [],
      fechaNacimiento: [],
      ciudadNacimiento:[],
      idioma: [],
      nacionalidad:[],
      escolaridad: [''],
      estadoMigratorio: [''],
      sexoRegistral:[],
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
      calle:[],
      numero:[],
      depto: [''],
      block: [''],
      poblacion: [''],
      sector: [''],
      region:[],
      comuna: [''],
      referenciaDireccion: [''],
      nna: [''],
      parentesco: [''],
      referenteVictima:[''],
      contoHechos: [''],
      supoHechos: [''],
    })
  }


  denunciantes(): FormArray {
    return this.miFormulario.get("tipoDocumento") as FormArray,
    this.miFormulario.get("numeroDocumento") as FormArray,
    this.miFormulario.get("nombre") as FormArray,
    this.miFormulario.get("nombreSocial") as FormArray,
    this.miFormulario.get("fechaNacimiento") as FormArray,
    this.miFormulario.get("ciudadNacimiento") as FormArray,
    this.miFormulario.get("idioma") as FormArray,
    this.miFormulario.get("nacionalidad") as FormArray,
    this.miFormulario.get("escolaridad") as FormArray,
    this.miFormulario.get("estadoMigratorio") as FormArray,
    this.miFormulario.get("sexoRegistral") as FormArray,
    this.miFormulario.get("identidadGenero") as FormArray,
    this.miFormulario.get("alias") as FormArray,
    this.miFormulario.get("puebloOriginario") as FormArray,
    this.miFormulario.get("profesion") as FormArray,
    this.miFormulario.get("estadoCivil") as FormArray,
    this.miFormulario.get("tipoContacto") as FormArray,
    this.miFormulario.get("telefonoFijo") as FormArray,
    this.miFormulario.get("telefonoMovil") as FormArray,
    this.miFormulario.get("correo") as FormArray,
    this.miFormulario.get("redesSociales") as FormArray,
    this.miFormulario.get("login") as FormArray,
    this.miFormulario.get("tipoDireccion") as FormArray,
    this.miFormulario.get("calle") as FormArray,
    this.miFormulario.get("numero") as FormArray,
    this.miFormulario.get("depto") as FormArray,
    this.miFormulario.get("block") as FormArray,
    this.miFormulario.get("poblacion") as FormArray,
    this.miFormulario.get("sector") as FormArray,
    this.miFormulario.get("region") as FormArray,
    this.miFormulario.get("comuna") as FormArray,
    this.miFormulario.get("referenciaDireccion") as FormArray,
    this.miFormulario.get("nna") as FormArray,
    this.miFormulario.get("parentesco") as FormArray,
    this.miFormulario.get("referenteVictima") as FormArray,
    this.miFormulario.get("contoHechos") as FormArray,
    this.miFormulario.get("supoHechos") as FormArray
  }

  agregarDenunciantes(){
    this.denunciantes().push(this.nuevoDenunciante());
  }

  


}
