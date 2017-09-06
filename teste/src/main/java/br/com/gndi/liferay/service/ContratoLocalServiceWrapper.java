package br.com.gndi.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContratoLocalService}.
 *
 * @author Rafael
 * @see ContratoLocalService
 * @generated
 */
public class ContratoLocalServiceWrapper implements ContratoLocalService,
    ServiceWrapper<ContratoLocalService> {
    private ContratoLocalService _contratoLocalService;

    public ContratoLocalServiceWrapper(
        ContratoLocalService contratoLocalService) {
        _contratoLocalService = contratoLocalService;
    }

    /**
    * Adds the contrato to the database. Also notifies the appropriate model listeners.
    *
    * @param contrato the contrato
    * @return the contrato that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.com.gndi.liferay.model.Contrato addContrato(
        br.com.gndi.liferay.model.Contrato contrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.addContrato(contrato);
    }

    /**
    * Creates a new contrato with the primary key. Does not add the contrato to the database.
    *
    * @param contratoId the primary key for the new contrato
    * @return the new contrato
    */
    @Override
    public br.com.gndi.liferay.model.Contrato createContrato(long contratoId) {
        return _contratoLocalService.createContrato(contratoId);
    }

    /**
    * Deletes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param contratoId the primary key of the contrato
    * @return the contrato that was removed
    * @throws PortalException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.com.gndi.liferay.model.Contrato deleteContrato(long contratoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.deleteContrato(contratoId);
    }

    /**
    * Deletes the contrato from the database. Also notifies the appropriate model listeners.
    *
    * @param contrato the contrato
    * @return the contrato that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.com.gndi.liferay.model.Contrato deleteContrato(
        br.com.gndi.liferay.model.Contrato contrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.deleteContrato(contrato);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _contratoLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public br.com.gndi.liferay.model.Contrato fetchContrato(long contratoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.fetchContrato(contratoId);
    }

    /**
    * Returns the contrato with the primary key.
    *
    * @param contratoId the primary key of the contrato
    * @return the contrato
    * @throws PortalException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.com.gndi.liferay.model.Contrato getContrato(long contratoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.getContrato(contratoId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<br.com.gndi.liferay.model.Contrato> getContratos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.getContratos(start, end);
    }

    /**
    * Returns the number of contratos.
    *
    * @return the number of contratos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getContratosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.getContratosCount();
    }

    /**
    * Updates the contrato in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param contrato the contrato
    * @return the contrato that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.com.gndi.liferay.model.Contrato updateContrato(
        br.com.gndi.liferay.model.Contrato contrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contratoLocalService.updateContrato(contrato);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _contratoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _contratoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _contratoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public void adicionaContratoEmpresa(
        br.com.gndi.liferay.model.ContratoClp contratoClp,
        com.liferay.portal.service.ServiceContext serviceContext) {
        _contratoLocalService.adicionaContratoEmpresa(contratoClp,
            serviceContext);
    }

    @Override
    public void updateAsset(long userId,
        br.com.gndi.liferay.model.Contrato contrato, long[] assetCategoryIds,
        java.lang.String[] assetTagNames)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _contratoLocalService.updateAsset(userId, contrato, assetCategoryIds,
            assetTagNames);
    }

    @Override
    public java.util.List<br.com.gndi.liferay.model.Contrato> buscaPorEmail(
        java.lang.String email) {
        return _contratoLocalService.buscaPorEmail(email);
    }

    @Override
    public java.util.List<br.com.gndi.liferay.model.Contrato> buscaPorEmpresa(
        java.lang.String unidade) {
        return _contratoLocalService.buscaPorEmpresa(unidade);
    }

    @Override
    public java.util.List<br.com.gndi.liferay.model.Contrato> buscaPorContrato(
        java.lang.String nomeContrato) {
        return _contratoLocalService.buscaPorContrato(nomeContrato);
    }

    @Override
    public void updateContratoEmpresa(
        br.com.gndi.liferay.model.ContratoClp contratoClp,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException {
        _contratoLocalService.updateContratoEmpresa(contratoClp, serviceContext);
    }

    @Override
    public void removeContratoEmpresa(
        br.com.gndi.liferay.model.ContratoClp contratoClp,
        com.liferay.portal.service.ServiceContext serviceContext) {
        _contratoLocalService.removeContratoEmpresa(contratoClp, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ContratoLocalService getWrappedContratoLocalService() {
        return _contratoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedContratoLocalService(
        ContratoLocalService contratoLocalService) {
        _contratoLocalService = contratoLocalService;
    }

    @Override
    public ContratoLocalService getWrappedService() {
        return _contratoLocalService;
    }

    @Override
    public void setWrappedService(ContratoLocalService contratoLocalService) {
        _contratoLocalService = contratoLocalService;
    }
}
