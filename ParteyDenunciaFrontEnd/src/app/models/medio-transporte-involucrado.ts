// import { Involucrado } from "./involucrado";
import { MedioTransporte } from "./medio-transporte";
import { TpUsoMedio } from "./tp-uso-medio";

// export interface MedioTransporteInvolucrado {
//     idMedioTransInvol: number;
//     medioTransporte:   MedioTransporte;
//     involucrado:       Involucrado;
//     tpUsoMedio:        TPUsoMedio;
//     fcIngreso:         Date;
//     fcExpiracion:      Date;
//     nrRutUsuario:      number;
// }

export interface MedioTransporteInvolucrado {
    idMedioTransInvol: number;
    medioTransporte:   MedioTransporte;
    tpUsoMedio:        TpUsoMedio;
    fcIngreso:         Date;
    fcExpiracion:      Date;
    nrRutUsuario:      number;
}
