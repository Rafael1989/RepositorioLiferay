create table NI_Contrato (
	contratoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	unidade VARCHAR(75) null,
	grupoContrato VARCHAR(75) null,
	contrato VARCHAR(75) null,
	nomeContrato VARCHAR(75) null,
	subContrato VARCHAR(75) null,
	nomeSubContrato VARCHAR(75) null,
	codigoPlano VARCHAR(75) null,
	nomePlano VARCHAR(75) null,
	email VARCHAR(75) null,
	email1 VARCHAR(75) null,
	email2 VARCHAR(75) null,
	email3 VARCHAR(75) null,
	email4 VARCHAR(75) null,
	email5 VARCHAR(75) null,
	resposta VARCHAR(75) null,
	dataEnvio DATE null,
	dataResposta DATE null,
	dataCadastro DATE null
);