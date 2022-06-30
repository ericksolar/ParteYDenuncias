import { Involucrado } from "./involucrado";
import { TPRelacion } from "./tp-relacion";

export interface InvolucradoDenunciado {
    idInvolucradoDenunciado: number;
    involucrado:             Involucrado;
    denunciadoInvolucrado:   Involucrado;
    fcIngreso:               Date;
    tpRelacion:              TPRelacion;
    glDescripcionDenunciado: string;
    lgConoceDenunciado:      boolean;
    fcExpiracion:            Date;
    nrRutUsuario:            number;
}


