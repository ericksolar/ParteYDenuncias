-- TPZonaDelito
insert into TPZonaDelito (NMZonaDelito) values ('Rural');
insert into TPZonaDelito (NMZonaDelito) values ('Urbano');
insert into TPZonaDelito (NMZonaDelito) values ('Maritimo');
insert into TPZonaDelito (NMZonaDelito) values ('Fluvial');
insert into TPZonaDelito (NMZonaDelito) values ('Lacustre');

--TPUsoMedio
insert into TPUsoMedio (GLTPUsoMedio) values ('LLegada ');
insert into TPUsoMedio (GLTPUsoMedio) values ('Huida ');

--TPSituacionDenuncia
insert into TPSituacionDenuncia (GLTPSituacion) values ('Denuncia con detenidos');
insert into TPSituacionDenuncia (GLTPSituacion) values ('Denuncia sin detenidos');

--TPSituacionConvivencia
insert into TPSituacionConvivencia (GLTPSituacionConvivencia) values ('Vive con la Mama');
insert into TPSituacionConvivencia (GLTPSituacionConvivencia) values ('Vive con el Papa');
insert into TPSituacionConvivencia (GLTPSituacionConvivencia) values ('Vive con Tios/as');
insert into TPSituacionConvivencia (GLTPSituacionConvivencia) values ('Vive con abuelos');

--TPRolImputado
insert into TPRolImputado (GLTPRolImputado) values ( 'Toma parte en la ejecucion');
insert into TPRolImputado (GLTPRolImputado) values ('Fuerza o induce a otro');
insert into TPRolImputado (GLTPRolImputado) values ('Facilita los medios');
insert into TPRolImputado (GLTPRolImputado) values ('Lo presencian sin tomar parte inmediata en él');

--TPRolFuncionario
insert into TPRolFuncionario (GLTPRolFuncionario) values ('Testigo');
insert into TPRolFuncionario (GLTPRolFuncionario) values ('Aprehensor');

--TPResidencia
insert into TPResidencia (GLTPResidencia) values ( 'Particular');
insert into TPResidencia (GLTPResidencia) values ('Institucional');
insert into TPResidencia (GLTPResidencia) values ('Situacion de Calle');

--TPRelacion
insert into TPRelacion (GLTPRelacion) values ('Sin Relacion');
insert into TPRelacion (GLTPRelacion) values ('Padre');
insert into TPRelacion (GLTPRelacion) values ('Madre');
insert into TPRelacion (GLTPRelacion) values ('Hermano/a');
insert into TPRelacion (GLTPRelacion) values ('Tio/a');
insert into TPRelacion (GLTPRelacion) values ('Abuelo/a');
insert into TPRelacion (GLTPRelacion) values ('Primo/a');
insert into TPRelacion (GLTPRelacion) values ('Vecino/a');
insert into TPRelacion (GLTPRelacion) values ('Amigo/a');

--TPRedSocial
insert into TPRedSocial (GLTPRedSocial) values ('Twitter');
insert into TPRedSocial (GLTPRedSocial) values ('Facebook');
insert into TPRedSocial (GLTPRedSocial) values ('Instagram');
insert into TPRedSocial (GLTPRedSocial) values ('Tegram');
insert into TPRedSocial (GLTPRedSocial) values ('VK');

--TPPuebloOriginario
insert into TPPuebloOriginario (GLTPPuebloOriginario) values ('No Pertenece');
insert into TPPuebloOriginario (GLTPPuebloOriginario) values ('Mapuche');

--TPPerfil
insert into TPPerfil (GLTPPerfil) values ('Violento');
insert into TPPerfil (GLTPPerfil) values ('Pasivo');
insert into TPPerfil (GLTPPerfil) values ('Con orden de detencion');
insert into TPPerfil (GLTPPerfil) values ('Sin Orden de detencion');
insert into TPPerfil (GLTPPerfil) values ('Con medidas cautelares vigentes');
insert into TPPerfil (GLTPPerfil) values ('Sin medidas cautelares vigentes');

--TPNNA
insert into TPNNA (GLTPNNA) values ('Niño');
insert into TPNNA (GLTPNNA) values ('Niña');
insert into TPNNA (GLTPNNA) values ('Adolescente');

--TPMedioTransporte
insert into TPMedioTransporte (GLTPMedioTransporte) values ('A pie');
insert into TPMedioTransporte (GLTPMedioTransporte) values ('Vehiculo ');
insert into TPMedioTransporte (GLTPMedioTransporte) values ('Embarcacion');

--TPMedioNotificacion
insert into TPMedioNotificacion (GLTPMedioNotificacion) values ('Telefónica');
insert into TPMedioNotificacion (GLTPMedioNotificacion) values ('Presencial');
insert into TPMedioNotificacion (GLTPMedioNotificacion) values ('Correo electrónico');

--TPLugarProcedimiento
insert into TPLugarProcedimiento (GLTPLugarProcedimiento) values ('Guardia');
insert into TPLugarProcedimiento (GLTPLugarProcedimiento) values ('Borde Costero');
insert into TPLugarProcedimiento (GLTPLugarProcedimiento) values ('Unidad Marítima');

--TPLugarOcurrencia
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('Via Publica');
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('Local Comercial');
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('Domicilio Particular');
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('Establecimiento Educacional');
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('A bordo de Embarcación');
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('Interior recinto portuario');
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('Rampa');
insert into TPLugarOcurrencia (GLLugarOcurrencia) values ('Borde Costero');

