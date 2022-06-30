import { Involucrado } from "./involucrado";
import { TPPerfil } from "./tp-perfil";

export interface PerfilImputado {
    idPerfilImputado: number;
    involucrado:      Involucrado;
    tpPerfil:         TPPerfil;
    fcIngreso:        Date;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}
