// import { Involucrado } from "./involucrado";
import { TpConduccion } from "./tp-conduccion";
import { TpSituacionDenuncia } from "./tp-situacion-denuncia";

// export interface DetalleImputado {
//     idDetalleImputado:   number;
//     involucrado:         Involucrado;
//     fcIngreso:           Date;
//     tpSituacionDenuncia: TPSituacionDenuncia;
//     lgValidaIdentidad:   boolean;
//     lgIdentidadPositiva: boolean;
//     tpConduccion:        TPConduccion;
//     glLesiones:          string;
//     fcExpiracion:        Date;
//     nrRutUsuario:        number;
// }

export interface DetalleImputado {
    idDetalleImputado:   number;
    fcIngreso:           Date;
    tpSituacionDenuncia: TpSituacionDenuncia;
    lgValidaIdentidad:   boolean;
    lgIdentidadPositiva: boolean;
    tpConduccion:        TpConduccion;
    glLesiones:          string;
    fcExpiracion:        Date;
    nrRutUsuario:        number;
}