--TPInvolucrado
insert into TPInvolucrado (GLTPInvolucrado) values ('Victima');
insert into TPInvolucrado (GLTPInvolucrado) values ('Testigo');
insert into TPInvolucrado (GLTPInvolucrado) values ('Denunciante');
insert into TPInvolucrado (GLTPInvolucrado) values ('Imputado');

--TPIdioma
insert into TPIdioma (GLTPIdioma) values ('Ingles');
insert into TPIdioma (GLTPIdioma) values ('Frances');
insert into TPIdioma (GLTPIdioma) values ('Aleman');
insert into TPIdioma (GLTPIdioma) values ('Español');

--TPIdentidadGenero
insert into TPIdentidadGenero (GLTPIdentidadGenero) values ('Hombre');
insert into TPIdentidadGenero (GLTPIdentidadGenero) values ('Mujer');

--TPGradoEscolaridad
insert into TPGradoEscolaridad (GLTPGradoEscolaridad) values ('Sin Estudios');
insert into TPGradoEscolaridad (GLTPGradoEscolaridad) values ('Educacion Basica');
insert into TPGradoEscolaridad (GLTPGradoEscolaridad) values ('Educacion Secundaria');
insert into TPGradoEscolaridad (GLTPGradoEscolaridad) values ('Educacion Secundaria Incompleta');
insert into TPGradoEscolaridad (GLTPGradoEscolaridad) values ('Educacion Universitaria');

--TPGradoEjecucion
insert into TPGradoEjecucion (GLTPDelito) values ('Tentado');
insert into TPGradoEjecucion (GLTPDelito) values ('Frustrado');
insert into TPGradoEjecucion (GLTPDelito) values ('Consumado');

--TPFiscalia
insert into TPFiscalia (GLTPFiscalia) values ('Local');
insert into TPFiscalia (GLTPFiscalia) values ('Regional');

--TPEstadoPersona
insert into TPEstadoPersona (GLTPEstadoPersona) values (1'Vivo/a');
insert into TPEstadoPersona (GLTPEstadoPersona) values ('Fallecido/a');
insert into TPEstadoPersona (GLTPEstadoPersona) values ('Presenta Halito alcoholico');
insert into TPEstadoPersona (GLTPEstadoPersona) values ('Inestabilidad al caminar');
insert into TPEstadoPersona (GLTPEstadoPersona) values ('Rostro Congestionado');
insert into TPEstadoPersona (GLTPEstadoPersona) values ('Incoherencia al hablar');
insert into TPEstadoPersona (GLTPEstadoPersona) values ('Presenta Lesiones');

--TPEstadoMigratorio
insert into TPEstadoMigratorio (GLTPEstadoMigratorio) values ('Sin Informacion');
insert into TPEstadoMigratorio (GLTPEstadoMigratorio) values ('Permanencia Transitoria');
insert into TPEstadoMigratorio (GLTPEstadoMigratorio) values ('Residente Temporal');
insert into TPEstadoMigratorio (GLTPEstadoMigratorio) values ('Residente Oficial');
insert into TPEstadoMigratorio (GLTPEstadoMigratorio) values ('Residente Definitivo');

--TPEstadoDenuncia
insert into TPEstadoDenuncia (GLTPEstadoDenuncia) values ('Borrador');
insert into TPEstadoDenuncia (GLTPEstadoDenuncia) values ('Cerrado');

--TPDocumento
insert into TPDocumento (GLTPDocumento) values ('Folio');
insert into TPDocumento (GLTPDocumento) values ('Parte');
insert into TPDocumento (GLTPDocumento) values ('RUC');
 
 --TPContactoDenuncia
insert into TPContactoDenuncia (GLTPContactoDenuncia) values ('Contacto Particular');
insert into TPContactoDenuncia (GLTPContactoDenuncia) values ('Contacto Comercial');

--TPConduccion
insert into TPConduccion (CDTPConduccion,GLTPConduccion) values (1,'Control de detencion');
insert into TPConduccion (CDTPConduccion,GLTPConduccion) values (2,'Sin control de detencion');

--TPCausaDetencion
insert into TPCausaDetencion (GLTPCausaDetencion) values ('ABIGEATO');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('AGRESIÓN CON LESIONES');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('ALTERACIÓN DEL ORDEN PÚBLICO');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('AMENAZAS');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('AROOJAR PIEDRAS U OBJETOS EN LUGARES PÚBLICOS');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('ATENTADO CONTRA LA AUTORIDAD');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('BAÑISTA TEMERARIO');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('COHECHO');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('DAÑOS');
insert into TPCausaDetencion (GLTPCausaDetencion) values ('FALSIFICACIÓN DE INSTRUMENTO PÚBLICO');

