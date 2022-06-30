import { Direccion } from "./direccion";
import { TPEstadoMigratorio } from "./tp-estado-migratorio";
import { TPGradoEscolaridad } from "./tp-grado-escolaridad";
import { TPIdentidadGenero } from "./tp-identidad-genero";
import { TPIdioma } from "./tp-idioma";
import { TPPuebloOriginario } from "./tp-pueblo-originario";

export interface PersonaParte {
    idPersonaParte:     number;
    idPersona:          number;
    fcIngreso:          Date;
    direccion:          Direccion;
    glAlias:            string;
    tpEstadoMigratorio: TPEstadoMigratorio;
    tpGradoEscolaridad: TPGradoEscolaridad;
    tpPuebloOriginario: TPPuebloOriginario;
    tpIdioma:           TPIdioma;
    tpIdentidadGenero:  TPIdentidadGenero;
    fcExpiracion:       Date;
    nrRutUsuario:       number;
    nmsocial:           string;
}
