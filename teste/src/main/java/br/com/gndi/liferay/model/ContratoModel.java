package br.com.gndi.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Contrato service. Represents a row in the &quot;NI_Contrato&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link br.com.gndi.liferay.model.impl.ContratoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link br.com.gndi.liferay.model.impl.ContratoImpl}.
 * </p>
 *
 * @author Rafael
 * @see Contrato
 * @see br.com.gndi.liferay.model.impl.ContratoImpl
 * @see br.com.gndi.liferay.model.impl.ContratoModelImpl
 * @generated
 */
public interface ContratoModel extends BaseModel<Contrato>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a contrato model instance should use the {@link Contrato} interface instead.
     */

    /**
     * Returns the primary key of this contrato.
     *
     * @return the primary key of this contrato
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this contrato.
     *
     * @param primaryKey the primary key of this contrato
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the contrato ID of this contrato.
     *
     * @return the contrato ID of this contrato
     */
    public long getContratoId();

    /**
     * Sets the contrato ID of this contrato.
     *
     * @param contratoId the contrato ID of this contrato
     */
    public void setContratoId(long contratoId);

    /**
     * Returns the group ID of this contrato.
     *
     * @return the group ID of this contrato
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this contrato.
     *
     * @param groupId the group ID of this contrato
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this contrato.
     *
     * @return the company ID of this contrato
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this contrato.
     *
     * @param companyId the company ID of this contrato
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this contrato.
     *
     * @return the user ID of this contrato
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this contrato.
     *
     * @param userId the user ID of this contrato
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this contrato.
     *
     * @return the user uuid of this contrato
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this contrato.
     *
     * @param userUuid the user uuid of this contrato
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this contrato.
     *
     * @return the user name of this contrato
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this contrato.
     *
     * @param userName the user name of this contrato
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this contrato.
     *
     * @return the create date of this contrato
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this contrato.
     *
     * @param createDate the create date of this contrato
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this contrato.
     *
     * @return the modified date of this contrato
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this contrato.
     *
     * @param modifiedDate the modified date of this contrato
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the unidade of this contrato.
     *
     * @return the unidade of this contrato
     */
    @AutoEscape
    public String getUnidade();

    /**
     * Sets the unidade of this contrato.
     *
     * @param unidade the unidade of this contrato
     */
    public void setUnidade(String unidade);

    /**
     * Returns the grupo contrato of this contrato.
     *
     * @return the grupo contrato of this contrato
     */
    @AutoEscape
    public String getGrupoContrato();

    /**
     * Sets the grupo contrato of this contrato.
     *
     * @param grupoContrato the grupo contrato of this contrato
     */
    public void setGrupoContrato(String grupoContrato);

    /**
     * Returns the contrato of this contrato.
     *
     * @return the contrato of this contrato
     */
    @AutoEscape
    public String getContrato();

    /**
     * Sets the contrato of this contrato.
     *
     * @param contrato the contrato of this contrato
     */
    public void setContrato(String contrato);

    /**
     * Returns the nome contrato of this contrato.
     *
     * @return the nome contrato of this contrato
     */
    @AutoEscape
    public String getNomeContrato();

    /**
     * Sets the nome contrato of this contrato.
     *
     * @param nomeContrato the nome contrato of this contrato
     */
    public void setNomeContrato(String nomeContrato);

    /**
     * Returns the sub contrato of this contrato.
     *
     * @return the sub contrato of this contrato
     */
    @AutoEscape
    public String getSubContrato();

    /**
     * Sets the sub contrato of this contrato.
     *
     * @param subContrato the sub contrato of this contrato
     */
    public void setSubContrato(String subContrato);

    /**
     * Returns the nome sub contrato of this contrato.
     *
     * @return the nome sub contrato of this contrato
     */
    @AutoEscape
    public String getNomeSubContrato();

    /**
     * Sets the nome sub contrato of this contrato.
     *
     * @param nomeSubContrato the nome sub contrato of this contrato
     */
    public void setNomeSubContrato(String nomeSubContrato);

    /**
     * Returns the codigo plano of this contrato.
     *
     * @return the codigo plano of this contrato
     */
    @AutoEscape
    public String getCodigoPlano();

    /**
     * Sets the codigo plano of this contrato.
     *
     * @param codigoPlano the codigo plano of this contrato
     */
    public void setCodigoPlano(String codigoPlano);

    /**
     * Returns the nome plano of this contrato.
     *
     * @return the nome plano of this contrato
     */
    @AutoEscape
    public String getNomePlano();

    /**
     * Sets the nome plano of this contrato.
     *
     * @param nomePlano the nome plano of this contrato
     */
    public void setNomePlano(String nomePlano);

    /**
     * Returns the email of this contrato.
     *
     * @return the email of this contrato
     */
    @AutoEscape
    public String getEmail();

    /**
     * Sets the email of this contrato.
     *
     * @param email the email of this contrato
     */
    public void setEmail(String email);

    /**
     * Returns the email1 of this contrato.
     *
     * @return the email1 of this contrato
     */
    @AutoEscape
    public String getEmail1();

    /**
     * Sets the email1 of this contrato.
     *
     * @param email1 the email1 of this contrato
     */
    public void setEmail1(String email1);

    /**
     * Returns the email2 of this contrato.
     *
     * @return the email2 of this contrato
     */
    @AutoEscape
    public String getEmail2();

    /**
     * Sets the email2 of this contrato.
     *
     * @param email2 the email2 of this contrato
     */
    public void setEmail2(String email2);

    /**
     * Returns the email3 of this contrato.
     *
     * @return the email3 of this contrato
     */
    @AutoEscape
    public String getEmail3();

    /**
     * Sets the email3 of this contrato.
     *
     * @param email3 the email3 of this contrato
     */
    public void setEmail3(String email3);

    /**
     * Returns the email4 of this contrato.
     *
     * @return the email4 of this contrato
     */
    @AutoEscape
    public String getEmail4();

    /**
     * Sets the email4 of this contrato.
     *
     * @param email4 the email4 of this contrato
     */
    public void setEmail4(String email4);

    /**
     * Returns the email5 of this contrato.
     *
     * @return the email5 of this contrato
     */
    @AutoEscape
    public String getEmail5();

    /**
     * Sets the email5 of this contrato.
     *
     * @param email5 the email5 of this contrato
     */
    public void setEmail5(String email5);

    /**
     * Returns the resposta of this contrato.
     *
     * @return the resposta of this contrato
     */
    @AutoEscape
    public String getResposta();

    /**
     * Sets the resposta of this contrato.
     *
     * @param resposta the resposta of this contrato
     */
    public void setResposta(String resposta);

    /**
     * Returns the data envio of this contrato.
     *
     * @return the data envio of this contrato
     */
    public Date getDataEnvio();

    /**
     * Sets the data envio of this contrato.
     *
     * @param dataEnvio the data envio of this contrato
     */
    public void setDataEnvio(Date dataEnvio);

    /**
     * Returns the data resposta of this contrato.
     *
     * @return the data resposta of this contrato
     */
    public Date getDataResposta();

    /**
     * Sets the data resposta of this contrato.
     *
     * @param dataResposta the data resposta of this contrato
     */
    public void setDataResposta(Date dataResposta);

    /**
     * Returns the data cadastro of this contrato.
     *
     * @return the data cadastro of this contrato
     */
    public Date getDataCadastro();

    /**
     * Sets the data cadastro of this contrato.
     *
     * @param dataCadastro the data cadastro of this contrato
     */
    public void setDataCadastro(Date dataCadastro);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(br.com.gndi.liferay.model.Contrato contrato);

    @Override
    public int hashCode();

    @Override
    public CacheModel<br.com.gndi.liferay.model.Contrato> toCacheModel();

    @Override
    public br.com.gndi.liferay.model.Contrato toEscapedModel();

    @Override
    public br.com.gndi.liferay.model.Contrato toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}