--Denuncia
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('10/24/2021', 1, 1,2, 251, '11/9/2021', '1/22/2022', '2/1/2022', 136370512);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('5/31/2021', 2, 2, 2, 998, '11/23/2021', '1/15/2022', '2/1/2022', 133558782);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('4/22/2021', 3, 3, 2, 756, '9/10/2021', '1/14/2022', '2/1/2022', 114504145);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('6/17/2021', 4, 4, 2, 29, '9/10/2021', '1/17/2022', '2/1/2022', 110800072);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('7/20/2021', 5, 5, 2, 449, '7/16/2021', '1/8/2022', '2/1/2022', 211322029);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('1/17/2022', 6, 6, 2, 174, '10/26/2021', '1/31/2022', '2/1/2022', 207146793);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('11/15/2021', 7, 7, 2, 842, '10/5/2021', '1/21/2022', '2/1/2022', 170654679);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('12/26/2021', 8, 8, 2, 256, '10/19/2021', '1/24/2022', '2/1/2022', 175122758);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('10/22/2021', 9, 9, 2, 559, '8/8/2021', '1/12/2022', '2/1/2022', 199541617);
insert into Denuncia (FCIngreso, CDReparticion, IDInstitucionCargo, CDTPDocumento, NRDocumento, FCInicioDenuncia, FCTerminoDenuncia, FCExpiracion, NRRutUsuario) values ('11/17/2021', 10, 10, 2, 141, '7/7/2021', '1/12/2022', '2/1/2022', 131234470);

--Direccion
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (1, '90328 Oneill Road', 'Center', '6', '326', '3', 'Mesta', 'Sales', 51.7565958, 20.9183286, 2, '8/2/2021', 2, 'Harris-Windler', '2/1/2022', 137283110);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (2, '5576 Mallard Road', 'Alley', '457', '0350', '7', '6th', 'Legal', 51.5615169, 21.6199869, 1, '7/28/2021', 1, 'O''Connell-Rohan', '2/1/2022', 194666822);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (4, '7 Oxford Trail', 'Center', '147', '72', '05034', '4th', 'Sales', 27.304802, 112.5438, 2, '4/7/2021', 3, 'Pouros, Dibbert and Gibson', '2/1/2022', 120355502);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (5, '019 Mcbride Drive', 'Plaza', '4093', '5', '5', 'Bluejay', 'Support', -6.2523005, 106.8473377, 1, '7/18/2021', 2, 'Hermann Inc', '2/1/2022', 203512473);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (6, '74 Old Gate Avenue', 'Place', '75283', '94', '6', 'Mifflin', 'Marketing', -7.042646, 110.894036, 2, '1/2/2022', 1, 'Lockman-Koepp', '2/1/2022', 147884354);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (3, '276 Fallview Parkway', 'Avenue', '9', '5588', '5570', 'Laurel', 'Accounting', 39.4135711, -8.2103619, 1, '7/2/2021', 2, 'Kshlerin, Howell and McLaughlin', '2/1/2022', 148548026);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (7, '98713 Crowley Alley', 'Street', '6030', '49790', '884', 'Comanche', 'Business Development', 18.3549366, -99.5360598, 2, '12/4/2021', 3, 'Mann-McCullough', '2/1/2022', 202439758);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (8, '24720 Randy Terrace', 'Hill', '97785', '81803', '38485', 'Raven', 'Sales', 46.2893452, 28.6519897, 2, '11/22/2021', 1, 'Quigley-Russel', '2/1/2022', 105473985);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (9, '413 Sloan Way', 'Parkway', '1396', '188', '57', 'Almo', 'Accounting', 44.9764185, 17.9070412, 2, '8/30/2021', 1, 'Wintheiser-Leannon', '2/1/2022', 157367552);
insert into Direccion (CDComuna, GLSector, GLBlock, NMCalle, NMVillaPoblacion, GLNumero, GLReferencia, GLDepartamento, NRLatitud, NRlongitud, CDTPContactoDenuncia, FCIngreso, CDTPResidencia, NMResidenciaInstitucional, FCExpiracion, NRRutUsuario) values (10, '3 Parkside Lane', 'Place', '9', '74', '16', 'Park Meadow', 'Engineering', -29.6148016, -52.1936768, 1, '12/24/2021', 2, 'Rutherford Group', '2/1/2022', 207598122);

--PersonaParte
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (1, '2022-02-08', 'Sub-Ex', 'Saloma', 4, 2, 2, 1, 1, 1, '2022-06-16', 134177355);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (2, '2022-02-16', 'Redhold', 'Orel', 1, 3, 1, 2, 1, 2, '2022-06-19', 104027265);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (3, '2021-02-10', 'Ronstring', 'Idalina', 1, 1, 2, 3, 2, 3, '2022-06-27', 161806726);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (4, '2021-02-08', 'Voyatouch', 'Olva', 4, 1, 1, 4, 1, 4, '2022-06-21', 175713466);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (5, '2021-11-18', 'Fixflex', 'Roze', 4, 2, 2, 2, 2, 5, '2022-06-21', 157964320);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (6, '2021-12-15', 'Span', 'Audi', 4, 1, 1, 1, 2, 6, '2022-06-16', 190039595);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (7, '2021-06-20', 'Sub-Ex', 'Hyacinthie', 1, 3, 2, 2, 1, 7, '2022-06-21', 125060697);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (8, '2021-07-29', 'Regrant', 'Vere', 1, 3, 2, 2, 1, 8, '8-06-26', 187643646);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (9, '2021-11-02', 'Cardify', 'Jeannine', 5, 4, 1, 1, 2, 9, '2022-06-26', 135555894);
insert into PersonaParte (IDPersona, FCIngreso, NMSocial, GLAlias, CDTPEstadoMigratorio, CDTPGradoEscolaridad, CDTPPuebloOriginario, CDTPIdioma, CDTPIdentidadGenero, IDDireccion, FCExpiracion, NRRutUsuario) values (10, '2022-01-22', 'Zathin', 'Kandace', 4, 5, 2, 2, 1, 10, '2022-06-18', 178986274);


