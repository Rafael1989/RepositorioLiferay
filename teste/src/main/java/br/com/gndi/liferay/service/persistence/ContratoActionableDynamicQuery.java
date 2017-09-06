package br.com.gndi.liferay.service.persistence;

import br.com.gndi.liferay.model.Contrato;
import br.com.gndi.liferay.service.ContratoLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Rafael
 * @generated
 */
public abstract class ContratoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ContratoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ContratoLocalServiceUtil.getService());
        setClass(Contrato.class);

        setClassLoader(br.com.gndi.liferay.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("contratoId");
    }
}
