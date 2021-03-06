package br.com.gndi.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Contrato. This utility wraps
 * {@link br.com.gndi.liferay.service.impl.ContratoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Rafael
 * @see ContratoLocalService
 * @see br.com.gndi.liferay.service.base.ContratoLocalServiceBaseImpl
 * @see br.com.gndi.liferay.service.impl.ContratoLocalServiceImpl
 * @generated
 */
public class ContratoLocalServiceUtil {
    private static ContratoLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link br.com.gndi.liferay.service.impl.ContratoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the contrato to the database. Also notifies the appropriate model listeners.
    *
    * @param contrato the contrato
    * @return the contrato that was added
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato addContrato(
        br.com.gndi.liferay.model.Contrato contrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addContrato(contrato);
    }

    /**
    * Creates a new contrato with the primary key. Does not add the contrato to the database.
    *
    * @param contratoId the primary key for the new contrato
    * @return the new contrato
    */
    public static br.com.gndi.liferay.model.Contrato createContrato(
        long contratoId) {
        return getService().createContrato(contratoId);
    }

    /**
    * Deletes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param contratoId the primary key of the contrato
    * @return the contrato that was removed
    * @throws PortalException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato deleteContrato(
        long contratoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteContrato(contratoId);
    }

    /**
    * Deletes the contrato from the database. Also notifies the appropriate model listeners.
    *
    * @param contrato the contrato
    * @return the contrato that was removed
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato deleteContrato(
        br.com.gndi.liferay.model.Contrato contrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteContrato(contrato);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static br.com.gndi.liferay.model.Contrato fetchContrato(
        long contratoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchContrato(contratoId);
    }

    /**
    * Returns the contrato with the primary key.
    *
    * @param contratoId the primary key of the contrato
    * @return the contrato
    * @throws PortalException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato getContrato(
        long contratoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getContrato(contratoId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the contratos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @return the range of contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> getContratos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getContratos(start, end);
    }

    /**
    * Returns the number of contratos.
    *
    * @return the number of contratos
    * @throws SystemException if a system exception occurred
    */
    public static int getContratosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getContratosCount();
    }

    /**
    * Updates the contrato in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param contrato the contrato
    * @return the contrato that was updated
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato updateContrato(
        br.com.gndi.liferay.model.Contrato contrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateContrato(contrato);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void adicionaContratoEmpresa(
        br.com.gndi.liferay.model.ContratoClp contratoClp,
        com.liferay.portal.service.ServiceContext serviceContext) {
        getService().adicionaContratoEmpresa(contratoClp, serviceContext);
    }

    public static void updateAsset(long userId,
        br.com.gndi.liferay.model.Contrato contrato, long[] assetCategoryIds,
        java.lang.String[] assetTagNames)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService()
            .updateAsset(userId, contrato, assetCategoryIds, assetTagNames);
    }

    public static java.util.List<br.com.gndi.liferay.model.Contrato> buscaPorEmail(
        java.lang.String email) {
        return getService().buscaPorEmail(email);
    }

    public static java.util.List<br.com.gndi.liferay.model.Contrato> buscaPorEmpresa(
        java.lang.String unidade) {
        return getService().buscaPorEmpresa(unidade);
    }

    public static java.util.List<br.com.gndi.liferay.model.Contrato> buscaPorContrato(
        java.lang.String nomeContrato) {
        return getService().buscaPorContrato(nomeContrato);
    }

    public static void updateContratoEmpresa(
        br.com.gndi.liferay.model.ContratoClp contratoClp,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException {
        getService().updateContratoEmpresa(contratoClp, serviceContext);
    }

    public static void removeContratoEmpresa(
        br.com.gndi.liferay.model.ContratoClp contratoClp,
        com.liferay.portal.service.ServiceContext serviceContext) {
        getService().removeContratoEmpresa(contratoClp, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static ContratoLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ContratoLocalService.class.getName());

            if (invokableLocalService instanceof ContratoLocalService) {
                _service = (ContratoLocalService) invokableLocalService;
            } else {
                _service = new ContratoLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ContratoLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ContratoLocalService service) {
    }
}