--Involucrado
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 1, 1, '2021-07-21', 2, 1, 1, 1, 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', 'Fix San', 'Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2022-06-17', 125846004);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 1, 1, '2021-06-13', 1, 1, 2, 1, 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', 'Temp', 'Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.', '2022-06-19', 107203992);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 2, 2, '2021-04-22', 2, 2, 4, 3, 'Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.', 'It', 'Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.', '2022-06-17', 196048004);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 2, 2, '2021-01-17', 1, 3, 2, 4, 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', 'Asoka', 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', '2022-06-21', 132852553);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 1, 2, '2021-07-09', 2, 3, 3, 3, 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', 'Zaam-Dox', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus.', '2022-06-19', 174502633);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 3, 5, '2021-04-17', 1, 2, 4, 6, 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', 'Konklab', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', '2022-06-27', 108528342);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 4, 4, '2021-03-16', 2, 4, 2, 7, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', 'Redhold', 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', '2022-06-23', 174611731);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 1, 6, '2022-01-14', 1, 3, 4, 8, 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', 'Hatity', 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2022-06-17', 193368535);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 4, 5, '2021-03-26', 2, 4, 4, 9, 'Integer tinzcidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.', 'Transcof', 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', '2022-06-19', 126418198);
insert into Involucrado (IDDenuncia, IDPersonaParte, FCIngreso, CDTPContactoDenuncia, CDTPSituacionConvivencia, CDTPInvolucrado, IDDireccion, GLDetalleLesiones, GLOtrosTestigos, GLPruebaHechos, FCExpiracion, NRRutUsuario) values ( 3, 6, '2021-06-24', 2, 1, 1, 1, 'Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.', 'Zoolab', 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2022-06-24', 192278258);


--RolImputado
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (3, 1, '2021-01-14', '2022-06-18', 135094121);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 2, '2021-05-15', '2022-06-25', 141451247);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 3, '2021-10-04', '2022-06-22', 169767970);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 4, '2021-01-07', '2022-06-16', 166387320);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (5, 1, '2021-01-01', '2022-06-25', 110083195);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 2, '2021-01-27', '2022-06-25', 120807643);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (7, 3, '2021-11-11', '2022-06-25', 193274561);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 4, '2021-10-28', '2022-06-17', 153632520);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 2, '2022-02-06', '2022-06-16', 110053628);
insert into RolImputado (IDInvolucrado, CDTPRolImputado, FCIngreso, FCExpiracion, NRRutUsuario) values (10, 4, '2021-06-21', '2022-06-21', 171387392);


--PerfilImputado
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (3, 1, '2021-11-29', '2022-06-27', 124420064);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 3, '2021-07-14', '2022-06-20', 153412958);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 2, '2022-01-16', '2022-06-16', 143217047);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 2, '2021-02-12', '2022-06-26', 134447498);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (5, 5, '2021-03-30', '2022-06-21', 169362684);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 1, '2021-09-20', '2022-06-23', 176347540);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (7, 3, '2021-05-05', '2022-06-22', 180137905);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 1, '2021-11-14', '2022-06-20', 117965854);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 3, '2021-09-18', '2022-06-22', 192680578);
insert into PerfilImputado (IDInvolucrado, CDTPPerfil, FCIngreso, FCExpiracion, NRRutUsuario) values (10, 5, '2022-02-26', '2022-06-25', 132834399);

--Funcionario
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (1, 1, 1, '2021-09-16', 'Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.', 1, 1, '2022-06-26', 130979051);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (2, 2, 0, '2021-07-10', 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 2, 1, '2022-06-21', 145753846);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (3, 3, 0, '2021-04-17', 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.', 3, 2, '2022-06-18', 177660244);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (4, 4, 1, '2022-01-08', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', 4, 2, '2022-06-20', 176194619);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (5, 5, 1, '2021-03-22', 'Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.', 5, 1, '2022-06-19', 110381358);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (6, 6, 1, '2021-12-31', 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', 6, 1, '2022-06-20', 164741400);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (7, 7, 1, '2021-12-28', 'Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.', 7, 2, '2022-06-25', 114968079);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (8, 8, 0, '2021-10-23', 'In congue. Etiam justo. Etiam pretium iaculis justo.', 8, 1, '2022-06-26', 110509029);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (9, 9, 0, '2021-08-23', 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae.', 9, 1, '2022-06-17', 179488125);
insert into Funcionario (IDDenuncia, IDPersona, LGResponsableDiligencia, FCIngreso, GLRolProcedimiento, CDGrado, CDTPRolFuncionario, FCExpiracion, NRRutUsuario) values (10, 10, 1, '2022-02-04', 'Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat.', 10, 2, '2022-06-22', 183419030);

