import { Involucrado } from "./involucrado";
import { TPRolImputado } from "./tp-rol-imputado";

export interface RolImputado {
    idRolImputado: number;
    involucrado:   Involucrado;
    tpRolImputado: TPRolImputado;
    fcIngreso:     Date;
    fcExpiracion:  Date;
    nrRutUsuario:  number;
}
