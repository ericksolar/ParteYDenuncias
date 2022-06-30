import { Funcionario } from "./funcionario";
import { Involucrado } from "./involucrado";

export interface NarracionDenuncia {
    idNarracion:       number;
    funcionario:       Funcionario;
    involucrado:       Involucrado;
    fcIngreso:         Date;
    glNarracionHechos: string;
    fcExpiracion:      Date;
    nrRutUsuario:      number;
}