--NarracionDenuncia
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (1, 1, '2021-03-30', 'Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est ri', '2022-06-20', 121075317);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (2, 4, '2021-07-24', 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', '2022-06-18', 161537689);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (3, 3, '2021-10-10', 'Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu.', '2022-06-23', 117506700);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (4, 9, '2021-06-09', 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.Phasellus in felis. Donec semper sapien a libero.', '2022-06-16', 118995899);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (5, 2, '2021-06-24', 'Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2022-06-17', 118022434);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (6, 5, '2021-08-29', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.Phasellus sit amet erat. ', '2022-06-27', 184878061);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (7,10, '2021-09-14', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. ', '2022-06-17', 155548286);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (8, 8, '2021-03-23', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', '2022-06-21', 179400570);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (9, 6, '2021-08-25', 'Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.In sagittis dui vel nisl.', '2022-06-20', 179519129);
insert into NarracionDenuncia (IDFuncionario, IDInvolucrado, FCIngreso, GLNarracionHechos, FCExpiracion, NRRutUsuario) values (10,7, '2021-10-20', 'In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.', '2022-06-21', 166774499);

--MedioTransporte
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-06-05', 2, 1, 1, 1, 0, 1, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', 2006, 'Scion', 'xB', 'Mauv', '15504 Vernon Terrace', 'Prairieview', 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', '2022-06-23', 108573006);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-01-15', 1, 2, 2, 0, 0, 1, 'Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.', 1995, 'Mazda', 'Protege', 'Green', '7214 Shopko Circle', 'Schmedeman', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', '2022-06-18', 123908452);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-06-02', 2, 2, 3, 1, 0, 1, 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', 1950, 'Hillman', 'Minx Magnificent', 'Mauv', '808 Russell Center', 'Mcguire', 'Phasellus in felis. Donec semper sapien a libero. Nam dui.', '2022-06-26', 168116345);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-01-16', 2, 2, 1, 1, 0, 0, 'In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.', 1986, 'Buick', 'Skylark', 'Purple', '1305 Lighthouse Bay Court', 'Bartelt', 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.', '2022-06-20', 173661774);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-09-12', 2, 1, 2, 0, 0, 0, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.', 2001, 'Nissan', 'Maxima', 'Puce', '0 Nova Place', 'Golden Leaf', 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', '2022-06-25', 169384948);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-06-28', 2, 2, 3, 1, 1, 1, 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.', 1992, 'Chevrolet', 'Corsica', 'Puce', '1 Evergreen Alley', 'Schlimgen', 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque.', '2022-06-27', 186291808);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-05-16', 2, 2, 2, 1, 1, 0, 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', 1989, 'Pontiac', 'Grand Am', 'Teal', '5 Gale Pass', 'Twin Pines', 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.', '2022-06-24', 183146745);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-02-08', 2, 1, 1, 1, 0, 0, 'Phasellus in felis. Donec semper sapien a libero. Nam dui.', 1997, 'Mazda', 'MX-5', 'Fuscia', '30802 Nancy Junction', 'Bayside', 'Sed ante. Vivamus tortor. Duis mattis egestas metus.Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', '2022-06-20', 156893549);
insert into MedioTransporte (FCIngreso, CDTPUsoMedio, CDTPMedioTransporte, IDMovil, LGEncargoRobo, LGIncautado, LGPortaPatente, GLNroEncargoRobo, GLPatente, GLMarca, GLModelo, GLColor, GLPeaje, GLAutopista, GLObservacion, FCExpiracion, NRRutUsuario) values ('2021-10-14', 1, 2, 3, 1, 0, 0, 'Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.', 1994, 'GMC', 'Rally Wagon 3500', 'Purple', '2 Old Gate Trail', 'Veith', 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.', '2022-06-18', 161021084);


--MedioTransporteInvolucrado
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (1, 1, 2, '2021-01-16', '2022-06-22', 151950856);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (2, 2, 1, '2022-01-28', '2022-06-23', 131787160);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (3, 3, 1, '2021-10-16', '2022-06-27', 110113808);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (4, 4, 2, '2021-03-17', '2022-06-16', 153435913);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (5, 5, 2, '2021-04-13', '2022-06-23', 140578890);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 6, 2, '2021-04-19', '2022-06-16', 187669473);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (7, 7, 2, '2022-02-20', '2022-06-22', 136627672);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 8, 1, '2021-09-05', '2022-06-22', 100741193);
insert into MedioTransporteInvolucrado (IDMedioTransporte, IDInvolucrado, CDTPUsoMedio, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 9, 1, '2021-04-27', '2022-06-19', 130267122);


