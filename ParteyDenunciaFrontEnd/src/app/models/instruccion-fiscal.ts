import { Denuncia } from "./denuncia";
import { Fiscalia } from "./fiscalia";

// export interface InstruccionFiscal {
//     idInstruccionFiscal: number;
//     denuncia:            Denuncia;
//     idPersonaFiscal:     number;
//     fcIngreso:           Date;
//     glInstruccionFiscal: string;
//     fcExpiracion:        Date;
//     nrRutUsuario:        number;
// }

export interface InstruccionFiscal {
    idInstruccionFiscal: number;
    fiscalia:            Fiscalia;
    idPersonaFiscal:     number;
    fcIngreso:           Date;
    glInstruccionFiscal: string;
    fcExpiracion:        Date;
    nrRutUsuario:        number;
}