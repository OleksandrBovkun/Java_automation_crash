package org.softserve.config;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reader {

    private static Config config;
    private Reader(){}
    public static Config getConfig(){
        ObjectMapper mapper = new ObjectMapper();
        final  Logger logger = Logger.getLogger("Reader LOGGER");
        if (config == null) {
            try {
                config = mapper.readValue(new File("src/main/resources/config.json"), Config.class);
            }catch (IOException ioException){
                logger.log(Level.WARNING, ioException.getMessage());
            }
        }
        return config;
    }
}