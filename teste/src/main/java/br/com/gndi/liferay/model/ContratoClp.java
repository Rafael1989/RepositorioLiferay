package br.com.gndi.liferay.model;

import br.com.gndi.liferay.service.ClpSerializer;
import br.com.gndi.liferay.service.ContratoLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ContratoClp extends BaseModelImpl<Contrato> implements Contrato {
    private long _contratoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
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
    private BaseModel<?> _contratoRemoteModel;
    private Class<?> _clpSerializerClass = br.com.gndi.liferay.service.ClpSerializer.class;

    public ContratoClp() {
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
    public long getPrimaryKey() {
        return _contratoId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setContratoId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _contratoId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getContratoId() {
        return _contratoId;
    }

    @Override
    public void setContratoId(long contratoId) {
        _contratoId = contratoId;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setContratoId", long.class);

                method.invoke(_contratoRemoteModel, contratoId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_contratoRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_contratoRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_contratoRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_contratoRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_contratoRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_contratoRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUnidade() {
        return _unidade;
    }

    @Override
    public void setUnidade(String unidade) {
        _unidade = unidade;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setUnidade", String.class);

                method.invoke(_contratoRemoteModel, unidade);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGrupoContrato() {
        return _grupoContrato;
    }

    @Override
    public void setGrupoContrato(String grupoContrato) {
        _grupoContrato = grupoContrato;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setGrupoContrato", String.class);

                method.invoke(_contratoRemoteModel, grupoContrato);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContrato() {
        return _contrato;
    }

    @Override
    public void setContrato(String contrato) {
        _contrato = contrato;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setContrato", String.class);

                method.invoke(_contratoRemoteModel, contrato);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNomeContrato() {
        return _nomeContrato;
    }

    @Override
    public void setNomeContrato(String nomeContrato) {
        _nomeContrato = nomeContrato;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setNomeContrato", String.class);

                method.invoke(_contratoRemoteModel, nomeContrato);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSubContrato() {
        return _subContrato;
    }

    @Override
    public void setSubContrato(String subContrato) {
        _subContrato = subContrato;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setSubContrato", String.class);

                method.invoke(_contratoRemoteModel, subContrato);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNomeSubContrato() {
        return _nomeSubContrato;
    }

    @Override
    public void setNomeSubContrato(String nomeSubContrato) {
        _nomeSubContrato = nomeSubContrato;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setNomeSubContrato",
                        String.class);

                method.invoke(_contratoRemoteModel, nomeSubContrato);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCodigoPlano() {
        return _codigoPlano;
    }

    @Override
    public void setCodigoPlano(String codigoPlano) {
        _codigoPlano = codigoPlano;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setCodigoPlano", String.class);

                method.invoke(_contratoRemoteModel, codigoPlano);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNomePlano() {
        return _nomePlano;
    }

    @Override
    public void setNomePlano(String nomePlano) {
        _nomePlano = nomePlano;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setNomePlano", String.class);

                method.invoke(_contratoRemoteModel, nomePlano);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_contratoRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail1() {
        return _email1;
    }

    @Override
    public void setEmail1(String email1) {
        _email1 = email1;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail1", String.class);

                method.invoke(_contratoRemoteModel, email1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail2() {
        return _email2;
    }

    @Override
    public void setEmail2(String email2) {
        _email2 = email2;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail2", String.class);

                method.invoke(_contratoRemoteModel, email2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail3() {
        return _email3;
    }

    @Override
    public void setEmail3(String email3) {
        _email3 = email3;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail3", String.class);

                method.invoke(_contratoRemoteModel, email3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail4() {
        return _email4;
    }

    @Override
    public void setEmail4(String email4) {
        _email4 = email4;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail4", String.class);

                method.invoke(_contratoRemoteModel, email4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail5() {
        return _email5;
    }

    @Override
    public void setEmail5(String email5) {
        _email5 = email5;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail5", String.class);

                method.invoke(_contratoRemoteModel, email5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getResposta() {
        return _resposta;
    }

    @Override
    public void setResposta(String resposta) {
        _resposta = resposta;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setResposta", String.class);

                method.invoke(_contratoRemoteModel, resposta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDataEnvio() {
        return _dataEnvio;
    }

    @Override
    public void setDataEnvio(Date dataEnvio) {
        _dataEnvio = dataEnvio;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setDataEnvio", Date.class);

                method.invoke(_contratoRemoteModel, dataEnvio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDataResposta() {
        return _dataResposta;
    }

    @Override
    public void setDataResposta(Date dataResposta) {
        _dataResposta = dataResposta;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setDataResposta", Date.class);

                method.invoke(_contratoRemoteModel, dataResposta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDataCadastro() {
        return _dataCadastro;
    }

    @Override
    public void setDataCadastro(Date dataCadastro) {
        _dataCadastro = dataCadastro;

        if (_contratoRemoteModel != null) {
            try {
                Class<?> clazz = _contratoRemoteModel.getClass();

                Method method = clazz.getMethod("setDataCadastro", Date.class);

                method.invoke(_contratoRemoteModel, dataCadastro);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getContratoRemoteModel() {
        return _contratoRemoteModel;
    }

    public void setContratoRemoteModel(BaseModel<?> contratoRemoteModel) {
        _contratoRemoteModel = contratoRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _contratoRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_contratoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ContratoLocalServiceUtil.addContrato(this);
        } else {
            ContratoLocalServiceUtil.updateContrato(this);
        }
    }

    @Override
    public Contrato toEscapedModel() {
        return (Contrato) ProxyUtil.newProxyInstance(Contrato.class.getClassLoader(),
            new Class[] { Contrato.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ContratoClp clone = new ContratoClp();

        clone.setContratoId(getContratoId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setUnidade(getUnidade());
        clone.setGrupoContrato(getGrupoContrato());
        clone.setContrato(getContrato());
        clone.setNomeContrato(getNomeContrato());
        clone.setSubContrato(getSubContrato());
        clone.setNomeSubContrato(getNomeSubContrato());
        clone.setCodigoPlano(getCodigoPlano());
        clone.setNomePlano(getNomePlano());
        clone.setEmail(getEmail());
        clone.setEmail1(getEmail1());
        clone.setEmail2(getEmail2());
        clone.setEmail3(getEmail3());
        clone.setEmail4(getEmail4());
        clone.setEmail5(getEmail5());
        clone.setResposta(getResposta());
        clone.setDataEnvio(getDataEnvio());
        clone.setDataResposta(getDataResposta());
        clone.setDataCadastro(getDataCadastro());

        return clone;
    }

    @Override
    public int compareTo(Contrato contrato) {
        int value = 0;

        value = getNomePlano().compareTo(contrato.getNomePlano());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ContratoClp)) {
            return false;
        }

        ContratoClp contrato = (ContratoClp) obj;

        long primaryKey = contrato.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(51);

        sb.append("{contratoId=");
        sb.append(getContratoId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", unidade=");
        sb.append(getUnidade());
        sb.append(", grupoContrato=");
        sb.append(getGrupoContrato());
        sb.append(", contrato=");
        sb.append(getContrato());
        sb.append(", nomeContrato=");
        sb.append(getNomeContrato());
        sb.append(", subContrato=");
        sb.append(getSubContrato());
        sb.append(", nomeSubContrato=");
        sb.append(getNomeSubContrato());
        sb.append(", codigoPlano=");
        sb.append(getCodigoPlano());
        sb.append(", nomePlano=");
        sb.append(getNomePlano());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", email1=");
        sb.append(getEmail1());
        sb.append(", email2=");
        sb.append(getEmail2());
        sb.append(", email3=");
        sb.append(getEmail3());
        sb.append(", email4=");
        sb.append(getEmail4());
        sb.append(", email5=");
        sb.append(getEmail5());
        sb.append(", resposta=");
        sb.append(getResposta());
        sb.append(", dataEnvio=");
        sb.append(getDataEnvio());
        sb.append(", dataResposta=");
        sb.append(getDataResposta());
        sb.append(", dataCadastro=");
        sb.append(getDataCadastro());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(79);

        sb.append("<model><model-name>");
        sb.append("br.com.gndi.liferay.model.Contrato");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>contratoId</column-name><column-value><![CDATA[");
        sb.append(getContratoId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>unidade</column-name><column-value><![CDATA[");
        sb.append(getUnidade());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>grupoContrato</column-name><column-value><![CDATA[");
        sb.append(getGrupoContrato());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contrato</column-name><column-value><![CDATA[");
        sb.append(getContrato());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nomeContrato</column-name><column-value><![CDATA[");
        sb.append(getNomeContrato());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>subContrato</column-name><column-value><![CDATA[");
        sb.append(getSubContrato());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nomeSubContrato</column-name><column-value><![CDATA[");
        sb.append(getNomeSubContrato());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>codigoPlano</column-name><column-value><![CDATA[");
        sb.append(getCodigoPlano());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nomePlano</column-name><column-value><![CDATA[");
        sb.append(getNomePlano());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email1</column-name><column-value><![CDATA[");
        sb.append(getEmail1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email2</column-name><column-value><![CDATA[");
        sb.append(getEmail2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email3</column-name><column-value><![CDATA[");
        sb.append(getEmail3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email4</column-name><column-value><![CDATA[");
        sb.append(getEmail4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email5</column-name><column-value><![CDATA[");
        sb.append(getEmail5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>resposta</column-name><column-value><![CDATA[");
        sb.append(getResposta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataEnvio</column-name><column-value><![CDATA[");
        sb.append(getDataEnvio());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataResposta</column-name><column-value><![CDATA[");
        sb.append(getDataResposta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataCadastro</column-name><column-value><![CDATA[");
        sb.append(getDataCadastro());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
