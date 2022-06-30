import { Denuncia } from "./denuncia";
import { TPRolFuncionario } from "./tp-rol-funcionario";

export interface Funcionario {
    idFuncionario:           number;
    denuncia:                Denuncia;
    idPersona:               number;
    lgResponsableDiligencia: boolean;
    fcIngreso:               Date;
    glRolProcedimiento:      string;
    cdGrado:                 number;
    tpRolFuncionario:        TPRolFuncionario;
    fcExpiracion:            Date;
    nrRutUsuario:            number;
}
