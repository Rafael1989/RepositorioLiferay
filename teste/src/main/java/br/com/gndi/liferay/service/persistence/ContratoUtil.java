package br.com.gndi.liferay.service.persistence;

import br.com.gndi.liferay.model.Contrato;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the contrato service. This utility wraps {@link ContratoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rafael
 * @see ContratoPersistence
 * @see ContratoPersistenceImpl
 * @generated
 */
public class ContratoUtil {
    private static ContratoPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Contrato contrato) {
        getPersistence().clearCache(contrato);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Contrato> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Contrato> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Contrato> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Contrato update(Contrato contrato) throws SystemException {
        return getPersistence().update(contrato);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Contrato update(Contrato contrato,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(contrato, serviceContext);
    }

    /**
    * Returns all the contratos where email LIKE &#63;.
    *
    * @param email the email
    * @return the matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByEmail(
        java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail(email);
    }

    /**
    * Returns a range of all the contratos where email LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param email the email
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @return the range of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByEmail(
        java.lang.String email, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail(email, start, end);
    }

    /**
    * Returns an ordered range of all the contratos where email LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param email the email
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByEmail(
        java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail(email, start, end, orderByComparator);
    }

    /**
    * Returns the first contrato in the ordered set where email LIKE &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato findByEmail_First(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail_First(email, orderByComparator);
    }

    /**
    * Returns the first contrato in the ordered set where email LIKE &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contrato, or <code>null</code> if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato fetchByEmail_First(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmail_First(email, orderByComparator);
    }

    /**
    * Returns the last contrato in the ordered set where email LIKE &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato findByEmail_Last(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail_Last(email, orderByComparator);
    }

    /**
    * Returns the last contrato in the ordered set where email LIKE &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contrato, or <code>null</code> if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato fetchByEmail_Last(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmail_Last(email, orderByComparator);
    }

    /**
    * Returns the contratos before and after the current contrato in the ordered set where email LIKE &#63;.
    *
    * @param contratoId the primary key of the current contrato
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato[] findByEmail_PrevAndNext(
        long contratoId, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmail_PrevAndNext(contratoId, email, orderByComparator);
    }

    /**
    * Removes all the contratos where email LIKE &#63; from the database.
    *
    * @param email the email
    * @throws SystemException if a system exception occurred
    */
    public static void removeByEmail(java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByEmail(email);
    }

    /**
    * Returns the number of contratos where email LIKE &#63;.
    *
    * @param email the email
    * @return the number of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmail(java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmail(email);
    }

    /**
    * Returns all the contratos where unidade LIKE &#63;.
    *
    * @param unidade the unidade
    * @return the matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByEmpresa(
        java.lang.String unidade)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmpresa(unidade);
    }

    /**
    * Returns a range of all the contratos where unidade LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param unidade the unidade
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @return the range of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByEmpresa(
        java.lang.String unidade, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmpresa(unidade, start, end);
    }

    /**
    * Returns an ordered range of all the contratos where unidade LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param unidade the unidade
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByEmpresa(
        java.lang.String unidade, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmpresa(unidade, start, end, orderByComparator);
    }

    /**
    * Returns the first contrato in the ordered set where unidade LIKE &#63;.
    *
    * @param unidade the unidade
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato findByEmpresa_First(
        java.lang.String unidade,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmpresa_First(unidade, orderByComparator);
    }

    /**
    * Returns the first contrato in the ordered set where unidade LIKE &#63;.
    *
    * @param unidade the unidade
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contrato, or <code>null</code> if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato fetchByEmpresa_First(
        java.lang.String unidade,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmpresa_First(unidade, orderByComparator);
    }

    /**
    * Returns the last contrato in the ordered set where unidade LIKE &#63;.
    *
    * @param unidade the unidade
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato findByEmpresa_Last(
        java.lang.String unidade,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmpresa_Last(unidade, orderByComparator);
    }

    /**
    * Returns the last contrato in the ordered set where unidade LIKE &#63;.
    *
    * @param unidade the unidade
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contrato, or <code>null</code> if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato fetchByEmpresa_Last(
        java.lang.String unidade,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmpresa_Last(unidade, orderByComparator);
    }

    /**
    * Returns the contratos before and after the current contrato in the ordered set where unidade LIKE &#63;.
    *
    * @param contratoId the primary key of the current contrato
    * @param unidade the unidade
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato[] findByEmpresa_PrevAndNext(
        long contratoId, java.lang.String unidade,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmpresa_PrevAndNext(contratoId, unidade,
            orderByComparator);
    }

    /**
    * Removes all the contratos where unidade LIKE &#63; from the database.
    *
    * @param unidade the unidade
    * @throws SystemException if a system exception occurred
    */
    public static void removeByEmpresa(java.lang.String unidade)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByEmpresa(unidade);
    }

    /**
    * Returns the number of contratos where unidade LIKE &#63;.
    *
    * @param unidade the unidade
    * @return the number of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmpresa(java.lang.String unidade)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmpresa(unidade);
    }

    /**
    * Returns all the contratos where nomeContrato LIKE &#63;.
    *
    * @param nomeContrato the nome contrato
    * @return the matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByContrato(
        java.lang.String nomeContrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByContrato(nomeContrato);
    }

    /**
    * Returns a range of all the contratos where nomeContrato LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nomeContrato the nome contrato
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @return the range of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByContrato(
        java.lang.String nomeContrato, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByContrato(nomeContrato, start, end);
    }

    /**
    * Returns an ordered range of all the contratos where nomeContrato LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nomeContrato the nome contrato
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findByContrato(
        java.lang.String nomeContrato, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContrato(nomeContrato, start, end, orderByComparator);
    }

    /**
    * Returns the first contrato in the ordered set where nomeContrato LIKE &#63;.
    *
    * @param nomeContrato the nome contrato
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato findByContrato_First(
        java.lang.String nomeContrato,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContrato_First(nomeContrato, orderByComparator);
    }

    /**
    * Returns the first contrato in the ordered set where nomeContrato LIKE &#63;.
    *
    * @param nomeContrato the nome contrato
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contrato, or <code>null</code> if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato fetchByContrato_First(
        java.lang.String nomeContrato,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByContrato_First(nomeContrato, orderByComparator);
    }

    /**
    * Returns the last contrato in the ordered set where nomeContrato LIKE &#63;.
    *
    * @param nomeContrato the nome contrato
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato findByContrato_Last(
        java.lang.String nomeContrato,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContrato_Last(nomeContrato, orderByComparator);
    }

    /**
    * Returns the last contrato in the ordered set where nomeContrato LIKE &#63;.
    *
    * @param nomeContrato the nome contrato
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contrato, or <code>null</code> if a matching contrato could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato fetchByContrato_Last(
        java.lang.String nomeContrato,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByContrato_Last(nomeContrato, orderByComparator);
    }

    /**
    * Returns the contratos before and after the current contrato in the ordered set where nomeContrato LIKE &#63;.
    *
    * @param contratoId the primary key of the current contrato
    * @param nomeContrato the nome contrato
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato[] findByContrato_PrevAndNext(
        long contratoId, java.lang.String nomeContrato,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContrato_PrevAndNext(contratoId, nomeContrato,
            orderByComparator);
    }

    /**
    * Removes all the contratos where nomeContrato LIKE &#63; from the database.
    *
    * @param nomeContrato the nome contrato
    * @throws SystemException if a system exception occurred
    */
    public static void removeByContrato(java.lang.String nomeContrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByContrato(nomeContrato);
    }

    /**
    * Returns the number of contratos where nomeContrato LIKE &#63;.
    *
    * @param nomeContrato the nome contrato
    * @return the number of matching contratos
    * @throws SystemException if a system exception occurred
    */
    public static int countByContrato(java.lang.String nomeContrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByContrato(nomeContrato);
    }

    /**
    * Caches the contrato in the entity cache if it is enabled.
    *
    * @param contrato the contrato
    */
    public static void cacheResult(br.com.gndi.liferay.model.Contrato contrato) {
        getPersistence().cacheResult(contrato);
    }

    /**
    * Caches the contratos in the entity cache if it is enabled.
    *
    * @param contratos the contratos
    */
    public static void cacheResult(
        java.util.List<br.com.gndi.liferay.model.Contrato> contratos) {
        getPersistence().cacheResult(contratos);
    }

    /**
    * Creates a new contrato with the primary key. Does not add the contrato to the database.
    *
    * @param contratoId the primary key for the new contrato
    * @return the new contrato
    */
    public static br.com.gndi.liferay.model.Contrato create(long contratoId) {
        return getPersistence().create(contratoId);
    }

    /**
    * Removes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param contratoId the primary key of the contrato
    * @return the contrato that was removed
    * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato remove(long contratoId)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(contratoId);
    }

    public static br.com.gndi.liferay.model.Contrato updateImpl(
        br.com.gndi.liferay.model.Contrato contrato)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(contrato);
    }

    /**
    * Returns the contrato with the primary key or throws a {@link br.com.gndi.liferay.NoSuchContratoException} if it could not be found.
    *
    * @param contratoId the primary key of the contrato
    * @return the contrato
    * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato findByPrimaryKey(
        long contratoId)
        throws br.com.gndi.liferay.NoSuchContratoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(contratoId);
    }

    /**
    * Returns the contrato with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param contratoId the primary key of the contrato
    * @return the contrato, or <code>null</code> if a contrato with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.gndi.liferay.model.Contrato fetchByPrimaryKey(
        long contratoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(contratoId);
    }

    /**
    * Returns all the contratos.
    *
    * @return the contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the contratos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.gndi.liferay.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of contratos
    * @param end the upper bound of the range of contratos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of contratos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.gndi.liferay.model.Contrato> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the contratos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of contratos.
    *
    * @return the number of contratos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ContratoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ContratoPersistence) PortletBeanLocatorUtil.locate(br.com.gndi.liferay.service.ClpSerializer.getServletContextName(),
                    ContratoPersistence.class.getName());

            ReferenceRegistry.registerReference(ContratoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ContratoPersistence persistence) {
    }
}
