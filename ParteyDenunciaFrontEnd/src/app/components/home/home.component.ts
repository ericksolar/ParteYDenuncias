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

  

  constructor(private fb: FormBuilder) {

    this.miFormulario = this.fb.group({
      gobernacion: [],
      unidadPolicial: [],
      parte: [],
      conduccion: [],
      numeroParte: [],
      parteAmpliado: [],
      lugarProcedimiento: [],
      fechaInicio: [],
      horaInicio:[],
      FechaFin: [],
      horaFin: [],
    })
    
  }




  





}
