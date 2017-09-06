package br.com.gndi.liferay.model.impl;

import br.com.gndi.liferay.model.Contrato;
import br.com.gndi.liferay.service.ContratoLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Contrato service. Represents a row in the &quot;NI_Contrato&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContratoImpl}.
 * </p>
 *
 * @author Rafael
 * @see ContratoImpl
 * @see br.com.gndi.liferay.model.Contrato
 * @generated
 */
public abstract class ContratoBaseImpl extends ContratoModelImpl
    implements Contrato {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a contrato model instance should use the {@link Contrato} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ContratoLocalServiceUtil.addContrato(this);
        } else {
            ContratoLocalServiceUtil.updateContrato(this);
        }
    }
}
