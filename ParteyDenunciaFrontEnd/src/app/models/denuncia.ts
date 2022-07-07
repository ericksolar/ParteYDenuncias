import { Delito } from "./delito";
import { DenunciaReferencia } from "./denuncia-referencia";
import { DetalleDenuncia } from "./detalle-denuncia";
import { EstadoDenuncia } from "./estado-denuncia";
import { Funcionario } from "./funcionario";
import { InstruccionFiscal } from "./instruccion-fiscal";
import { Involucrado } from "./involucrado";
import { TpDocumento } from "./tp-documento";

// export interface Denuncia {
//     idDenuncia:         number;
//     idInstitucionCargo: number;
//     fcIngreso:          Date;
//     cdReparticion:      number;
//     tpDocumento:        TpDocumento;
//     nrDocumento:        number;
//     fcInicioDenuncia:   Date;
//     fcTerminoDenuncia:  Date;
//     fcExpiracion:       Date;
//     nrRutUsuario:       number;
// }

export interface Denuncia {
    idDenuncia:         number;
    idInstitucionCargo: number;
    fcIngreso:          Date;
    cdReparticion:      number;
    tpDocumento:        TpDocumento;
    funcionario:        Funcionario[];
    estadoDenuncia:     EstadoDenuncia[];
    instruccionFiscal:  InstruccionFiscal[];
    delito:             Delito[];
    detalleDenuncia:    DetalleDenuncia[];
    involucrado:        Involucrado[];
    origenDenuncia:     NDenuncia[];
    ampliacionDenuncia: NDenuncia[];
    nrDocumento:        number;
    fcInicioDenuncia:   Date;
    fcTerminoDenuncia:  Date;
    fcExpiracion:       Date;
    nrRutUsuario:       number;
}