--InvolucradoDenunciado
insert into InvolucradoDenunciado (IDInvolucrado, IDDenunciadoInvolucrado, FCIngreso, CDTPRelacion, GLDescripcionDenunciado, LGConoceDenunciado, FCExpiracion, NRRutUsuario) values (1, 8, '2022-01-05', 1, 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', 0, '2022-06-23', 178685085);
insert into InvolucradoDenunciado (IDInvolucrado, IDDenunciadoInvolucrado, FCIngreso, CDTPRelacion, GLDescripcionDenunciado, LGConoceDenunciado, FCExpiracion, NRRutUsuario) values (10, 6, '2021-06-04', 3, 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', 0, '2022-06-16', 163343101);
insert into InvolucradoDenunciado (IDInvolucrado, IDDenunciadoInvolucrado, FCIngreso, CDTPRelacion, GLDescripcionDenunciado, LGConoceDenunciado, FCExpiracion, NRRutUsuario) values (7, 3, '2021-04-16', 3, 'In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.', 0, '2022-06-16', 152502399);
insert into InvolucradoDenunciado (IDInvolucrado, IDDenunciadoInvolucrado, FCIngreso, CDTPRelacion, GLDescripcionDenunciado, LGConoceDenunciado, FCExpiracion, NRRutUsuario) values (4, 9, '2021-06-22', 2, 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', 0, '2022-06-16', 112490905);

--Fiscalia
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Matsoft', 5, '8/22/2021', 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', '65485125', 2, NULL , '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Tresom', 8, '9/2/2021', 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', '49089389', 2,NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Zontrax', 2, '8/25/2021', 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', '23463691', 2, NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Rank', 6, '7/6/2021', 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '54234140', 2, NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Bitwolf', 8, '7/5/2021', 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', '33973248', 2, NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Fintone', 6, '6/13/2021', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.', '47278766', 2, NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Quo Lux', 3, '6/15/2021', 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '87423153', 2, NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Konklab', 4, '9/25/2021', 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', '28756798', 2, NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Alpha', 3, '10/2/2021', 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '96467731', 2,NULL, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Fixflex', 1, '7/30/2021', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', '41178574', 2, NULL, '2/1/2022');

insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Matso', 5, '8/22/2021', 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', '65485125', 1, 7, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Tre', 8, '9/2/2021', 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', '49089389', 1, 6, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Zon', 2, '8/25/2021', 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', '23463691', 1, 10, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Ra', 6, '7/6/2021', 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '54234140', 1, 6, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Bit', 8, '7/5/2021', 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', '33973248', 1, 6, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Fin', 6, '6/13/2021', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.', '47278766', 1, 4, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Quo', 3, '6/15/2021', 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '87423153', 1, 3, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Kon', 4, '9/25/2021', 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', '28756798', 1, 10, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Al', 3, '10/2/2021', 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '96467731', 1, 2, '2/1/2022');
insert into Fiscalia (NMFiscalia, CDTPComuna, FCIngreso, GLDireccion, NRFono, CDTPFiscalia, IDFiscaliaSup, FCExpiracion) values ('Fix', 1, '7/30/2021', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', '41178574', 1, 5, '2/1/2022');


--InstruccionFiscal
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (1, 1, 11, '2021-05-01', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '2022-06-27', 114714957);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (2, 2, 12, '2022-02-05', 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', '2022-06-22', 189429496);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (3, 3, 13, '2021-05-19', 'In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.', '2022-06-20', 125614882);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (4, 4, 14, '2021-01-02', 'Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.', '2022-06-20', 101438690);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (5, 5, 15, '2021-06-11', 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.', '2022-06-22', 183630264);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (6, 6, 16, '2021-01-27', 'Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.', '2022-06-27', 153588140);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (7, 7, 17, '2021-03-24', 'Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', '2022-06-16', 134037352);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (8, 8, 18, '2021-04-05', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', '2022-06-21', 147324313);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (9, 9, 19, '2021-11-16', 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '2022-06-27', 103580598);
insert into InstruccionFiscal (IDDenuncia, IDPersonaFiscal, IDFiscalia, FCIngreso, GLInstruccionFiscal, FCExpiracion, NRRutUsuario) values (10, 10, 20, '2021-12-06', 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', '2022-06-18', 153219918);


--EventoMedioTransporte
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (2, 1, 106.3581527, 106.3581527, '2022-06-24', 107337720);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (5, 2, 106.3581527, -111.97, '2022-06-25', 185265145);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (6, 3, 106.3581527, 99.9688636, '2022-06-16', 185071779);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (9, 4, 106.3581527, 8.6600586, '2022-06-23', 147059231);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (3, 5, 106.3581527, 34.5968895, '2022-06-24', 138774706);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (4, 6, 1106.3581527, -36.5087385, '2022-06-20', 157705241);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (1, 7, 1106.3581527, 110.8072159, '2022-06-27', 147508525);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (7, 8, 1106.3581527, 112.891275, '2022-06-24', 148880604);
insert into EventoMedioTransporte (IDMedioTransporte, IDEvento, NRLatitudPosat, NRLongitudPosat, FCExpiracion, NRRutUsuario) values (8, 9, 2106.3581527, 76.9262526, '2022-06-20', 166948549);

--EstadoInvolucrado
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (1, 5, '2022-01-03', '2022-06-22', 134195282);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (2, 3, '2022-03-05', '2022-06-19', 181742266);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (3, 1, '2022-02-10', '2022-06-16', 127324372);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (4, 5, '2022-01-10', '2022-06-21', 102771546);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (5, 6, '2022-04-28', '2022-06-17', 119591003);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 6, '2022-04-27', '2022-06-23', 164351081);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (7, 2, '2022-03-03', '2022-06-19', 134568965);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 4, '2022-01-23', '2022-06-17', 183563738);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 2, '2022-03-18', '2022-06-23', 132382972);
insert into EstadoInvolucrado (IDInvolucrado, CDTPEstadoPersona, FCIngreso, FCExpiracion, NRRutUsuario) values (10, 6, '2022-02-19', '2022-06-22', 146139534);

--EstadoDenuncia
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (1, 2, '2022-04-05', '2022-06-27', 185106849);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (2, 2, '2022-04-01', '2022-06-16', 115878160);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (3, 1, '2022-02-13', '2022-06-20', 138064986);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (4, 1, '2022-01-12', '2022-06-25', 173555887);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (5, 2, '2022-04-06', '2022-06-17', 123135970);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 2, '2022-01-22', '2022-06-23', 132696821);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (7, 2, '2022-04-23', '2022-06-16', 156183814);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 2, '2022-04-16', '2022-06-16', 112939698);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 1, '2022-02-17', '2022-06-21', 158825971);
insert into EstadoDenuncia (IDDenuncia, CDTPEstadoDenuncia, FCIngreso, FCExpiracion, NRRutUsuario) values (10, 1, '2022-04-18', '2022-06-21', 171142808);

