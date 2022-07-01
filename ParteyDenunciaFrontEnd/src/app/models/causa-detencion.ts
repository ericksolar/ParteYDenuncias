import { Detencion } from "./detencion";
import { TPCausaDetencion } from "./tp-causa-detencion";

export interface CausaDetencion {
    idCausaDetencion: number;
    detencion:        Detencion;
    tpCausaDetencion: TPCausaDetencion;
    glDetalle:        string;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}
