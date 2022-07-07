import { ContactoRedSocial } from "./contacto-red-social";
// import { Direccion } from "./direccion";
import { TpEstadoMigratorio } from "./tp-estado-migratorio";
import { TpGradoEscolaridad, } from "./tp-grado-escolaridad";
import { TpIdentidadGenero } from "./tp-identidad-genero";
import { TpIdioma } from "./tp-idioma";
import { TpPuebloOriginario } from "./tp-pueblo-originario";

// export interface PersonaParte {
//     idPersonaParte:     number;
//     idPersona:          number;
//     fcIngreso:          Date;
//     direccion:          Direccion;
//     glAlias:            string;
//     tpEstadoMigratorio: TpEstadoMigratorio;
//     tpGradoEscolaridad: TpGradoEscolaridad;
//     tpPuebloOriginario: TpPuebloOriginario;
//     tpIdioma:           TpIdioma;
//     tpIdentidadGenero:  TpIdentidadGenero;
//     fcExpiracion:       Date;
//     nrRutUsuario:       number;
//     nmsocial:           string;
// }

export interface PersonaParte {
    idPersonaParte:     number;
    idPersona:          number;
    fcIngreso:          Date;
    glAlias:            string;
    tpEstadoMigratorio: TpEstadoMigratorio;
    tpGradoEscolaridad: TpGradoEscolaridad;
    tpPuebloOriginario: TpPuebloOriginario;
    tpIdioma:           TpIdioma;
    tpIdentidadGenero:  TpIdentidadGenero;
    contactoRedSocial:  ContactoRedSocial[];
    fcExpiracion:       Date;
    nrRutUsuario:       number;
    nmsocial:           string;
}