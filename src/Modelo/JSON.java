package Modelo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import Modelo.Automata;
import java.util.ArrayList;

//class for read json files
public class JSON {

    ArrayList<Automata> automatas = new ArrayList<Automata>();

    //método para leer archivos json 
    public void readJSONFile() {
        JSONParser jsonParser = new JSONParser();
        try {
            Object jsonFile = jsonParser.parse(new FileReader("..\\proyectoAutomatas\\automatas.json"));
            JSONObject jsonObjects = (JSONObject) jsonFile;
            Iterator entries = jsonObjects.entrySet().iterator();
            String automata = "";
            Object valor = null;
            while (entries.hasNext()) {
                Map.Entry entry = (Map.Entry) entries.next();
                automata = (String) entry.getKey();
                valor = (Object) entry.getValue();
            }

            String hola = "";

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}
