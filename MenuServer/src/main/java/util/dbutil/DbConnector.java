package util.dbutil;

import data.User;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.log4j.Logger;

import java.beans.PropertyVetoException;
import java.security.MessageDigest;
import java.util.List;

public class DbConnector {

    private static Logger logger = Logger.getLogger(DbConnector.class);
    private static DataSource dataSource;
    private static volatile DbConnector dbconnector;
    private static Object syncObject = new Object();
    private MessageDigest hashFunction;

    private DbConnector(String configFile) {
        try {
            logger.info("Creating new datasource");
            dataSource = new DataSource(configFile);
        } catch (PropertyVetoException e) {
            logger.error(e.getMessage(), e);
        } catch (ConfigurationException e) {
            logger.error(e.getMessage(), e);
        }
    }

    public static DbConnector getInstance(String file) {
        dbconnector = new DbConnector(file);
        return dbconnector;
    }

    //TODO add db methods here


    //TODO Complete method
    public boolean login(String user, String password) {
        return false;
    }

    //TODO complete method
    public List<User> getMatches(User user) {
        return null;
    }
}
