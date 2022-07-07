import { CausaDetencion } from "./causa-detencion";
// import { Involucrado } from "./involucrado";
import { TpMedioNotificacion } from "./tp-medio-notificacion";

// export interface Detencion {
//     idDetencion:                 number;
//     involucrado:                 Involucrado;
//     fcIngreso:                   Date;
//     glLugarDetencion:            string;
//     fcDetencion:                 Date;
//     glNotificaAdultoResponsable: string;
//     tpMedioNotificacion:         TPMedioNotificacion;
//     fcExpiracion:                Date;
//     nrRutUsuario:                number;
// }

export interface Detencion {
    idDetencion:                 number;
    tpMedioNotificacion:         TpMedioNotificacion;
    causaDetencion:              CausaDetencion[];
    fcIngreso:                   Date;
    glLugarDetencion:            string;
    fcDetencion:                 Date;
    glNotificaAdultoResponsable: string;
    fcExpiracion:                Date;
    nrRutUsuario:                number;
}

