// import { MedioTransporte } from "./medio-transporte";

// export interface EventoMedioTransporte {
//     idEventoMedioTransporte: number;
//     medioTransporte:         MedioTransporte;
//     idEvento:                number;
//     nrLatitudPosat:          number;
//     nrLongitudPosat:         number;
//     fcExpiracion:            Date;
//     nrRutUsuario:            number;
// }

export interface EventoMedioTransporte {
    idEventoMedioTransporte: number;
    idEvento:                number;
    nrLatitudPosat:          number;
    nrLongitudPosat:         number;
    fcExpiracion:            Date;
    nrRutUsuario:            number;
}