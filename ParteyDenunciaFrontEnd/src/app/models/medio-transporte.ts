import { EventoMedioTransporte } from "./evento-medio-transporte";
import { TpMedioTransporte } from "./tp-medio-transporte";
import { TpUsoMedio } from "./tp-uso-medio";

// export interface MedioTransporte {
//     idMedioTransporte: number;
//     fcIngreso:         Date;
//     tpUsoMedio:        TPUsoMedio;
//     tpMedioTransporte: TPMedioTransporte;
//     idMovil:           number;
//     lgEncargoRobo:     boolean;
//     lgIncautado:       boolean;
//     lgPortaPatente:    boolean;
//     glNroEncargoRobo:  string;
//     glPatente:         string;
//     glMarca:           string;
//     glModelo:          string;
//     glColor:           string;
//     glPeaje:           string;
//     glAutopista:       string;
//     glObservacion:     string;
//     fcExpiracion:      Date;
//     nrRutUsuario:      number;
// }

export interface MedioTransporte {
    idMedioTransporte:     number;
    fcIngreso:             Date;
    tpUsoMedio:            TpUsoMedio;
    tpMedioTransporte:     TpMedioTransporte;
    eventoMedioTransporte: EventoMedioTransporte;
    idMovil:               number;
    lgEncargoRobo:         boolean;
    lgIncautado:           boolean;
    lgPortaPatente:        boolean;
    glNroEncargoRobo:      string;
    glPatente:             string;
    glMarca:               string;
    glModelo:              string;
    glColor:               string;
    glPeaje:               string;
    glAutopista:           string;
    glObservacion:         string;
    fcExpiracion:          Date;
    nrRutUsuario:          number;
}