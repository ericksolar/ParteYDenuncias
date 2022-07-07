// import { Involucrado } from "./involucrado";
import { TpEstadoPersona } from "./tp-estado-persona";

// export interface EstadoInvolucrado {
//     idEstadoInvolucrado: number;
//     involucrado:         Involucrado;
//     tpEstadoPersona:     TPEstadoPersona;
//     fcIngreso:           Date;
//     fcExpiracion:        Date;
//     nrRutUsuario:        number;
// }

export interface EstadoInvolucrado {
    idEstadoInvolucrado: number;
    tpEstadoPersona:     TpEstadoPersona;
    fcIngreso:           Date;
    fcExpiracion:        Date;
    nrRutUsuario:        number;
}