import { Involucrado } from "./involucrado";
import { TPConduccion } from "./tp-conduccion";
import { TPSituacionDenuncia } from "./tp-situacion-denuncia";

export interface DetalleImputado {
    idDetalleImputado:   number;
    involucrado:         Involucrado;
    fcIngreso:           Date;
    tpSituacionDenuncia: TPSituacionDenuncia;
    lgValidaIdentidad:   boolean;
    lgIdentidadPositiva: boolean;
    tpConduccion:        TPConduccion;
    glLesiones:          string;
    fcExpiracion:        Date;
    nrRutUsuario:        number;
}
