import { Denuncia } from "./denuncia";
import { Direccion } from "./direccion";
import { TPCausaDetencion } from "./tp-causa-detencion";
import { TPLugarOcurrencia } from "./tp-lugar-ocurrencia";
import { TPLugarProcedimiento } from "./tp-lugar-procedimiento";
import { TPZonaDelito } from "./tp-zona-delito";

export interface DetalleDenuncia {
    idDetalleDenuncia:    number;
    denuncia:             Denuncia;
    direccion:            Direccion;
    fcIngreso:            Date;
    tpZonaDelito:         TPZonaDelito;
    tpLugarOcurrencia:    TPLugarOcurrencia;
    tpLugarProcedimiento: TPLugarProcedimiento;
    tpCausaDetencion:     TPCausaDetencion;
    nmLugar:              string;
    fcExpiracion:         Date;
    nrRutUsuario:         number;
}
