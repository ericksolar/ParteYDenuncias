import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { BuscadorComponent } from './components/buscador/buscador.component';
import { DatosgeneralesComponent } from './components/datosgenerales/datosgenerales.component';
import { DenuncianteComponent } from './components/denunciante/denunciante.component';
import { FuncionariosComponent } from './components/funcionarios/funcionarios.component';
import { FiscalComponent } from './components/fiscal/fiscal.component';
import { RelatoComponent } from './components/relato/relato.component';
import { DelitoComponent } from './components/delito/delito.component';

import { TestigoComponent } from './components/testigo/testigo.component';

import { ImputadoComponent } from './components/imputado/imputado.component';

import { TransporteComponent } from './components/transporte/transporte.component';
import { VictimaComponent } from './components/victima/victima.component';


const ROUTES: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'about', component: AboutComponent },
    { path: 'datosgenerales', component: DatosgeneralesComponent },
    { path: 'denunciante', component: DenuncianteComponent },
    { path: 'funcionarios', component: FuncionariosComponent },
    { path: 'fiscal', component: FiscalComponent },
    { path: 'relato', component: RelatoComponent },
    { path: 'delito', component: DelitoComponent },
    { path: 'transporte', component: TransporteComponent },
    { path: 'victima', component: VictimaComponent },
    { path: 'funcionarios', component: FuncionariosComponent },
    { path: 'testigo', component: TestigoComponent },
    { path: 'imputado', component: ImputadoComponent },

    { path: 'buscar/:termino', component: BuscadorComponent },



    { path: '**', pathMatch:'full', redirectTo: 'home' }
];

export const APPROUTING = RouterModule.forRoot(ROUTES);