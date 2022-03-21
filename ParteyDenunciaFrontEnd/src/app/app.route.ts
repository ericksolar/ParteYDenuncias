import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { BuscadorComponent } from './components/buscador/buscador.component';
import { DatosgeneralesComponent } from './components/datosgenerales/datosgenerales.component';
import { FuncionariosComponent } from './components/funcionarios/funcionarios.component';

const ROUTES: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'about', component: AboutComponent },
    { path: 'datosgenerales', component: DatosgeneralesComponent },
    { path: 'funcionarios', component: FuncionariosComponent },

    { path: 'buscar/:termino', component: BuscadorComponent },



    { path: '**', pathMatch:'full', redirectTo: 'home' }
];

export const APPROUTING = RouterModule.forRoot(ROUTES);