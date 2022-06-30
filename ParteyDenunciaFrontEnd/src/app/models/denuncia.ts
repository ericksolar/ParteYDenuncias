import { TpDocumento } from "./tp-documento";

export interface Denuncia {
    idDenuncia:         number;
    idInstitucionCargo: number;
    fcIngreso:          Date;
    cdReparticion:      number;
    tpDocumento:        TpDocumento;
    nrDocumento:        number;
    fcInicioDenuncia:   Date;
    fcTerminoDenuncia:  Date;
    fcExpiracion:       Date;
    nrRutUsuario:       number;
}
