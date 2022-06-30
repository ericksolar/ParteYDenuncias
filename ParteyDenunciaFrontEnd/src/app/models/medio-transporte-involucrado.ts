import { Involucrado } from "./involucrado";
import { MedioTransporte } from "./medio-transporte";
import { TPUsoMedio } from "./tp-uso-medio";

export interface MedioTransporteInvolucrado {
    idMedioTransInvol: number;
    medioTransporte:   MedioTransporte;
    involucrado:       Involucrado;
    tpUsoMedio:        TPUsoMedio;
    fcIngreso:         Date;
    fcExpiracion:      Date;
    nrRutUsuario:      number;
}
