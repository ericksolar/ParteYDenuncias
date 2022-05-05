import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-denunciante',
  templateUrl: './denunciante.component.html',
  styleUrls: ['./denunciante.component.css']
})
export class DenuncianteComponent implements OnInit {



  ngOnInit(): void {
  }

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

  constructor(private fb: FormBuilder) {
    // this.miFormulario.controls['tipoDocumento'].setValue(this.default, {onlySelf: true});
  }

  campoValido(campo: string){
    return this.miFormulario.controls[campo].errors 
            && this.miFormulario.controls[campo].touched;
  }

  // checkRdesSociales(){
  //   if(this.miFormulario.controls['sexoRegistral'].value == 'option2'){
  //     this.miFormulario.get('login').disabled();
  //   }
  // }


}
