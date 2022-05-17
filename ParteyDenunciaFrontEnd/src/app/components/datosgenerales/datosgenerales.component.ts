import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

interface TPZonaDelito {
  CDTPZonaDelito: number;
  NMZonaDelito: string;
}


@Component({
  selector: 'app-datosgenerales',
  templateUrl: './datosgenerales.component.html',
  styleUrls: ['./datosgenerales.component.css']
})
export class DatosgeneralesComponent implements OnInit {

  ngOnInit(): void {
  }

  miFormulario: FormGroup;

  tpDelito: any = [ 'ABIGEATO', 'AGRESIÓN CON LESIONES','ALTERACIÓN DEL ORDEN PÚBLICO', 'AMENAZAS', 'AROOJAR PIEDRAS U OBJETOS EN LUGARES PÚBLICOS', 'ATENTADO CONTRA LA AUTORIDAD', 'BAÑISTA TEMERARIO' , 'COHECHO', 'DAÑOS',
                    'FALSIFICACIÓN DE INSTRUMENTO PÚBLICO', 'FEMICIDIO', 'HOMICIDIO', 'HURTO', 'MICROTRÁFICO DE DROGAS', 'OBSTRUCCIÓN A UNA INVESTIGACIÓN', 'OMITIR REGLAS DE HIGIENE Y SALUBRIDAD EN TIEMPOS DE PANDEMIA',
                  'ORDEN JUDICIAL PENDIENTE','PENDENCIA', 'PONER EN RIESGO LA SALUD PÚBLICA' ];

  tpZonaDelito: any  = [ 'Rural','Urbano','Marítimo','Fluvial','Lacustre'];

  // console.log(tpZonaDelito[0]);

  constructor(private fb: FormBuilder) {
    this.miFormulario = this.fb.group({
      fecha: [ , [ Validators.required ] ],
      tipoDelito: [ , [ Validators.required ] ],
      zonaDelito: [],
      TipoLugarOcurrencia: [ , [ Validators.required ] ],
      lugarOcurrencia: [ , [ Validators.required ] ],
      calle: [],
      numero: [{disabled: true} ],
      departamento: [],
      block: [],
      poblacion: [],
      sector: [],
      lugarEspecifico: [ , [ Validators.maxLength(3000)]],
      region: [  , [ Validators.required ] ],
      comuna: [  , [ Validators.required ] ],
      referencia: [],
      latitud: [  ,[ Validators.required ] ],
      longitud: [  ,[ Validators.required ] ],
    })
  }


  campoValido(campo: string){
    return this.miFormulario.controls[campo].errors 
            && this.miFormulario.controls[campo].touched;
  }
    
  get TPZonaDelito(){
    return this.miFormulario.get('zonaDelito');
  }

  cambiarTPZonaDelito(e:any){
    this.miFormulario.controls['zonaDelito'].setValue(e.target.value, {
      onlySelf: true
      })
    
  }

  get TPtipoDelito(){
    return this.miFormulario.get('tipoDelito');
  }

}
