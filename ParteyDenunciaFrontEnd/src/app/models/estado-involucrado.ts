import { Involucrado } from "./involucrado";
import { TPEstadoPersona } from "./tp-estado-persona";

export interface EstadoInvolucrado {
    idEstadoInvolucrado: number;
    involucrado:         Involucrado;
    tpEstadoPersona:     TPEstadoPersona;
    fcIngreso:           Date;
    fcExpiracion:        Date;
    nrRutUsuario:        number;
}
