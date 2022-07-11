import { TpFiscalia } from "./tp-fiscalia";

export interface Fiscalia {
    idFiscalia:   number;
    fiscalia?:      Fiscalia;
    tpFiscalia:   TpFiscalia;
    nmFiscalia:   string;
    tpComuna:     number;
    fcIngreso:    Date;
    glDireccion:  string;
    nrFono:       number;
    fcExpiracion: Date;
}