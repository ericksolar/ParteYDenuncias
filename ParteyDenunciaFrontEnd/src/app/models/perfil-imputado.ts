// import { Involucrado } from "./involucrado";
import { TpPerfil } from "./tp-perfil";

// export interface PerfilImputado {
//     idPerfilImputado: number;
//     involucrado:      Involucrado;
//     tpPerfil:         TpPerfil;
//     fcIngreso:        Date;
//     fcExpiracion:     Date;
//     nrRutUsuario:     number;
// }

export interface PerfilImputado {
    idPerfilImputado: number;
    tpPerfil:         TpPerfil;
    fcIngreso:        Date;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}