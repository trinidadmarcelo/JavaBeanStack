package org.javabeanstack.security;

import java.io.Serializable;
import java.util.Date;
import org.javabeanstack.error.IErrorReg;
import org.javabeanstack.model.IEmpresa;
import org.javabeanstack.model.IUser;

/**
 *
 * @author Jorge Enciso
 */
public interface IUserSession extends Serializable {

    /**
     *
     * @return Devuelve el objeto empresa a la cual se accedio en esta sesión.
     */
    IEmpresa getEmpresa();

    /**
     *
     * @return Devuelve un objeto error si la creación de la sesión no fue exitosa
     */
    IErrorReg getError();

    /**
     *
     * @return Devuelve el nombre de la máquina desde la cual fue creada la sesión.
     */
    String getHost();

    /**
     *
     * @return Devuelve el ip de la terminal, desde la cual fue creada la sesión
     */
    String getIp();

    /**
     *
     * @return Devuelve la ultima fecha y hora que se hizo referencia a la sesión.
     */
    Date getLastReference();

    /**
     *
     * @return Devuelve la unidad de persistencia donde se encuentra la configuración
     * para acceso a la base de datos donde esta la información de la empresa logeada
     */
    String getPersistenceUnit();

    /**
     *
     * @return Devuelve el identificador de la sesión
     */
    String getSessionId();

    /**
     *
     * @return Devuelve la fecha y hora que fue logeada la sesión
     */
    Date getTimeLogin();
    Long getIdEmpresa();
    Integer getIdleSessionExpireInMinutes();
    /**
     *
     * @return Devuelve el objeto usuario
     */
    IUser getUser();
    void setEmpresa(IEmpresa empresa);
    void setIdEmpresa(Long idempresa);    
    void setError(IErrorReg error);
    void setHost(String host);
    void setIp(String ip);
    void setLastReference(Date date);
    void setPersistenceUnit(String persistenceUnit);
    void setSessionId(String sessionId);
    void setTimeLogin(Date timeLogin);
    void setUser(IUser user);
    void setIdleSessionExpireInMinutes(Integer minutes);
}
