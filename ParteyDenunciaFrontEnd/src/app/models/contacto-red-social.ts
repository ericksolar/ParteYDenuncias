import { PersonaParte } from "./persona-parte";
import { TPRedSocial } from "./tp-red-social";

export interface ContactoRedSocial {
    idRedSocial:     number;
    personaParte:    PersonaParte;
    tpRedSocial:     TPRedSocial;
    fcIngreso:       Date;
    glIdentificador: string;
    lgParticular:    boolean;
    fcExpiracion:    Date;
    nrRutUsuario:    number;
}