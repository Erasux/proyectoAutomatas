package Modelo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//class for read json files
public class JSON {

    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try {
            Object obj = jsonParser.parse(new FileReader("\\automatas.json"));
            JSONObject jsonObject = (JSONObject) obj;

            String hola = "";

        } catch (FileNotFoundException e) {
            //manejo de error
        } catch (IOException e) {
            //manejo de error
        } catch (ParseException e) {
            //manejo de error
        }
    }

}
