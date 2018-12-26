import com.google.gson.Gson;
import org.apache.log4j.Logger;

import static spark.Spark.get;

public class MenuSparkServer {
    private static Logger logger = Logger.getLogger(MenuSparkServer.class);
    private static Gson gson = new Gson();
    private static int port;
    private static String htmlLocation;

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
