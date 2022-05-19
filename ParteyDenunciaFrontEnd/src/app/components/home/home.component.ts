import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  ngOnInit(): void {
  }
  
  miFormulario: FormGroup;
  selectedTLugarProcedimiento: string ='';
  isChecked: boolean = true;
  tpParte: any  = [ 'DENUNCIA SIN DETENIDO','DENUNCIA CON DETENIDO'];
  tpConduccion: any = ['Pasa a control de detenccion','No pasa a control de detenccion','En espera de citación fiscalia']
  tpLugarProcedimiento: any = ['Guardia','Borde Costero','Unidad Marítima','Otro']

  constructor(private fb: FormBuilder) {

    this.miFormulario = this.fb.group({
      gobernacion: [],
      unidadPolicial: [],
      parte: [],
      conduccion: [],
      numeroParte: [],
      parteAmpliado: [],
      lugarProcedimiento: [],
      otroLugarProcedimiento: [],
      fechaInicio: [],
      horaInicio:[],
      FechaFin: [],
      horaFin: [],
    })
  }

  // getParteConduccion(){
  //   if(this.miFormulario.get('parte')?.value == 'DENUNCIA SIN DETENIDO'){
  //       this.miFormulario.get('conduccion')?.value == 'En espera de citación fiscalia'
  //   }else{
  //     (this.miFormulario.get('parte')?.value == 'DENUNCIA CON DETENIDO'){
  //       this.miFormulario.get('conduccion')?.value === 'No pasa a control de detenccion'
  //     }
  //   }
  // }
    
}




  

