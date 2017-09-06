package br.com.gndi.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Contrato}.
 * </p>
 *
 * @author Rafael
 * @see Contrato
 * @generated
 */
public class ContratoWrapper implements Contrato, ModelWrapper<Contrato> {
    private Contrato _contrato;

    public ContratoWrapper(Contrato contrato) {
        _contrato = contrato;
    }

    @Override
    public Class<?> getModelClass() {
        return Contrato.class;
    }

    @Override
    public String getModelClassName() {
        return Contrato.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("contratoId", getContratoId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("unidade", getUnidade());
        attributes.put("grupoContrato", getGrupoContrato());
        attributes.put("contrato", getContrato());
        attributes.put("nomeContrato", getNomeContrato());
        attributes.put("subContrato", getSubContrato());
        attributes.put("nomeSubContrato", getNomeSubContrato());
        attributes.put("codigoPlano", getCodigoPlano());
        attributes.put("nomePlano", getNomePlano());
        attributes.put("email", getEmail());
        attributes.put("email1", getEmail1());
        attributes.put("email2", getEmail2());
        attributes.put("email3", getEmail3());
        attributes.put("email4", getEmail4());
        attributes.put("email5", getEmail5());
        attributes.put("resposta", getResposta());
        attributes.put("dataEnvio", getDataEnvio());
        attributes.put("dataResposta", getDataResposta());
        attributes.put("dataCadastro", getDataCadastro());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long contratoId = (Long) attributes.get("contratoId");

        if (contratoId != null) {
            setContratoId(contratoId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String unidade = (String) attributes.get("unidade");

        if (unidade != null) {
            setUnidade(unidade);
        }

        String grupoContrato = (String) attributes.get("grupoContrato");

        if (grupoContrato != null) {
            setGrupoContrato(grupoContrato);
        }

        String contrato = (String) attributes.get("contrato");

        if (contrato != null) {
            setContrato(contrato);
        }

        String nomeContrato = (String) attributes.get("nomeContrato");

        if (nomeContrato != null) {
            setNomeContrato(nomeContrato);
        }

        String subContrato = (String) attributes.get("subContrato");

        if (subContrato != null) {
            setSubContrato(subContrato);
        }

        String nomeSubContrato = (String) attributes.get("nomeSubContrato");

        if (nomeSubContrato != null) {
            setNomeSubContrato(nomeSubContrato);
        }

        String codigoPlano = (String) attributes.get("codigoPlano");

        if (codigoPlano != null) {
            setCodigoPlano(codigoPlano);
        }

        String nomePlano = (String) attributes.get("nomePlano");

        if (nomePlano != null) {
            setNomePlano(nomePlano);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String email1 = (String) attributes.get("email1");

        if (email1 != null) {
            setEmail1(email1);
        }

        String email2 = (String) attributes.get("email2");

        if (email2 != null) {
            setEmail2(email2);
        }

        String email3 = (String) attributes.get("email3");

        if (email3 != null) {
            setEmail3(email3);
        }

        String email4 = (String) attributes.get("email4");

        if (email4 != null) {
            setEmail4(email4);
        }

        String email5 = (String) attributes.get("email5");

        if (email5 != null) {
            setEmail5(email5);
        }

        String resposta = (String) attributes.get("resposta");

        if (resposta != null) {
            setResposta(resposta);
        }

        Date dataEnvio = (Date) attributes.get("dataEnvio");

        if (dataEnvio != null) {
            setDataEnvio(dataEnvio);
        }

        Date dataResposta = (Date) attributes.get("dataResposta");

        if (dataResposta != null) {
            setDataResposta(dataResposta);
        }

        Date dataCadastro = (Date) attributes.get("dataCadastro");

        if (dataCadastro != null) {
            setDataCadastro(dataCadastro);
        }
    }

    /**
    * Returns the primary key of this contrato.
    *
    * @return the primary key of this contrato
    */
    @Override
    public long getPrimaryKey() {
        return _contrato.getPrimaryKey();
    }

    /**
    * Sets the primary key of this contrato.
    *
    * @param primaryKey the primary key of this contrato
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _contrato.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the contrato ID of this contrato.
    *
    * @return the contrato ID of this contrato
    */
    @Override
    public long getContratoId() {
        return _contrato.getContratoId();
    }

    /**
    * Sets the contrato ID of this contrato.
    *
    * @param contratoId the contrato ID of this contrato
    */
    @Override
    public void setContratoId(long contratoId) {
        _contrato.setContratoId(contratoId);
    }

    /**
    * Returns the group ID of this contrato.
    *
    * @return the group ID of this contrato
    */
    @Override
    public long getGroupId() {
        return _contrato.getGroupId();
    }

    /**
    * Sets the group ID of this contrato.
    *
    * @param groupId the group ID of this contrato
    */
    @Override
    public void setGroupId(long groupId) {
        _contrato.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this contrato.
    *
    * @return the company ID of this contrato
    */
    @Override
    public long getCompanyId() {
        return _contrato.getCompanyId();
    }

    /**
    * Sets the company ID of this contrato.
    *
    * @param companyId the company ID of this contrato
    */
    @Override
    public void setCompanyId(long companyId) {
        _contrato.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this contrato.
    *
    * @return the user ID of this contrato
    */
    @Override
    public long getUserId() {
        return _contrato.getUserId();
    }

    /**
    * Sets the user ID of this contrato.
    *
    * @param userId the user ID of this contrato
    */
    @Override
    public void setUserId(long userId) {
        _contrato.setUserId(userId);
    }

    /**
    * Returns the user uuid of this contrato.
    *
    * @return the user uuid of this contrato
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contrato.getUserUuid();
    }

    /**
    * Sets the user uuid of this contrato.
    *
    * @param userUuid the user uuid of this contrato
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _contrato.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this contrato.
    *
    * @return the user name of this contrato
    */
    @Override
    public java.lang.String getUserName() {
        return _contrato.getUserName();
    }

    /**
    * Sets the user name of this contrato.
    *
    * @param userName the user name of this contrato
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _contrato.setUserName(userName);
    }

    /**
    * Returns the create date of this contrato.
    *
    * @return the create date of this contrato
    */
    @Override
    public java.util.Date getCreateDate() {
        return _contrato.getCreateDate();
    }

    /**
    * Sets the create date of this contrato.
    *
    * @param createDate the create date of this contrato
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _contrato.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this contrato.
    *
    * @return the modified date of this contrato
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _contrato.getModifiedDate();
    }

    /**
    * Sets the modified date of this contrato.
    *
    * @param modifiedDate the modified date of this contrato
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _contrato.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the unidade of this contrato.
    *
    * @return the unidade of this contrato
    */
    @Override
    public java.lang.String getUnidade() {
        return _contrato.getUnidade();
    }

    /**
    * Sets the unidade of this contrato.
    *
    * @param unidade the unidade of this contrato
    */
    @Override
    public void setUnidade(java.lang.String unidade) {
        _contrato.setUnidade(unidade);
    }

    /**
    * Returns the grupo contrato of this contrato.
    *
    * @return the grupo contrato of this contrato
    */
    @Override
    public java.lang.String getGrupoContrato() {
        return _contrato.getGrupoContrato();
    }

    /**
    * Sets the grupo contrato of this contrato.
    *
    * @param grupoContrato the grupo contrato of this contrato
    */
    @Override
    public void setGrupoContrato(java.lang.String grupoContrato) {
        _contrato.setGrupoContrato(grupoContrato);
    }

    /**
    * Returns the contrato of this contrato.
    *
    * @return the contrato of this contrato
    */
    @Override
    public java.lang.String getContrato() {
        return _contrato.getContrato();
    }

    /**
    * Sets the contrato of this contrato.
    *
    * @param contrato the contrato of this contrato
    */
    @Override
    public void setContrato(java.lang.String contrato) {
        _contrato.setContrato(contrato);
    }

    /**
    * Returns the nome contrato of this contrato.
    *
    * @return the nome contrato of this contrato
    */
    @Override
    public java.lang.String getNomeContrato() {
        return _contrato.getNomeContrato();
    }

    /**
    * Sets the nome contrato of this contrato.
    *
    * @param nomeContrato the nome contrato of this contrato
    */
    @Override
    public void setNomeContrato(java.lang.String nomeContrato) {
        _contrato.setNomeContrato(nomeContrato);
    }

    /**
    * Returns the sub contrato of this contrato.
    *
    * @return the sub contrato of this contrato
    */
    @Override
    public java.lang.String getSubContrato() {
        return _contrato.getSubContrato();
    }

    /**
    * Sets the sub contrato of this contrato.
    *
    * @param subContrato the sub contrato of this contrato
    */
    @Override
    public void setSubContrato(java.lang.String subContrato) {
        _contrato.setSubContrato(subContrato);
    }

    /**
    * Returns the nome sub contrato of this contrato.
    *
    * @return the nome sub contrato of this contrato
    */
    @Override
    public java.lang.String getNomeSubContrato() {
        return _contrato.getNomeSubContrato();
    }

    /**
    * Sets the nome sub contrato of this contrato.
    *
    * @param nomeSubContrato the nome sub contrato of this contrato
    */
    @Override
    public void setNomeSubContrato(java.lang.String nomeSubContrato) {
        _contrato.setNomeSubContrato(nomeSubContrato);
    }

    /**
    * Returns the codigo plano of this contrato.
    *
    * @return the codigo plano of this contrato
    */
    @Override
    public java.lang.String getCodigoPlano() {
        return _contrato.getCodigoPlano();
    }

    /**
    * Sets the codigo plano of this contrato.
    *
    * @param codigoPlano the codigo plano of this contrato
    */
    @Override
    public void setCodigoPlano(java.lang.String codigoPlano) {
        _contrato.setCodigoPlano(codigoPlano);
    }

    /**
    * Returns the nome plano of this contrato.
    *
    * @return the nome plano of this contrato
    */
    @Override
    public java.lang.String getNomePlano() {
        return _contrato.getNomePlano();
    }

    /**
    * Sets the nome plano of this contrato.
    *
    * @param nomePlano the nome plano of this contrato
    */
    @Override
    public void setNomePlano(java.lang.String nomePlano) {
        _contrato.setNomePlano(nomePlano);
    }

    /**
    * Returns the email of this contrato.
    *
    * @return the email of this contrato
    */
    @Override
    public java.lang.String getEmail() {
        return _contrato.getEmail();
    }

    /**
    * Sets the email of this contrato.
    *
    * @param email the email of this contrato
    */
    @Override
    public void setEmail(java.lang.String email) {
        _contrato.setEmail(email);
    }

    /**
    * Returns the email1 of this contrato.
    *
    * @return the email1 of this contrato
    */
    @Override
    public java.lang.String getEmail1() {
        return _contrato.getEmail1();
    }

    /**
    * Sets the email1 of this contrato.
    *
    * @param email1 the email1 of this contrato
    */
    @Override
    public void setEmail1(java.lang.String email1) {
        _contrato.setEmail1(email1);
    }

    /**
    * Returns the email2 of this contrato.
    *
    * @return the email2 of this contrato
    */
    @Override
    public java.lang.String getEmail2() {
        return _contrato.getEmail2();
    }

    /**
    * Sets the email2 of this contrato.
    *
    * @param email2 the email2 of this contrato
    */
    @Override
    public void setEmail2(java.lang.String email2) {
        _contrato.setEmail2(email2);
    }

    /**
    * Returns the email3 of this contrato.
    *
    * @return the email3 of this contrato
    */
    @Override
    public java.lang.String getEmail3() {
        return _contrato.getEmail3();
    }

    /**
    * Sets the email3 of this contrato.
    *
    * @param email3 the email3 of this contrato
    */
    @Override
    public void setEmail3(java.lang.String email3) {
        _contrato.setEmail3(email3);
    }

    /**
    * Returns the email4 of this contrato.
    *
    * @return the email4 of this contrato
    */
    @Override
    public java.lang.String getEmail4() {
        return _contrato.getEmail4();
    }

    /**
    * Sets the email4 of this contrato.
    *
    * @param email4 the email4 of this contrato
    */
    @Override
    public void setEmail4(java.lang.String email4) {
        _contrato.setEmail4(email4);
    }

    /**
    * Returns the email5 of this contrato.
    *
    * @return the email5 of this contrato
    */
    @Override
    public java.lang.String getEmail5() {
        return _contrato.getEmail5();
    }

    /**
    * Sets the email5 of this contrato.
    *
    * @param email5 the email5 of this contrato
    */
    @Override
    public void setEmail5(java.lang.String email5) {
        _contrato.setEmail5(email5);
    }

    /**
    * Returns the resposta of this contrato.
    *
    * @return the resposta of this contrato
    */
    @Override
    public java.lang.String getResposta() {
        return _contrato.getResposta();
    }

    /**
    * Sets the resposta of this contrato.
    *
    * @param resposta the resposta of this contrato
    */
    @Override
    public void setResposta(java.lang.String resposta) {
        _contrato.setResposta(resposta);
    }

    /**
    * Returns the data envio of this contrato.
    *
    * @return the data envio of this contrato
    */
    @Override
    public java.util.Date getDataEnvio() {
        return _contrato.getDataEnvio();
    }

    /**
    * Sets the data envio of this contrato.
    *
    * @param dataEnvio the data envio of this contrato
    */
    @Override
    public void setDataEnvio(java.util.Date dataEnvio) {
        _contrato.setDataEnvio(dataEnvio);
    }

    /**
    * Returns the data resposta of this contrato.
    *
    * @return the data resposta of this contrato
    */
    @Override
    public java.util.Date getDataResposta() {
        return _contrato.getDataResposta();
    }

    /**
    * Sets the data resposta of this contrato.
    *
    * @param dataResposta the data resposta of this contrato
    */
    @Override
    public void setDataResposta(java.util.Date dataResposta) {
        _contrato.setDataResposta(dataResposta);
    }

    /**
    * Returns the data cadastro of this contrato.
    *
    * @return the data cadastro of this contrato
    */
    @Override
    public java.util.Date getDataCadastro() {
        return _contrato.getDataCadastro();
    }

    /**
    * Sets the data cadastro of this contrato.
    *
    * @param dataCadastro the data cadastro of this contrato
    */
    @Override
    public void setDataCadastro(java.util.Date dataCadastro) {
        _contrato.setDataCadastro(dataCadastro);
    }

    @Override
    public boolean isNew() {
        return _contrato.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _contrato.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _contrato.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _contrato.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _contrato.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _contrato.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _contrato.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _contrato.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _contrato.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _contrato.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _contrato.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ContratoWrapper((Contrato) _contrato.clone());
    }

    @Override
    public int compareTo(br.com.gndi.liferay.model.Contrato contrato) {
        return _contrato.compareTo(contrato);
    }

    @Override
    public int hashCode() {
        return _contrato.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<br.com.gndi.liferay.model.Contrato> toCacheModel() {
        return _contrato.toCacheModel();
    }

    @Override
    public br.com.gndi.liferay.model.Contrato toEscapedModel() {
        return new ContratoWrapper(_contrato.toEscapedModel());
    }

    @Override
    public br.com.gndi.liferay.model.Contrato toUnescapedModel() {
        return new ContratoWrapper(_contrato.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _contrato.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _contrato.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _contrato.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ContratoWrapper)) {
            return false;
        }

        ContratoWrapper contratoWrapper = (ContratoWrapper) obj;

        if (Validator.equals(_contrato, contratoWrapper._contrato)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Contrato getWrappedContrato() {
        return _contrato;
    }

    @Override
    public Contrato getWrappedModel() {
        return _contrato;
    }

    @Override
    public void resetOriginalValues() {
        _contrato.resetOriginalValues();
    }
}
