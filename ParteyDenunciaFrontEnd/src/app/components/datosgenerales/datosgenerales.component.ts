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

  tpDelito: any[] = [ 'ABIGEATO', 'AGRESIÓN CON LESIONES','ALTERACIÓN DEL ORDEN PÚBLICO', 'AMENAZAS', 'AROOJAR PIEDRAS U OBJETOS EN LUGARES PÚBLICOS', 'ATENTADO CONTRA LA AUTORIDAD', 'BAÑISTA TEMERARIO' , 'COHECHO', 'DAÑOS',
                    'FALSIFICACIÓN DE INSTRUMENTO PÚBLICO', 'FEMICIDIO', 'HOMICIDIO', 'HURTO', 'MICROTRÁFICO DE DROGAS', 'OBSTRUCCIÓN A UNA INVESTIGACIÓN', 'OMITIR REGLAS DE HIGIENE Y SALUBRIDAD EN TIEMPOS DE PANDEMIA',
                  'ORDEN JUDICIAL PENDIENTE','PENDENCIA', 'PONER EN RIESGO LA SALUD PÚBLICA' ];

  tpZonaDelito: TPZonaDelito[]  = [ 
    { CDTPZonaDelito: 1, NMZonaDelito:'Rural'},{CDTPZonaDelito: 2, NMZonaDelito:'Urbano'},{CDTPZonaDelito: 3, NMZonaDelito:'Marítimo'},
    { CDTPZonaDelito: 4, NMZonaDelito:'Fluvial'},{CDTPZonaDelito: 5, NMZonaDelito:'Lacustre'}];


  // console.log(tpZonaDelito[0]);

  miFormulario: FormGroup = this.fb.group({
    fecha: [ , [ Validators.required ] ],
    tipoDelito: [ , [ Validators.required ] ],
    zonaDelito: [  , [ Validators.required ] ],
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

  constructor(private fb: FormBuilder) {}

  seleccionarDelito(){}

  campoValido(campo: string){
    return this.miFormulario.controls[campo].errors 
            && this.miFormulario.controls[campo].touched;
  }
    

  onChanges(){
    this.miFormulario.get('')
  }

}
