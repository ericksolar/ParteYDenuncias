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

  desc = '';

  miFormulario: FormGroup;

  tpDelito: any = [ 'ABIGEATO', 'AGRESIÓN CON LESIONES','ALTERACIÓN DEL ORDEN PÚBLICO', 'AMENAZAS', 'AROOJAR PIEDRAS U OBJETOS EN LUGARES PÚBLICOS', 'ATENTADO CONTRA LA AUTORIDAD', 'BAÑISTA TEMERARIO' , 'COHECHO', 'DAÑOS',
                    'FALSIFICACIÓN DE INSTRUMENTO PÚBLICO', 'FEMICIDIO', 'HOMICIDIO', 'HURTO', 'MICROTRÁFICO DE DROGAS', 'OBSTRUCCIÓN A UNA INVESTIGACIÓN', 'OMITIR REGLAS DE HIGIENE Y SALUBRIDAD EN TIEMPOS DE PANDEMIA',
                    'ORDEN JUDICIAL PENDIENTE','PENDENCIA', 'PONER EN RIESGO LA SALUD PÚBLICA' ];

  tpZonaDelito: any  = [ 'Rural','Urbano','Marítimo','Fluvial','Lacustre'];

  regiones: any = ['I Región','II Región','III Región','IV Región','V Región','VI Región','VII Región','VIII Región','IX Región','X Región','XI Región','XII Región','XIII Región','XIV Región','XV Región','XVI Región']

  tpLugarOcurrencia: any = ['Vía Pública', 'Local Comercial','Domicilio Particular','Establecimiento Educacional','A bordo de nave o embarcacion','Interior puerto o terminal','Rampa','Terreno de playa','Artefacto naval','Mar']        

  comunas: any = ['ARICA','CAMARONES','PUTRE','GENERAL LAGOS','IQUIQUE','HUARA','CAMINA','COLCHANE','PICA','POZO ALMONTE','TOCOPILLA','MARIA ELENA','CALAMA','OLLAGUE','SAN PEDRO DE ATACAMA','ANTOFAGASTA']

  constructor(private fb: FormBuilder) {
    this.miFormulario = this.fb.group({
      fecha: [], 
      tipoDelito: [],
      zonaDelito: [],
      TipoLugarOcurrencia: [],
      lugarOcurrencia: [,[Validators.maxLength(250)]],
      calle: [],
      numero: [],
      departamento: [],
      block: [],
      poblacion: [],
      sector: [],
      lugarEspecifico: [],
      region: [],
      comuna: [],
      referencia: [],
      latitud: [],
      longitud: [],
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

  get getRegiones(){
    return [ ...this.regiones ];
  }


}
