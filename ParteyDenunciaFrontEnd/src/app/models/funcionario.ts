import { Denuncia } from "./denuncia";
import { NarracionDenuncia } from "./narracion-denuncia";
import { TpRolFuncionario } from "./tp-rol-funcionario";

// export interface Funcionario {
//     idFuncionario:           number;
//     denuncia:                Denuncia;
//     idPersona:               number;
//     lgResponsableDiligencia: boolean;
//     fcIngreso:               Date;
//     glRolProcedimiento:      string;
//     cdGrado:                 number;
//     tpRolFuncionario:        TPRolFuncionario;
//     fcExpiracion:            Date;
//     nrRutUsuario:            number;
// }

export interface Funcionario {
    idFuncionario:           number;
    tpRolFuncionario:        TpRolFuncionario;
    narracionDenuncia:       NarracionDenuncia[];
    idPersona:               number;
    lgResponsableDiligencia: boolean;
    fcIngreso:               Date;
    glRolProcedimiento:      string;
    cdGrado:                 number;
    fcExpiracion:            Date;
    nrRutUsuario:            number;
}