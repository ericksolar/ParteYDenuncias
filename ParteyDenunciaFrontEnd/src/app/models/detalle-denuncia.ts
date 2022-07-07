import { Denuncia } from "./denuncia";
import { Direccion } from "./direccion";
import { TpCausaDetencion } from "./tp-causa-detencion";
import { TpLugarOcurrencia } from "./tp-lugar-ocurrencia";
import { TpLugarProcedimiento } from "./tp-lugar-procedimiento";
import { TpZonaDelito } from "./tp-zona-delito";

// export interface DetalleDenuncia {
//     idDetalleDenuncia:    number;
//     denuncia:             Denuncia;
//     direccion:            Direccion;
//     fcIngreso:            Date;
//     tpZonaDelito:         TPZonaDelito;
//     tpLugarOcurrencia:    TPLugarOcurrencia;
//     tpLugarProcedimiento: TPLugarProcedimiento;
//     tpCausaDetencion:     TPCausaDetencion;
//     nmLugar:              string;
//     fcExpiracion:         Date;
//     nrRutUsuario:         number;
// }

export interface DetalleDenuncia {
    idDetalleDenuncia:    number;
    direccion:            Direccion;
    fcIngreso:            Date;
    tpZonaDelito:         TpZonaDelito;
    tpLugarOcurrencia:    TpLugarOcurrencia;
    tpLugarProcedimiento: TpLugarProcedimiento;
    tpCausaDetencion:     TpCausaDetencion;
    nmLugar:              string;
    fcExpiracion:         Date;
    nrRutUsuario:         number;
}