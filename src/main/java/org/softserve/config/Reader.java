package org.softserve.config;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Reader {

    private static Config config;
    private Reader(){}
    public static Config getConfig(){
        ObjectMapper mapper = new ObjectMapper();
        if (config == null) {
            try {
                config = mapper.readValue(new File("src/main/resources/config.json"), Config.class);
            }catch (IOException ioException){

            }
        }
        return config;
    }
}