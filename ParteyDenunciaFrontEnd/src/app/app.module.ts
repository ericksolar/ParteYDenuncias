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




@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    BuscadorComponent,
    HomeComponent,
    DatosgeneralesComponent
  ],
  imports: [
    BrowserModule,
    APPROUTING
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


