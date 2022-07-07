// import { Involucrado } from "./involucrado";
import { TpRolImputado } from "./tp-rol-imputado";

// export interface RolImputado {
//     idRolImputado: number;
//     involucrado:   Involucrado;
//     tpRolImputado: TpRolImputado;
//     fcIngreso:     Date;
//     fcExpiracion:  Date;
//     nrRutUsuario:  number;
// }

export interface RolImputado {
    idRolImputado: number;
    tpRolImputado: TpRolImputado;
    fcIngreso:     Date;
    fcExpiracion:  Date;
    nrRutUsuario:  number;
}