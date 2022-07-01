import { Denuncia } from "./denuncia";

export interface InstruccionFiscal {
    idInstruccionFiscal: number;
    denuncia:            Denuncia;
    idPersonaFiscal:     number;
    fcIngreso:           Date;
    glInstruccionFiscal: string;
    fcExpiracion:        Date;
    nrRutUsuario:        number;
}
