import { Component, OnInit , AfterContentInit} from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { TPConduccion } from 'src/app/models/tp-conduccion';
import { TpConduccionService } from 'src/app/servicios/tp-conduccion.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  miFormulario: FormGroup;
  selectedTLugarProcedimiento: string ='';
  isChecked: boolean = true;
  tpParte: any  = [ 'DENUNCIA SIN DETENIDO','DENUNCIA CON DETENIDO'];
  // tpConduccion: any = ['Pasa a control de detenccion','No pasa a control de detenccion','En espera de citación fiscalia']
  tpLugarProcedimiento: any = ['Guardia','Borde Costero','Unidad Marítima','Otro']
  tpConduccion: TPConduccion[] | undefined;

  constructor(private fb: FormBuilder, private tpConduccionService: TpConduccionService) {

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


  ngOnInit(): void {
    this.start();
  }

  start(){
    this.tpConduccionService.getAllTpConduccion().subscribe(data =>{
      this.tpConduccion =  data;
      console.log(data);
    })
  }

  // getAllTpConduccion(){
  //   this.tpConduccionService.getAllTpConduccion().subscribe(data =>{
  //     this.tpConduccion = data;
  //     console.log(data);

  //   })
  // }

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




  

