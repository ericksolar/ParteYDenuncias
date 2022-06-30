import { Denuncia } from "./denuncia";
import { Direccion } from "./direccion";
import { TPContactoDenuncia } from "./tp-contacto-denuncia";
import { TPInvolucrado } from "./tp-involucrado";
import { TPSituacionConvivencia } from "./tp-situacion-convivencia";

export interface Involucrado {
    idInvolucrado:          number;
    idPersonaParte:         number;
    denuncia:               Denuncia;
    direccion:              Direccion;
    tpContactoDenuncia:     TPContactoDenuncia;
    tpSituacionConvivencia: TPSituacionConvivencia;
    tpInvolucrado:          TPInvolucrado;
    fcIngreso:              Date;
    glDetalleLesiones:      string;
    glOtrosTestigos:        string;
    glPruebaHechos:         string;
    fcExpiracion:           Date;
    nrRutUsuario:           number;
}
