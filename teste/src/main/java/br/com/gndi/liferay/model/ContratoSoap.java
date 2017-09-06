package br.com.gndi.liferay.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Rafael
 * @generated
 */
public class ContratoSoap implements Serializable {
    private long _contratoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _unidade;
    private String _grupoContrato;
    private String _contrato;
    private String _nomeContrato;
    private String _subContrato;
    private String _nomeSubContrato;
    private String _codigoPlano;
    private String _nomePlano;
    private String _email;
    private String _email1;
    private String _email2;
    private String _email3;
    private String _email4;
    private String _email5;
    private String _resposta;
    private Date _dataEnvio;
    private Date _dataResposta;
    private Date _dataCadastro;

    public ContratoSoap() {
    }

    public static ContratoSoap toSoapModel(Contrato model) {
        ContratoSoap soapModel = new ContratoSoap();

        soapModel.setContratoId(model.getContratoId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setUnidade(model.getUnidade());
        soapModel.setGrupoContrato(model.getGrupoContrato());
        soapModel.setContrato(model.getContrato());
        soapModel.setNomeContrato(model.getNomeContrato());
        soapModel.setSubContrato(model.getSubContrato());
        soapModel.setNomeSubContrato(model.getNomeSubContrato());
        soapModel.setCodigoPlano(model.getCodigoPlano());
        soapModel.setNomePlano(model.getNomePlano());
        soapModel.setEmail(model.getEmail());
        soapModel.setEmail1(model.getEmail1());
        soapModel.setEmail2(model.getEmail2());
        soapModel.setEmail3(model.getEmail3());
        soapModel.setEmail4(model.getEmail4());
        soapModel.setEmail5(model.getEmail5());
        soapModel.setResposta(model.getResposta());
        soapModel.setDataEnvio(model.getDataEnvio());
        soapModel.setDataResposta(model.getDataResposta());
        soapModel.setDataCadastro(model.getDataCadastro());

        return soapModel;
    }

    public static ContratoSoap[] toSoapModels(Contrato[] models) {
        ContratoSoap[] soapModels = new ContratoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ContratoSoap[][] toSoapModels(Contrato[][] models) {
        ContratoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ContratoSoap[models.length][models[0].length];
        } else {
            soapModels = new ContratoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ContratoSoap[] toSoapModels(List<Contrato> models) {
        List<ContratoSoap> soapModels = new ArrayList<ContratoSoap>(models.size());

        for (Contrato model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ContratoSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _contratoId;
    }

    public void setPrimaryKey(long pk) {
        setContratoId(pk);
    }

    public long getContratoId() {
        return _contratoId;
    }

    public void setContratoId(long contratoId) {
        _contratoId = contratoId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getUnidade() {
        return _unidade;
    }

    public void setUnidade(String unidade) {
        _unidade = unidade;
    }

    public String getGrupoContrato() {
        return _grupoContrato;
    }

    public void setGrupoContrato(String grupoContrato) {
        _grupoContrato = grupoContrato;
    }

    public String getContrato() {
        return _contrato;
    }

    public void setContrato(String contrato) {
        _contrato = contrato;
    }

    public String getNomeContrato() {
        return _nomeContrato;
    }

    public void setNomeContrato(String nomeContrato) {
        _nomeContrato = nomeContrato;
    }

    public String getSubContrato() {
        return _subContrato;
    }

    public void setSubContrato(String subContrato) {
        _subContrato = subContrato;
    }

    public String getNomeSubContrato() {
        return _nomeSubContrato;
    }

    public void setNomeSubContrato(String nomeSubContrato) {
        _nomeSubContrato = nomeSubContrato;
    }

    public String getCodigoPlano() {
        return _codigoPlano;
    }

    public void setCodigoPlano(String codigoPlano) {
        _codigoPlano = codigoPlano;
    }

    public String getNomePlano() {
        return _nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        _nomePlano = nomePlano;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getEmail1() {
        return _email1;
    }

    public void setEmail1(String email1) {
        _email1 = email1;
    }

    public String getEmail2() {
        return _email2;
    }

    public void setEmail2(String email2) {
        _email2 = email2;
    }

    public String getEmail3() {
        return _email3;
    }

    public void setEmail3(String email3) {
        _email3 = email3;
    }

    public String getEmail4() {
        return _email4;
    }

    public void setEmail4(String email4) {
        _email4 = email4;
    }

    public String getEmail5() {
        return _email5;
    }

    public void setEmail5(String email5) {
        _email5 = email5;
    }

    public String getResposta() {
        return _resposta;
    }

    public void setResposta(String resposta) {
        _resposta = resposta;
    }

    public Date getDataEnvio() {
        return _dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        _dataEnvio = dataEnvio;
    }

    public Date getDataResposta() {
        return _dataResposta;
    }

    public void setDataResposta(Date dataResposta) {
        _dataResposta = dataResposta;
    }

    public Date getDataCadastro() {
        return _dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        _dataCadastro = dataCadastro;
    }
}
