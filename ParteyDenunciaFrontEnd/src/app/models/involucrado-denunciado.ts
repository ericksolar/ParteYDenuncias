// import { Involucrado } from "./involucrado";
import { TpRelacion } from "./tp-relacion";

// export interface InvolucradoDenunciado {
//     idInvolucradoDenunciado: number;
//     involucrado:             Involucrado;
//     denunciadoInvolucrado:   Involucrado;
//     fcIngreso:               Date;
//     tpRelacion:              TPRelacion;
//     glDescripcionDenunciado: string;
//     lgConoceDenunciado:      boolean;
//     fcExpiracion:            Date;
//     nrRutUsuario:            number;
// }

export interface InvolucradoDenunciado{
    idInvolucradoDenunciado: number;
    fcIngreso:               Date;
    tpRelacion:              TpRelacion;
    glDescripcionDenunciado: string;
    lgConoceDenunciado:      boolean;
    fcExpiracion:            Date;
    nrRutUsuario:            number;
}
