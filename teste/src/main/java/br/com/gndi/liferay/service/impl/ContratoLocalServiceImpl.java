package br.com.gndi.liferay.service.impl;

import java.util.Date;
import java.util.List;

import br.com.gndi.liferay.NoSuchContratoException;
import br.com.gndi.liferay.model.Contrato;
import br.com.gndi.liferay.model.ContratoClp;
import br.com.gndi.liferay.service.base.ContratoLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the contrato local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link br.com.gndi.liferay.service.ContratoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Rafael
 * @see br.com.gndi.liferay.service.base.ContratoLocalServiceBaseImpl
 * @see br.com.gndi.liferay.service.ContratoLocalServiceUtil
 */
public class ContratoLocalServiceImpl extends ContratoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * br.com.gndi.liferay.service.ContratoLocalServiceUtil} to access the
	 * contrato local service.
	 */
	private static Log _log = LogFactoryUtil
			.getLog(ContratoLocalServiceImpl.class);

	public void adicionaContratoEmpresa(ContratoClp contratoClp,
			ServiceContext serviceContext) {
		try {
			User user = userLocalService
					.getUserById(serviceContext.getUserId());
			long groupId = serviceContext.getScopeGroupId();
			Date now = new Date();

			long contratoId = counterLocalService.increment();

			Contrato contrato = contratoPersistence.create(contratoId);

			contrato.setGroupId(groupId);
			contrato.setCompanyId(user.getCompanyId());
			contrato.setUserId(user.getUserId());
			contrato.setUserName(user.getFullName());
			contrato.setCreateDate(serviceContext.getCreateDate(now));
			contrato.setModifiedDate(serviceContext.getModifiedDate(now));
			contrato.setExpandoBridgeAttributes(serviceContext);
			contrato.setUnidade(contratoClp.getUnidade());
			contrato.setGrupoContrato(contratoClp.getGrupoContrato());
			contrato.setContrato(contratoClp.getContrato());
			contrato.setNomeContrato(contratoClp.getNomeContrato());
			contrato.setSubContrato(contratoClp.getSubContrato());
			contrato.setNomeSubContrato(contratoClp.getNomeSubContrato());
			contrato.setCodigoPlano(contratoClp.getCodigoPlano());
			contrato.setNomePlano(contratoClp.getNomePlano());
			contrato.setEmail(contratoClp.getEmail());
			contrato.setEmail1(contratoClp.getEmail1());
			contrato.setEmail2(contratoClp.getEmail2());
			contrato.setEmail3(contratoClp.getEmail3());
			contrato.setEmail4(contratoClp.getEmail4());
			contrato.setEmail5(contratoClp.getEmail5());
			contrato.setResposta(contratoClp.getResposta());
			contrato.setDataEnvio(contratoClp.getDataEnvio());
			contrato.setDataResposta(contratoClp.getDataResposta());
			contrato.setDataCadastro(contratoClp.getDataCadastro());

			contratoPersistence.update(contrato);

			updateAsset(user.getUserId(), contrato,
					serviceContext.getAssetCategoryIds(),
					serviceContext.getAssetTagNames());
		} catch (SystemException | PortalException e) {
			_log.error(e, e);
		}
	}

	public void updateAsset(long userId, Contrato contrato,
			long[] assetCategoryIds, String[] assetTagNames)
			throws PortalException, SystemException {

		assetEntryLocalService.updateEntry(userId, contrato.getGroupId(), null,
				null, Contrato.class.getName(), contrato.getContratoId(),
				contrato.getUserUuid(), 0, assetCategoryIds, assetTagNames,
				true, null, null, null, ContentTypes.TEXT_PLAIN_UTF8,
				contrato.getNomeContrato(), null, contrato.getNomeContrato(),
				null, null, 0, 0, null, false);
	}

	public List<Contrato> buscaPorEmail(String email) {

		List<Contrato> lista = null;
		try {
			lista = contratoPersistence.findByEmail(email);
		} catch (SystemException e) {
			_log.error(e, e);
		}
		return lista;
	}

	public List<Contrato> buscaPorEmpresa(String unidade) {

		List<Contrato> lista = null;
		try {
			lista = contratoPersistence.findByEmpresa(unidade);
		} catch (SystemException e) {
			_log.error(e, e);
		}
		return lista;
	}

	public List<Contrato> buscaPorContrato(String nomeContrato) {

		List<Contrato> lista = null;
		try {
			lista = contratoPersistence.findByContrato(nomeContrato);
		} catch (SystemException e) {
			_log.error(e, e);
		}
		return lista;
	}

	public void updateContratoEmpresa(ContratoClp contratoClp,
			ServiceContext serviceContext) throws PortalException {
		try {
			User user = userPersistence.findByPrimaryKey(serviceContext
					.getUserId());

			Contrato contrato = contratoPersistence
					.findByPrimaryKey(contratoClp.getContratoId());
			Date now = new Date();

			contrato.setModifiedDate(serviceContext.getModifiedDate(now));
			contrato.setResposta(contratoClp.getResposta());
			contrato.setDataResposta(contratoClp.getDataResposta());
			contrato.setExpandoBridgeAttributes(serviceContext);

			contratoPersistence.update(contrato);

			updateAsset(user.getUserId(), contrato,
					serviceContext.getAssetCategoryIds(),
					serviceContext.getAssetTagNames());
		} catch (SystemException e) {
			_log.error(e, e);
		}
	}
	
	public void removeContratoEmpresa(ContratoClp contratoClp, ServiceContext serviceContext){
		try {
			List<Contrato> contratos = contratoPersistence.findByContrato(contratoClp.getNomeContrato());
			if(!contratos.isEmpty())
			contratoPersistence.remove(contratos.get(0));
		} catch (SystemException e) {
			_log.error(e, e);
		}
	}
}
