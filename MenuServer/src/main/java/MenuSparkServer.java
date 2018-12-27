import com.google.gson.Gson;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import static spark.Spark.externalStaticFileLocation;
import static spark.Spark.get;
import static spark.Spark.port;

public class MenuSparkServer {
    private static Logger logger = Logger.getLogger(MenuSparkServer.class);
    private static Gson gson = new Gson();
    private static int port;
    private static String htmlLocation;


    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Not enough arguments require config files!");
        }
        try {
            logger.info(args[0]);
            logger.info(args[1]);
            getConfigurations(args[0]);
        } catch (ConfigurationException e) {
            throw new IllegalArgumentException("Config File was not an acutal config file!");
        }

        externalStaticFileLocation(htmlLocation);
        port(port);

        //TODO complete rest of REST API, get put etc
        get("/hello", (req, res) -> "Hello World");
    }


    private static void getConfigurations(String file) throws ConfigurationException {
        PropertiesConfiguration propertiesConfig = new PropertiesConfiguration(file);
        port = propertiesConfig.getInt("port");
        htmlLocation = propertiesConfig.getString("html.location");
    }


}
