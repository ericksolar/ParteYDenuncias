import { Denuncia } from "./denuncia";

// export interface DenunciaReferencia {
//     idDenunciaReferencia: number;
//     denuncia:             Denuncia;
//     denunciaAmpliacion:   Denuncia;
//     fcIngreso:            Date;
//     fcExpiracion:         Date;
//     nrRutUsuario:         number;
// }

export interface DenunciaReferencia {
    idDenunciaReferencia: number;
    fcIngreso:            Date;
    fcExpiracion:         Date;
    nrRutUsuario:         number;
}