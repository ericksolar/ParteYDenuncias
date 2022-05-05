import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


//Rutas
import {APPROUTING} from './app.route';



//Servicios
//import { HeroesService } from './servicios/heroes.service';




//Componentes
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { BuscadorComponent } from './components/buscador/buscador.component';
import { DatosgeneralesComponent } from './components/datosgenerales/datosgenerales.component';
import { DenuncianteComponent } from './components/denunciante/denunciante.component';
import { DelitoComponent } from './components/delito/delito.component';
import { TransporteComponent } from './components/transporte/transporte.component';
import { VictimaComponent } from './components/victima/victima.component';
import { ImputadoComponent } from './components/imputado/imputado.component';
import { TestigoComponent } from './components/testigo/testigo.component';
import { RelatoComponent } from './components/relato/relato.component';
import { FiscalComponent } from './components/fiscal/fiscal.component';
import { FuncionariosComponent } from './components/funcionarios/funcionarios.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';




@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    BuscadorComponent,
    HomeComponent,
    DatosgeneralesComponent,
    DenuncianteComponent,
    DelitoComponent,
    TransporteComponent,
    VictimaComponent,
    ImputadoComponent,
    TestigoComponent,
    RelatoComponent,
    FiscalComponent,
    FuncionariosComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    APPROUTING
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


