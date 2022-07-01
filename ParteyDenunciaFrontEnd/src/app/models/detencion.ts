import { Involucrado } from "./involucrado";
import { TPMedioNotificacion } from "./tp-medio-notificacion";

export interface Detencion {
    idDetencion:                 number;
    involucrado:                 Involucrado;
    fcIngreso:                   Date;
    glLugarDetencion:            string;
    fcDetencion:                 Date;
    glNotificaAdultoResponsable: string;
    tpMedioNotificacion:         TPMedioNotificacion;
    fcExpiracion:                Date;
    nrRutUsuario:                number;
}
