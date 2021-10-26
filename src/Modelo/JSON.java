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
import java.util.HashMap;
import java.util.List;

//class for read json files
public class JSON {

    ArrayList<Automata> automatas = new ArrayList<Automata>();
    Automata automata = null;

    //método para leer archivos json 
    public  ArrayList<Automata>  readJSONFile() {
        JSONParser jsonParser = new JSONParser();
        try {
            Object jsonFile = jsonParser.parse(new FileReader("..\\proyectoAutomatas\\automatas.json"));
            JSONObject jsonObjects = (JSONObject) jsonFile;
            Iterator entries = jsonObjects.entrySet().iterator();
            String automata = "";
            Map<String, Object> valor = new HashMap<>();
            String estadoInicial = "";
            String[] alfabeto = new String[2];
            String estadoFinal = "";
            String[] estados = new String[5];
            List<ArrayList> transiciones = new ArrayList<>();

            while (entries.hasNext()) {
                Map.Entry entry = (Map.Entry) entries.next();
                automata = (String) entry.getKey();
                valor = (Map) entry.getValue();
                //obtener estados
                JSONArray estadoTemporales = (JSONArray) valor.get("estados");
                for (int i = 0; i < estadoTemporales.size(); i++) {
                    estados[i] = (String) estadoTemporales.get(i);
                }
                //obtener transiciones
                JSONArray transicionesTemporales = (JSONArray) valor.get("transiciones");
                for (int i = 0; i < transicionesTemporales.size(); i++) {
                    JSONArray transicion = (JSONArray) transicionesTemporales.get(i);
                    transiciones.add(transicion);
                }
                estadoInicial = (String) valor.get("estadoInicial");
                estadoFinal = (String) valor.get("estadoFinal");
                //obtener alfabeto
                JSONArray alfTemporales = (JSONArray) valor.get("alfabeto");
                for (int i = 0; i < alfTemporales.size(); i++) {
                    alfabeto[i] = (String) alfTemporales.get(i);
                }

                //organizar estados
               Automata at = new Automata(estados, alfabeto, estadoInicial, estadoFinal, transiciones);
               automatas.add(at);               
            }
            
            return automatas;

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ParseException e) {
            System.out.println(e);
        }
        
        return null;
    }

    public static void main(String[] args) {
        //readJSONFile();
    }
}
