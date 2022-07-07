import { TpFiscalia } from "./tp-fiscalia";

export interface Fiscalia {
    idFiscalia:   number;
    parent?:      Fiscalia;
    tpFiscalia:   TpFiscalia;
    nmFiscalia:   string;
    tpComuna:     number;
    fcIngreso:    Date;
    glDireccion:  string;
    nrFono:       number;
    fcExpiracion: Date;
}