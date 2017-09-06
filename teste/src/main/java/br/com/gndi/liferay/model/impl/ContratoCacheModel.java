package br.com.gndi.liferay.model.impl;

import br.com.gndi.liferay.model.Contrato;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Contrato in entity cache.
 *
 * @author Rafael
 * @see Contrato
 * @generated
 */
public class ContratoCacheModel implements CacheModel<Contrato>, Externalizable {
    public long contratoId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String unidade;
    public String grupoContrato;
    public String contrato;
    public String nomeContrato;
    public String subContrato;
    public String nomeSubContrato;
    public String codigoPlano;
    public String nomePlano;
    public String email;
    public String email1;
    public String email2;
    public String email3;
    public String email4;
    public String email5;
    public String resposta;
    public long dataEnvio;
    public long dataResposta;
    public long dataCadastro;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(51);

        sb.append("{contratoId=");
        sb.append(contratoId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", unidade=");
        sb.append(unidade);
        sb.append(", grupoContrato=");
        sb.append(grupoContrato);
        sb.append(", contrato=");
        sb.append(contrato);
        sb.append(", nomeContrato=");
        sb.append(nomeContrato);
        sb.append(", subContrato=");
        sb.append(subContrato);
        sb.append(", nomeSubContrato=");
        sb.append(nomeSubContrato);
        sb.append(", codigoPlano=");
        sb.append(codigoPlano);
        sb.append(", nomePlano=");
        sb.append(nomePlano);
        sb.append(", email=");
        sb.append(email);
        sb.append(", email1=");
        sb.append(email1);
        sb.append(", email2=");
        sb.append(email2);
        sb.append(", email3=");
        sb.append(email3);
        sb.append(", email4=");
        sb.append(email4);
        sb.append(", email5=");
        sb.append(email5);
        sb.append(", resposta=");
        sb.append(resposta);
        sb.append(", dataEnvio=");
        sb.append(dataEnvio);
        sb.append(", dataResposta=");
        sb.append(dataResposta);
        sb.append(", dataCadastro=");
        sb.append(dataCadastro);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Contrato toEntityModel() {
        ContratoImpl contratoImpl = new ContratoImpl();

        contratoImpl.setContratoId(contratoId);
        contratoImpl.setGroupId(groupId);
        contratoImpl.setCompanyId(companyId);
        contratoImpl.setUserId(userId);

        if (userName == null) {
            contratoImpl.setUserName(StringPool.BLANK);
        } else {
            contratoImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            contratoImpl.setCreateDate(null);
        } else {
            contratoImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            contratoImpl.setModifiedDate(null);
        } else {
            contratoImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (unidade == null) {
            contratoImpl.setUnidade(StringPool.BLANK);
        } else {
            contratoImpl.setUnidade(unidade);
        }

        if (grupoContrato == null) {
            contratoImpl.setGrupoContrato(StringPool.BLANK);
        } else {
            contratoImpl.setGrupoContrato(grupoContrato);
        }

        if (contrato == null) {
            contratoImpl.setContrato(StringPool.BLANK);
        } else {
            contratoImpl.setContrato(contrato);
        }

        if (nomeContrato == null) {
            contratoImpl.setNomeContrato(StringPool.BLANK);
        } else {
            contratoImpl.setNomeContrato(nomeContrato);
        }

        if (subContrato == null) {
            contratoImpl.setSubContrato(StringPool.BLANK);
        } else {
            contratoImpl.setSubContrato(subContrato);
        }

        if (nomeSubContrato == null) {
            contratoImpl.setNomeSubContrato(StringPool.BLANK);
        } else {
            contratoImpl.setNomeSubContrato(nomeSubContrato);
        }

        if (codigoPlano == null) {
            contratoImpl.setCodigoPlano(StringPool.BLANK);
        } else {
            contratoImpl.setCodigoPlano(codigoPlano);
        }

        if (nomePlano == null) {
            contratoImpl.setNomePlano(StringPool.BLANK);
        } else {
            contratoImpl.setNomePlano(nomePlano);
        }

        if (email == null) {
            contratoImpl.setEmail(StringPool.BLANK);
        } else {
            contratoImpl.setEmail(email);
        }

        if (email1 == null) {
            contratoImpl.setEmail1(StringPool.BLANK);
        } else {
            contratoImpl.setEmail1(email1);
        }

        if (email2 == null) {
            contratoImpl.setEmail2(StringPool.BLANK);
        } else {
            contratoImpl.setEmail2(email2);
        }

        if (email3 == null) {
            contratoImpl.setEmail3(StringPool.BLANK);
        } else {
            contratoImpl.setEmail3(email3);
        }

        if (email4 == null) {
            contratoImpl.setEmail4(StringPool.BLANK);
        } else {
            contratoImpl.setEmail4(email4);
        }

        if (email5 == null) {
            contratoImpl.setEmail5(StringPool.BLANK);
        } else {
            contratoImpl.setEmail5(email5);
        }

        if (resposta == null) {
            contratoImpl.setResposta(StringPool.BLANK);
        } else {
            contratoImpl.setResposta(resposta);
        }

        if (dataEnvio == Long.MIN_VALUE) {
            contratoImpl.setDataEnvio(null);
        } else {
            contratoImpl.setDataEnvio(new Date(dataEnvio));
        }

        if (dataResposta == Long.MIN_VALUE) {
            contratoImpl.setDataResposta(null);
        } else {
            contratoImpl.setDataResposta(new Date(dataResposta));
        }

        if (dataCadastro == Long.MIN_VALUE) {
            contratoImpl.setDataCadastro(null);
        } else {
            contratoImpl.setDataCadastro(new Date(dataCadastro));
        }

        contratoImpl.resetOriginalValues();

        return contratoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        contratoId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        unidade = objectInput.readUTF();
        grupoContrato = objectInput.readUTF();
        contrato = objectInput.readUTF();
        nomeContrato = objectInput.readUTF();
        subContrato = objectInput.readUTF();
        nomeSubContrato = objectInput.readUTF();
        codigoPlano = objectInput.readUTF();
        nomePlano = objectInput.readUTF();
        email = objectInput.readUTF();
        email1 = objectInput.readUTF();
        email2 = objectInput.readUTF();
        email3 = objectInput.readUTF();
        email4 = objectInput.readUTF();
        email5 = objectInput.readUTF();
        resposta = objectInput.readUTF();
        dataEnvio = objectInput.readLong();
        dataResposta = objectInput.readLong();
        dataCadastro = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(contratoId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (unidade == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(unidade);
        }

        if (grupoContrato == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(grupoContrato);
        }

        if (contrato == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(contrato);
        }

        if (nomeContrato == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nomeContrato);
        }

        if (subContrato == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(subContrato);
        }

        if (nomeSubContrato == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nomeSubContrato);
        }

        if (codigoPlano == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(codigoPlano);
        }

        if (nomePlano == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nomePlano);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (email1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email1);
        }

        if (email2 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email2);
        }

        if (email3 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email3);
        }

        if (email4 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email4);
        }

        if (email5 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email5);
        }

        if (resposta == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(resposta);
        }

        objectOutput.writeLong(dataEnvio);
        objectOutput.writeLong(dataResposta);
        objectOutput.writeLong(dataCadastro);
    }
}
