package br.com.renner.toolbox;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ToolsPage {

    public static String getJsonInput(String nomefeature, String file, String key)
            throws IOException, ParseException {

        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" +
                File.separator + "resources" + File.separator + "json" + File.separator ;

        JSONParser jsonParse = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParse
                .parse(new FileReader(path + file + ".json"));

        JSONObject getKey = (JSONObject) jsonObject.get(nomefeature);

        return String.valueOf(getKey.get(key));
    }

    public static String getJsonValidation(String nomefeature, String file, String key)
            throws IOException, ParseException {

        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" +
                File.separator + "resources" + File.separator + "json" + File.separator + "Validation" + File.separator;

        JSONParser jsonParse = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParse
                .parse(new FileReader(path + file + ".json"));

        JSONObject getKey = (JSONObject) jsonObject.get(nomefeature);

        return String.valueOf(getKey.get(key));
    }

    public static String getUserEmail(){
        String user = "kaiquerenling@gmail.com";
        return user;
    }

    public static String getPassword(){
        String senha = "123456";
        return senha;
    }

    public static String getCPF(){
        String cpf = "85492680030";
        return cpf;
    }
}
