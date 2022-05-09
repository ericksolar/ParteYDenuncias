import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-datosgenerales',
  templateUrl: './datosgenerales.component.html',
  styleUrls: ['./datosgenerales.component.css']
})
export class DatosgeneralesComponent implements OnInit {

  ngOnInit(): void {
  }

  tpDelito: any = [ 'ABIGEATO', 'AGRESIÓN CON LESIONES','ALTERACIÓN DEL ORDEN PÚBLICO', 'AMENAZAS', 'AROOJAR PIEDRAS U OBJETOS EN LUGARES PÚBLICOS', 'ATENTADO CONTRA LA AUTORIDAD', 'BAÑISTA TEMERARIO' , 'COHECHO', 'DAÑOS',
                    'FALSIFICACIÓN DE INSTRUMENTO PÚBLICO', 'FEMICIDIO', 'HOMICIDIO', 'HURTO', 'MICROTRÁFICO DE DROGAS', 'OBSTRUCCIÓN A UNA INVESTIGACIÓN', 'OMITIR REGLAS DE HIGIENE Y SALUBRIDAD EN TIEMPOS DE PANDEMIA',
                  'ORDEN JUDICIAL PENDIENTE','PENDENCIA', 'PONER EN RIESGO LA SALUD PÚBLICA' ];
                  
  miFormulario: FormGroup = this.fb.group({
    fecha: [  , [ Validators.required ] ],
    tipoDelito: [  , [ Validators.required ] ],
    zonaDelito: [  , [ Validators.required ] ],
    TipoLugarOcurrencia: [  , [ Validators.required ] ],
    lugarOcurrencia: [  , [ Validators.required ] ],
    calle: [],
    numero: [],
    departamento: [],
    block: [],
    poblacion: [],
    sector: [],
    lugarEspecifico: [],
    region: [  , [ Validators.required ] ],
    comuna: [  , [ Validators.required ] ],
    referencia: [ ],
    latitud: [  , [ Validators.required ] ],
    longitud: [  , [ Validators.required ] ],
  })

  constructor(private fb: FormBuilder) {}


}