--Detencion
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (1, '6/21/2021', '0353 Washington Street', '2/1/2022', 'Crossing', 1, '2/1/2022', 212900912);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (2, '9/30/2021', '8 Hanover Alley', '2/1/2022', 'Plaza', 2, '2/1/2022', 124901689);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (3, '7/24/2021', '88875 Sloan Junction', '2/1/2022', 'Street', 1, '2/1/2022', 192701050);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (4, '7/13/2021', '7829 Londonderry Alley', '2/1/2022', 'Terrace', 3, '2/1/2022', 122454296);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (5, '3/27/2021', '07146 Welch Terrace', '2/1/2022', 'Plaza', 3, '2/1/2022', 101847156);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (1, '6/21/2021', '0353 Washington Street', '2/1/2022', 'Crossing', 1, '2/1/2022', 212900912);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (2, '9/30/2021', '8 Hanover Alley', '2/1/2022', 'Plaza', 2, '2/1/2022', 124901689);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (3, '7/24/2021', '88875 Sloan Junction', '2/1/2022', 'Street', 1, '2/1/2022', 192701050);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (4, '7/13/2021', '7829 Londonderry Alley', '2/1/2022', 'Terrace', 3, '2/1/2022', 122454296);
insert into Detencion (IDInvolucrado, FCIngreso, GLLugarDetencion, FCDetencion, GLNotificaAdultoResponsable, CDTPMedioNotificacion, FCExpiracion, NRRutUsuario) values (5, '3/27/2021', '07146 Welch Terrace', '2/1/2022', 'Plaza', 3, '2/1/2022', 101847156);


--DetalleImputado
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (1, '1/4/2022', 2, 1, 1, 2, '90222', '2/1/2022', 108483831);
Insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (2, '5/18/2021', 1, 1, 0, 2, '2106', '2/1/2022', 182876928);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (3, '6/27/2021', 2, 1, 1, 1, 'E8021', '2/1/2022', 101352573);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (4, '7/8/2021', 1, 1, 1, 2, 'E8175', '2/1/2022', 147935991);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (5, '7/4/2021', 1, 0, 1, 2, '48242', '2/1/2022', 184660349);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (6, '10/3/2021', 2, 1, 1, 2, '85242', '2/1/2022', 155253584);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (7, '5/16/2021', 2, 0, 1, 1, 'V1079', '2/1/2022', 217478854);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (8, '10/20/2021', 2, 0, 0, 1, 'E8811', '2/1/2022', 212447231);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (9, '5/16/2021', 2, 0, 0, 1, '7840', '2/1/2022', 108924625);
insert into DetalleImputado (IDInvolucrado, FCIngreso, CDTPSituacion, LGValidaIdentidad, LGIdentidadPositiva, CDTPConduccion, GLLesiones, FCExpiracion, NRRutUsuario) values (10, '9/9/2021', 1, 1, 0, 1, '82001', '2/1/2022', 103680857);

--DetalleDenuncia
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (1, '1/9/2022', 1, 1, 1, 1, 1, 'Tempsoft', '2/1/2022', 142540045);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (2, '10/6/2021', 2, 2, 2, 2, 2, 'Kanlam', '2/1/2022', 144836464);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (3, '8/30/2021', 4, 2, 3, 3, 3, 'Greenlam', '2/1/2022', 179045999);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (4, '10/15/2021', 2, 1, 1, 4, 4, 'Cookley', '2/1/2022', 113756592);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (5, '4/20/2021', 3, 1, 2, 5, 5, 'Vagram', '2/1/2022', 143943342);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (6, '3/8/2021', 3, 2, 2, 6, 6, 'It', '2/1/2022', 181637456);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (7, '5/8/2021', 1, 1, 3, 7, 7, 'Zaam-Dox', '2/1/2022', 168076404);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (8, '7/10/2021', 4, 2, 2, 8, 8, 'Zaam-Dox', '2/1/2022', 184129925);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (9, '4/28/2021', 2, 2, 1, 9, 9, 'Stim', '2/1/2022', 174164989);
insert into DetalleDenuncia (IDDenuncia, FCIngreso, CDTPZonaDelito, CDTPLugarOcurrencia, CDTPLugarProcedimiento, CDTPCausaDetencion, IDDireccion, NMLugar, FCExpiracion, NRRutUsuario) values (10, '12/5/2021', 5, 2, 1, 10, 10, 'Ventosanzap', '2/1/2022', 199819182);

--DenunciaReferencia
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (1, 2, '8/19/2021', '4/1/2022', 216769957);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (2, 5, '11/27/2021', '21/4/2022', 134749214);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (3, 5, '11/25/2021', '23/1/2022', 156262650);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (4, 4, '11/18/2021', '2/11/2022', 108379853);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (5, 2, '10/20/2021', '2/2/2022', 137726281);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (6, 6, '11/19/2021', '2/12/2022', 197348948);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (7, 7, '7/30/2021', '2/0/2022', 144218519);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (8, 5, '8/17/2021', '2/3/2022', 155726583);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (9, 8, '1/3/2022', '2/6/2022', 191925558);
insert into DenunciaReferencia (IDDenunciaOrigen, IDDenunciaAmpliacion, FCIngreso, FCExpiracion, NRRutUsuario) values (10,9, '4/23/2021', '2/2/2022', 120207107);

