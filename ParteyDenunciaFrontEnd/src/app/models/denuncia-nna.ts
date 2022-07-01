import { Involucrado } from "./involucrado";
import { TpNNA } from "./tp-nna";
import { TPRelacion } from "./tp-relacion";

export interface DenunciaNNA {
    idDenunciaNNA:     number;
    involucrado:       Involucrado;
    idAdultoProtector: number;
    fcIngreso:         Date;
    tpNNA:             TpNNA;
    tpRelacion:        TPRelacion;
    lgAdultoProtector: boolean;
    glPersonaRelata:   string;
    glConoceHechos:    string;
    fcExpiracion:      Date;
    nrRutUsuario:      number;
}
