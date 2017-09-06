package br.com.gndi.liferay.service.persistence;

import br.com.gndi.liferay.NoSuchContratoException;
import br.com.gndi.liferay.model.Contrato;
import br.com.gndi.liferay.model.impl.ContratoImpl;
import br.com.gndi.liferay.model.impl.ContratoModelImpl;
import br.com.gndi.liferay.service.persistence.ContratoPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the contrato service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rafael
 * @see ContratoPersistence
 * @see ContratoUtil
 * @generated
 */
public class ContratoPersistenceImpl extends BasePersistenceImpl<Contrato>
    implements ContratoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ContratoUtil} to access the contrato persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ContratoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAIL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmail",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_EMAIL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByEmail",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_EMAIL_EMAIL_1 = "contrato.email LIKE NULL";
    private static final String _FINDER_COLUMN_EMAIL_EMAIL_2 = "lower(contrato.email) LIKE ?";
    private static final String _FINDER_COLUMN_EMAIL_EMAIL_3 = "(contrato.email IS NULL OR contrato.email LIKE '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPRESA = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmpresa",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_EMPRESA = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByEmpresa",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_EMPRESA_UNIDADE_1 = "contrato.unidade LIKE NULL";
    private static final String _FINDER_COLUMN_EMPRESA_UNIDADE_2 = "lower(contrato.unidade) LIKE ?";
    private static final String _FINDER_COLUMN_EMPRESA_UNIDADE_3 = "(contrato.unidade IS NULL OR contrato.unidade LIKE '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTRATO = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByContrato",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_CONTRATO =
        new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByContrato",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CONTRATO_NOMECONTRATO_1 = "contrato.nomeContrato LIKE NULL";
    private static final String _FINDER_COLUMN_CONTRATO_NOMECONTRATO_2 = "lower(contrato.nomeContrato) LIKE ?";
    private static final String _FINDER_COLUMN_CONTRATO_NOMECONTRATO_3 = "(contrato.nomeContrato IS NULL OR contrato.nomeContrato LIKE '')";
    private static final String _SQL_SELECT_CONTRATO = "SELECT contrato FROM Contrato contrato";
    private static final String _SQL_SELECT_CONTRATO_WHERE = "SELECT contrato FROM Contrato contrato WHERE ";
    private static final String _SQL_COUNT_CONTRATO = "SELECT COUNT(contrato) FROM Contrato contrato";
    private static final String _SQL_COUNT_CONTRATO_WHERE = "SELECT COUNT(contrato) FROM Contrato contrato WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "contrato.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Contrato exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Contrato exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ContratoPersistenceImpl.class);
    private static Contrato _nullContrato = new ContratoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Contrato> toCacheModel() {
                return _nullContratoCacheModel;
            }
        };

    private static CacheModel<Contrato> _nullContratoCacheModel = new CacheModel<Contrato>() {
            @Override
            public Contrato toEntityModel() {
                return _nullContrato;
            }
        };

    public ContratoPersistenceImpl() {
        setModelClass(Contrato.class);
    }

    /**
     * Returns all the contratos where email LIKE &#63;.
     *
     * @param email the email
     * @return the matching contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Contrato> findByEmail(String email) throws SystemException {
        return findByEmail(email, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Contrato> findByEmail(String email, int start, int end)
        throws SystemException {
        return findByEmail(email, start, end, null);
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
    @Override
    public List<Contrato> findByEmail(String email, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAIL;
        finderArgs = new Object[] { email, start, end, orderByComparator };

        List<Contrato> list = (List<Contrato>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Contrato contrato : list) {
                if (!StringUtil.wildcardMatches(contrato.getEmail(), email,
                            CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, false)) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CONTRATO_WHERE);

            boolean bindEmail = false;

            if (email == null) {
                query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
            } else if (email.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
            } else {
                bindEmail = true;

                query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ContratoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindEmail) {
                    qPos.add(email.toLowerCase());
                }

                if (!pagination) {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Contrato>(list);
                } else {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Contrato findByEmail_First(String email,
        OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = fetchByEmail_First(email, orderByComparator);

        if (contrato != null) {
            return contrato;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("email=");
        msg.append(email);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchContratoException(msg.toString());
    }

    /**
     * Returns the first contrato in the ordered set where email LIKE &#63;.
     *
     * @param email the email
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching contrato, or <code>null</code> if a matching contrato could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByEmail_First(String email,
        OrderByComparator orderByComparator) throws SystemException {
        List<Contrato> list = findByEmail(email, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Contrato findByEmail_Last(String email,
        OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = fetchByEmail_Last(email, orderByComparator);

        if (contrato != null) {
            return contrato;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("email=");
        msg.append(email);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchContratoException(msg.toString());
    }

    /**
     * Returns the last contrato in the ordered set where email LIKE &#63;.
     *
     * @param email the email
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching contrato, or <code>null</code> if a matching contrato could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByEmail_Last(String email,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByEmail(email);

        if (count == 0) {
            return null;
        }

        List<Contrato> list = findByEmail(email, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Contrato[] findByEmail_PrevAndNext(long contratoId, String email,
        OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = findByPrimaryKey(contratoId);

        Session session = null;

        try {
            session = openSession();

            Contrato[] array = new ContratoImpl[3];

            array[0] = getByEmail_PrevAndNext(session, contrato, email,
                    orderByComparator, true);

            array[1] = contrato;

            array[2] = getByEmail_PrevAndNext(session, contrato, email,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Contrato getByEmail_PrevAndNext(Session session,
        Contrato contrato, String email, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CONTRATO_WHERE);

        boolean bindEmail = false;

        if (email == null) {
            query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
        } else if (email.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
        } else {
            bindEmail = true;

            query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ContratoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindEmail) {
            qPos.add(email.toLowerCase());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(contrato);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Contrato> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the contratos where email LIKE &#63; from the database.
     *
     * @param email the email
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByEmail(String email) throws SystemException {
        for (Contrato contrato : findByEmail(email, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(contrato);
        }
    }

    /**
     * Returns the number of contratos where email LIKE &#63;.
     *
     * @param email the email
     * @return the number of matching contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByEmail(String email) throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_EMAIL;

        Object[] finderArgs = new Object[] { email };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CONTRATO_WHERE);

            boolean bindEmail = false;

            if (email == null) {
                query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
            } else if (email.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
            } else {
                bindEmail = true;

                query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindEmail) {
                    qPos.add(email.toLowerCase());
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the contratos where unidade LIKE &#63;.
     *
     * @param unidade the unidade
     * @return the matching contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Contrato> findByEmpresa(String unidade)
        throws SystemException {
        return findByEmpresa(unidade, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Contrato> findByEmpresa(String unidade, int start, int end)
        throws SystemException {
        return findByEmpresa(unidade, start, end, null);
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
    @Override
    public List<Contrato> findByEmpresa(String unidade, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPRESA;
        finderArgs = new Object[] { unidade, start, end, orderByComparator };

        List<Contrato> list = (List<Contrato>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Contrato contrato : list) {
                if (!StringUtil.wildcardMatches(contrato.getUnidade(), unidade,
                            CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, false)) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CONTRATO_WHERE);

            boolean bindUnidade = false;

            if (unidade == null) {
                query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_1);
            } else if (unidade.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_3);
            } else {
                bindUnidade = true;

                query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ContratoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUnidade) {
                    qPos.add(unidade.toLowerCase());
                }

                if (!pagination) {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Contrato>(list);
                } else {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Contrato findByEmpresa_First(String unidade,
        OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = fetchByEmpresa_First(unidade, orderByComparator);

        if (contrato != null) {
            return contrato;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("unidade=");
        msg.append(unidade);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchContratoException(msg.toString());
    }

    /**
     * Returns the first contrato in the ordered set where unidade LIKE &#63;.
     *
     * @param unidade the unidade
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching contrato, or <code>null</code> if a matching contrato could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByEmpresa_First(String unidade,
        OrderByComparator orderByComparator) throws SystemException {
        List<Contrato> list = findByEmpresa(unidade, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Contrato findByEmpresa_Last(String unidade,
        OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = fetchByEmpresa_Last(unidade, orderByComparator);

        if (contrato != null) {
            return contrato;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("unidade=");
        msg.append(unidade);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchContratoException(msg.toString());
    }

    /**
     * Returns the last contrato in the ordered set where unidade LIKE &#63;.
     *
     * @param unidade the unidade
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching contrato, or <code>null</code> if a matching contrato could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByEmpresa_Last(String unidade,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByEmpresa(unidade);

        if (count == 0) {
            return null;
        }

        List<Contrato> list = findByEmpresa(unidade, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Contrato[] findByEmpresa_PrevAndNext(long contratoId,
        String unidade, OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = findByPrimaryKey(contratoId);

        Session session = null;

        try {
            session = openSession();

            Contrato[] array = new ContratoImpl[3];

            array[0] = getByEmpresa_PrevAndNext(session, contrato, unidade,
                    orderByComparator, true);

            array[1] = contrato;

            array[2] = getByEmpresa_PrevAndNext(session, contrato, unidade,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Contrato getByEmpresa_PrevAndNext(Session session,
        Contrato contrato, String unidade, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CONTRATO_WHERE);

        boolean bindUnidade = false;

        if (unidade == null) {
            query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_1);
        } else if (unidade.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_3);
        } else {
            bindUnidade = true;

            query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ContratoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUnidade) {
            qPos.add(unidade.toLowerCase());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(contrato);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Contrato> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the contratos where unidade LIKE &#63; from the database.
     *
     * @param unidade the unidade
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByEmpresa(String unidade) throws SystemException {
        for (Contrato contrato : findByEmpresa(unidade, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(contrato);
        }
    }

    /**
     * Returns the number of contratos where unidade LIKE &#63;.
     *
     * @param unidade the unidade
     * @return the number of matching contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByEmpresa(String unidade) throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_EMPRESA;

        Object[] finderArgs = new Object[] { unidade };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CONTRATO_WHERE);

            boolean bindUnidade = false;

            if (unidade == null) {
                query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_1);
            } else if (unidade.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_3);
            } else {
                bindUnidade = true;

                query.append(_FINDER_COLUMN_EMPRESA_UNIDADE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUnidade) {
                    qPos.add(unidade.toLowerCase());
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the contratos where nomeContrato LIKE &#63;.
     *
     * @param nomeContrato the nome contrato
     * @return the matching contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Contrato> findByContrato(String nomeContrato)
        throws SystemException {
        return findByContrato(nomeContrato, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Contrato> findByContrato(String nomeContrato, int start, int end)
        throws SystemException {
        return findByContrato(nomeContrato, start, end, null);
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
    @Override
    public List<Contrato> findByContrato(String nomeContrato, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTRATO;
        finderArgs = new Object[] { nomeContrato, start, end, orderByComparator };

        List<Contrato> list = (List<Contrato>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Contrato contrato : list) {
                if (!StringUtil.wildcardMatches(contrato.getNomeContrato(),
                            nomeContrato, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, false)) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CONTRATO_WHERE);

            boolean bindNomeContrato = false;

            if (nomeContrato == null) {
                query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_1);
            } else if (nomeContrato.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_3);
            } else {
                bindNomeContrato = true;

                query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ContratoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNomeContrato) {
                    qPos.add(nomeContrato.toLowerCase());
                }

                if (!pagination) {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Contrato>(list);
                } else {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Contrato findByContrato_First(String nomeContrato,
        OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = fetchByContrato_First(nomeContrato,
                orderByComparator);

        if (contrato != null) {
            return contrato;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nomeContrato=");
        msg.append(nomeContrato);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchContratoException(msg.toString());
    }

    /**
     * Returns the first contrato in the ordered set where nomeContrato LIKE &#63;.
     *
     * @param nomeContrato the nome contrato
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching contrato, or <code>null</code> if a matching contrato could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByContrato_First(String nomeContrato,
        OrderByComparator orderByComparator) throws SystemException {
        List<Contrato> list = findByContrato(nomeContrato, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Contrato findByContrato_Last(String nomeContrato,
        OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = fetchByContrato_Last(nomeContrato, orderByComparator);

        if (contrato != null) {
            return contrato;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nomeContrato=");
        msg.append(nomeContrato);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchContratoException(msg.toString());
    }

    /**
     * Returns the last contrato in the ordered set where nomeContrato LIKE &#63;.
     *
     * @param nomeContrato the nome contrato
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching contrato, or <code>null</code> if a matching contrato could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByContrato_Last(String nomeContrato,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByContrato(nomeContrato);

        if (count == 0) {
            return null;
        }

        List<Contrato> list = findByContrato(nomeContrato, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Contrato[] findByContrato_PrevAndNext(long contratoId,
        String nomeContrato, OrderByComparator orderByComparator)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = findByPrimaryKey(contratoId);

        Session session = null;

        try {
            session = openSession();

            Contrato[] array = new ContratoImpl[3];

            array[0] = getByContrato_PrevAndNext(session, contrato,
                    nomeContrato, orderByComparator, true);

            array[1] = contrato;

            array[2] = getByContrato_PrevAndNext(session, contrato,
                    nomeContrato, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Contrato getByContrato_PrevAndNext(Session session,
        Contrato contrato, String nomeContrato,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CONTRATO_WHERE);

        boolean bindNomeContrato = false;

        if (nomeContrato == null) {
            query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_1);
        } else if (nomeContrato.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_3);
        } else {
            bindNomeContrato = true;

            query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ContratoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindNomeContrato) {
            qPos.add(nomeContrato.toLowerCase());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(contrato);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Contrato> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the contratos where nomeContrato LIKE &#63; from the database.
     *
     * @param nomeContrato the nome contrato
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByContrato(String nomeContrato) throws SystemException {
        for (Contrato contrato : findByContrato(nomeContrato,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(contrato);
        }
    }

    /**
     * Returns the number of contratos where nomeContrato LIKE &#63;.
     *
     * @param nomeContrato the nome contrato
     * @return the number of matching contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByContrato(String nomeContrato) throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_CONTRATO;

        Object[] finderArgs = new Object[] { nomeContrato };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CONTRATO_WHERE);

            boolean bindNomeContrato = false;

            if (nomeContrato == null) {
                query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_1);
            } else if (nomeContrato.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_3);
            } else {
                bindNomeContrato = true;

                query.append(_FINDER_COLUMN_CONTRATO_NOMECONTRATO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNomeContrato) {
                    qPos.add(nomeContrato.toLowerCase());
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the contrato in the entity cache if it is enabled.
     *
     * @param contrato the contrato
     */
    @Override
    public void cacheResult(Contrato contrato) {
        EntityCacheUtil.putResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoImpl.class, contrato.getPrimaryKey(), contrato);

        contrato.resetOriginalValues();
    }

    /**
     * Caches the contratos in the entity cache if it is enabled.
     *
     * @param contratos the contratos
     */
    @Override
    public void cacheResult(List<Contrato> contratos) {
        for (Contrato contrato : contratos) {
            if (EntityCacheUtil.getResult(
                        ContratoModelImpl.ENTITY_CACHE_ENABLED,
                        ContratoImpl.class, contrato.getPrimaryKey()) == null) {
                cacheResult(contrato);
            } else {
                contrato.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all contratos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ContratoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ContratoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the contrato.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Contrato contrato) {
        EntityCacheUtil.removeResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoImpl.class, contrato.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Contrato> contratos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Contrato contrato : contratos) {
            EntityCacheUtil.removeResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
                ContratoImpl.class, contrato.getPrimaryKey());
        }
    }

    /**
     * Creates a new contrato with the primary key. Does not add the contrato to the database.
     *
     * @param contratoId the primary key for the new contrato
     * @return the new contrato
     */
    @Override
    public Contrato create(long contratoId) {
        Contrato contrato = new ContratoImpl();

        contrato.setNew(true);
        contrato.setPrimaryKey(contratoId);

        return contrato;
    }

    /**
     * Removes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param contratoId the primary key of the contrato
     * @return the contrato that was removed
     * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato remove(long contratoId)
        throws NoSuchContratoException, SystemException {
        return remove((Serializable) contratoId);
    }

    /**
     * Removes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the contrato
     * @return the contrato that was removed
     * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato remove(Serializable primaryKey)
        throws NoSuchContratoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Contrato contrato = (Contrato) session.get(ContratoImpl.class,
                    primaryKey);

            if (contrato == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchContratoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(contrato);
        } catch (NoSuchContratoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Contrato removeImpl(Contrato contrato) throws SystemException {
        contrato = toUnwrappedModel(contrato);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(contrato)) {
                contrato = (Contrato) session.get(ContratoImpl.class,
                        contrato.getPrimaryKeyObj());
            }

            if (contrato != null) {
                session.delete(contrato);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (contrato != null) {
            clearCache(contrato);
        }

        return contrato;
    }

    @Override
    public Contrato updateImpl(br.com.gndi.liferay.model.Contrato contrato)
        throws SystemException {
        contrato = toUnwrappedModel(contrato);

        boolean isNew = contrato.isNew();

        Session session = null;

        try {
            session = openSession();

            if (contrato.isNew()) {
                session.save(contrato);

                contrato.setNew(false);
            } else {
                session.merge(contrato);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ContratoModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
            ContratoImpl.class, contrato.getPrimaryKey(), contrato);

        return contrato;
    }

    protected Contrato toUnwrappedModel(Contrato contrato) {
        if (contrato instanceof ContratoImpl) {
            return contrato;
        }

        ContratoImpl contratoImpl = new ContratoImpl();

        contratoImpl.setNew(contrato.isNew());
        contratoImpl.setPrimaryKey(contrato.getPrimaryKey());

        contratoImpl.setContratoId(contrato.getContratoId());
        contratoImpl.setGroupId(contrato.getGroupId());
        contratoImpl.setCompanyId(contrato.getCompanyId());
        contratoImpl.setUserId(contrato.getUserId());
        contratoImpl.setUserName(contrato.getUserName());
        contratoImpl.setCreateDate(contrato.getCreateDate());
        contratoImpl.setModifiedDate(contrato.getModifiedDate());
        contratoImpl.setUnidade(contrato.getUnidade());
        contratoImpl.setGrupoContrato(contrato.getGrupoContrato());
        contratoImpl.setContrato(contrato.getContrato());
        contratoImpl.setNomeContrato(contrato.getNomeContrato());
        contratoImpl.setSubContrato(contrato.getSubContrato());
        contratoImpl.setNomeSubContrato(contrato.getNomeSubContrato());
        contratoImpl.setCodigoPlano(contrato.getCodigoPlano());
        contratoImpl.setNomePlano(contrato.getNomePlano());
        contratoImpl.setEmail(contrato.getEmail());
        contratoImpl.setEmail1(contrato.getEmail1());
        contratoImpl.setEmail2(contrato.getEmail2());
        contratoImpl.setEmail3(contrato.getEmail3());
        contratoImpl.setEmail4(contrato.getEmail4());
        contratoImpl.setEmail5(contrato.getEmail5());
        contratoImpl.setResposta(contrato.getResposta());
        contratoImpl.setDataEnvio(contrato.getDataEnvio());
        contratoImpl.setDataResposta(contrato.getDataResposta());
        contratoImpl.setDataCadastro(contrato.getDataCadastro());

        return contratoImpl;
    }

    /**
     * Returns the contrato with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the contrato
     * @return the contrato
     * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato findByPrimaryKey(Serializable primaryKey)
        throws NoSuchContratoException, SystemException {
        Contrato contrato = fetchByPrimaryKey(primaryKey);

        if (contrato == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchContratoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return contrato;
    }

    /**
     * Returns the contrato with the primary key or throws a {@link br.com.gndi.liferay.NoSuchContratoException} if it could not be found.
     *
     * @param contratoId the primary key of the contrato
     * @return the contrato
     * @throws br.com.gndi.liferay.NoSuchContratoException if a contrato with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato findByPrimaryKey(long contratoId)
        throws NoSuchContratoException, SystemException {
        return findByPrimaryKey((Serializable) contratoId);
    }

    /**
     * Returns the contrato with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the contrato
     * @return the contrato, or <code>null</code> if a contrato with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Contrato contrato = (Contrato) EntityCacheUtil.getResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
                ContratoImpl.class, primaryKey);

        if (contrato == _nullContrato) {
            return null;
        }

        if (contrato == null) {
            Session session = null;

            try {
                session = openSession();

                contrato = (Contrato) session.get(ContratoImpl.class, primaryKey);

                if (contrato != null) {
                    cacheResult(contrato);
                } else {
                    EntityCacheUtil.putResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
                        ContratoImpl.class, primaryKey, _nullContrato);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
                    ContratoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return contrato;
    }

    /**
     * Returns the contrato with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param contratoId the primary key of the contrato
     * @return the contrato, or <code>null</code> if a contrato with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Contrato fetchByPrimaryKey(long contratoId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) contratoId);
    }

    /**
     * Returns all the contratos.
     *
     * @return the contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Contrato> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Contrato> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Contrato> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Contrato> list = (List<Contrato>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CONTRATO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CONTRATO;

                if (pagination) {
                    sql = sql.concat(ContratoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Contrato>(list);
                } else {
                    list = (List<Contrato>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the contratos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Contrato contrato : findAll()) {
            remove(contrato);
        }
    }

    /**
     * Returns the number of contratos.
     *
     * @return the number of contratos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_CONTRATO);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the contrato persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.br.com.gndi.liferay.model.Contrato")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Contrato>> listenersList = new ArrayList<ModelListener<Contrato>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Contrato>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ContratoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
