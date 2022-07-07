import { PersonaParte } from "./persona-parte";
import { TpContactoDenuncia } from "./tp-contacto-denuncia";
import { TpResidencia } from "./tp-residencia";

// export interface Direccion {
//     idDireccion:               number;
//     cdComuna:                  number;
//     glSector:                  string;
//     glBlock:                   string;
//     nmCalle:                   string;
//     nmVillaPoblacion:          string;
//     glNumero:                  string;
//     glReferencia:              string;
//     glDepartamento:            string;
//     nrLatitud:                 number;
//     nrlongitud:                number;
//     tpContactoDenuncia:        TPContactoDenuncia;
//     tpResidencia:              TPResidencia;
//     fcIngreso:                 Date;
//     nmResidenciaInstitucional: string;
//     fcExpiracion:              Date;
//     nrRutUsuario:              number;
// }

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
    tpContactoDenuncia:        TpContactoDenuncia;
    tpResidencia:              TpResidencia;
    personaParte:              PersonaParte[];
    fcIngreso:                 Date;
    nmResidenciaInstitucional: string;
    fcExpiracion:              Date;
    nrRutUsuario:              number;
}