--DenunciaPorMenorEdad
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (1, '5/5/2021', 1, 1, 1, 1, 'in tempus sit amet sem fusce consequat', 'est risus', '2/1/2022', 120644628);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (2, '11/6/2021', 2, 1, 2, 2, 'tristique est et', 'nulla sed accumsan felis ut', '2/1/2022', 101090997);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (3, '3/17/2021', 3, 0, 3, 3, 'vivamus metus arcu adipiscing molestie hendrerit', 'convallis tortor risus dapibus augue vel accumsan', '2/1/2022', 145508079);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (4, '7/31/2021', 1, 1, 4, 4, 'est risus', 'magna vestibulum aliquet', '2/1/2022', 209141921);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (5, '8/26/2021', 2, 1, 5, 5, 'sociis natoque', 'mauris viverra diam vitae quam', '2/1/2022', 192180438);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (6, '1/28/2022', 3, 0, 6, 6, 'quam nec dui luctus rutrum', 'at turpis', '2/1/2022', 183090828);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (7, '1/27/2022', 1, 1, 7, 7, 'lobortis ligula sit amet', 'nec nisi volutpat eleifend donec ut', '2/1/2022', 104743654);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (8, '9/24/2021', 2, 0, 8, 8, 'proin interdum mauris non ligula pellentesque', 'interdum mauris non ligula', '2/1/2022', 102549882);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (9, '7/19/2021', 3, 0, 9, 9, 'in faucibus orci luctus', 'sapien ut nunc vestibulum', '2/1/2022', 208092313);
insert into DenunciaPorMenorEdad (IDInvolucradoDenunciante, FCIngreso, CDTPNNA, LGAdultoProtector, CDTPRelacion, IDAdultoProtector, GLPersonaRelata, GLConoceHechos, FCExpiracion, NRRutUsuario) values (10, '1/18/2022', 1, 1, 1, 10, 'enim leo rhoncus', 'in blandit ultrices enim', '2/1/2022', 206243351);


--ContactoRedSocial
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (3, 1, '8/2/2021',  481, 1, '2/1/2022', 149533243);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (2, 2, '10/15/2021', 736, 0,  '2/1/2022', 146033009);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (2, 3, '6/21/2021', 733, 1, '2/1/2022', 217888023);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (1, 4, '4/20/2021', 119, 0,  '2/1/2022', 112353474);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (1, 5, '10/12/2021', 543, 0, '2/1/2022', 209910781);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (1, 6, '9/3/2021', 301, 0, '2/1/2022', 171462054);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (5, 7, '4/11/2021', 53, 1, '2/1/2022', 125934562);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (4, 8, '10/12/2021', 406, 0, '2/1/2022', 189987927);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (5, 9, '3/16/2021', 752, 1, '2/1/2022', 165426702);
insert into ContactoRedSocial (CDTPRedSocial, IDPersonaParte, FCIngreso, GLIdentificador, LGParticular, FCExpiracion, NRRutUsuario) values (3, 10, '1/20/2022', 802, 0, '2/1/2022', 193497334);

--CausaDetencion
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (1, 9, 'Johnson Labs, Inc.', '2/1/2022', 195329807);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (2, 6, 'Wakefern Food Corporation', '2/1/2022', 211052653);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (3, 3, 'Fresenius Kabi USA, LLC', '2/1/2022', 165796387);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (4, 3, 'State of Florida DOH Central Pharmacy', '2/1/2022', 109446487);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (5, 6, 'Publix Super Markets Inc', '2/1/2022', 197775346);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (6, 6, 'Quality Home Products', '2/1/2022', 168642058);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (7, 4, 'Allergy Laboratories, Inc.', '2/1/2022', 109379433);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (8, 9, 'Physicians Total Care, Inc.', '2/1/2022', 154209666);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (9, 3, 'Melaleuca Inc.', '2/1/2022', 210119141);
insert into CausaDetencion (IDDetencion, CDTPCausaDetencion, GLDetalle, FCExpiracion, NRRutUsuario) values (10, 9, 'Rite Aid Corporation', '2/1/2022', 194955100);

--Delito
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (1, 2, '2021-07-11', 'Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.', 1, 2, '2022-06-14', 21169963);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (2, 2, '2021-09-07', 'In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.', 1, 1, '2021-12-12', 150759835);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (3, 3, '2021-09-17', 'In congue. Etiam justo. Etiam pretium iaculis justo.', 1, 1, '2022-06-28', 104026136);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (4, 3, '2021-08-27', 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.', 2, 1, '2021-12-01', 66072372);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (5, 3, '2021-07-23', 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.', 1, 2, '2021-12-05', 136816632);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (6, 1, '2021-10-04', 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.', 1, 2, '2021-01-13', 174261141);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (7, 2, '2021-09-08', 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue.', 1, 2, '2022-01-22', 72434142);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (8, 3, '2021-09-18', 'Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat.', 2, 2, '2021-02-01', 242844990);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (9, 3, '2021-07-12', 'In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.', 2, 2, '2021-02-03', 204894645);
insert into Delito (IDDenuncia, CDTPGradoEjecucion, FCIngreso, GLModusOperandi, LGLesionados, LGFallecidos, FCExpiracion, NRRutUsuario) values (10, 2, '2021-08-19', 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', 1, 1, '2021-02-16', 181076909);