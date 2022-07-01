import { Denuncia } from "./denuncia";
import { TPEstadoDenuncia } from "./tp-estado-denuncia";

export interface EstadoDenuncia {
    idEstadoDenuncia: number;
    denuncia:         Denuncia;
    tpEstadoDenuncia: TPEstadoDenuncia;
    fcIngreso:        Date;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}