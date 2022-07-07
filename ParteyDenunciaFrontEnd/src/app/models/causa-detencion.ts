// import { Detencion } from "./detencion";
import { TpCausaDetencion } from "./tp-causa-detencion";
// import { TpCausaDetencion } from "./tp-causa-detencion";

// export interface CausaDetencion {
//     idCausaDetencion: number;
//     detencion:        Detencion;
//     tpCausaDetencion: TpCausaDetencion;
//     glDetalle:        string;
//     fcExpiracion:     Date;
//     nrRutUsuario:     number;
// }

export interface CausaDetencion {
    idCausaDetencion: number;
    tpCausaDetencion: TpCausaDetencion;
    glDetalle:        string;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}