import { Denuncia } from "./denuncia";
import { TPGradoEjecucion } from "./tp-grado-ejecucion";

export interface Delito {
    idDelito:         number;
    denuncia:         Denuncia;
    tpGradoEjecucion: TPGradoEjecucion;
    fcIngreso:        Date;
    glModusOperandi:  string;
    lgLesionados:     boolean;
    lgFallecidos:     boolean;
    fcExpiracion:     Date;
    nrRutUsuario:     number;
}
