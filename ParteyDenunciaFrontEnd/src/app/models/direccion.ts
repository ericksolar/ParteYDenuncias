import { TPContactoDenuncia } from "./tp-contacto-denuncia";
import { TPResidencia } from "./tp-residencia";

export interface Direccion {
    idDireccion:               number;
    cdComuna:                  number;
    glSector:                  string;
    glBlock:                   string;
    nmCalle:                   string;
    nmVillaPoblacion:          string;
    glNumero:                  string;
    glReferencia:              string;
    glDepartamento:            string;
    nrLatitud:                 number;
    nrlongitud:                number;
    tpContactoDenuncia:        TPContactoDenuncia;
    tpResidencia:              TPResidencia;
    fcIngreso:                 Date;
    nmResidenciaInstitucional: string;
    fcExpiracion:              Date;
    nrRutUsuario:              number;
}