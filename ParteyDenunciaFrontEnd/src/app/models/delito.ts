import { Denuncia } from "./denuncia";
import { TpGradoEjecucion } from "./tp-grado-ejecucion";

// export interface Delito {
//     idDelito:         number;
//     denuncia:         Denuncia;
//     tpGradoEjecucion: TPGradoEjecucion;
//     fcIngreso:        Date;
//     glModusOperandi:  string;
//     lgLesionados:     boolean;
//     lgFallecidos:     boolean;
//     fcExpiracion:     Date;
//     nrRutUsuario:     number;
// }

export interface Delito {
    idDelito:         number;
    tpGradoEjecucion: TpGradoEjecucion;
    fcIngreso:        Date;
    glModusOperandi:  string;
    lgLesionados:     boolean;
    lgFallecidos:     boolean;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}