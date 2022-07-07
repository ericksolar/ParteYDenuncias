// import { Denuncia } from "./denuncia";
import { TpEstadoDenuncia } from "./tp-estado-denuncia";

// export interface EstadoDenuncia {
//     idEstadoDenuncia: number;
//     denuncia:         Denuncia;
//     tpEstadoDenuncia: TPEstadoDenuncia;
//     fcIngreso:        Date;
//     fcExpiracion:     Date;
//     nrRutUsuario:     number;
// }

export interface EstadoDenuncia {
    idEstadoDenuncia: number;
    tpEstadoDenuncia: TpEstadoDenuncia;
    fcIngreso:        Date;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}