/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.Others;

import googlemapsapi.Places.BusStops;
import googlemapsapi.Address.AutoCompleteAddress;
import com.google.gson.Gson;
import googlemapsapi.GeoCode.GeoCode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Swapnil
 */
public class Parser {

    /*
    Converts the https url to string object.
    taken from: https://stackoverflow.com/questions/4328711/read-url-to-string-in-few-lines-of-java-code

     */
    public static String convertURLtoString(String urlString) throws IOException {

        URL url = new URL(urlString);

        URLConnection conn = url.openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            String pageText = reader.lines().collect(Collectors.joining("\n"));
            return pageText;
        }

    }

    /*
    parses the json string that's sent as a parameter using the Gson library.
    The results are stored in an object of class AutoCompleteAddress.
     */
    public static AutoCompleteAddress deSerialize_Address(String jsonString) {

        Gson gson = new Gson();
        return gson.fromJson(jsonString, AutoCompleteAddress.class);

    }

    public static BusStops deSerialize_BusStops(String jsonString) {

        Gson gson = new Gson();
        return gson.fromJson(jsonString, BusStops.class);

    }

    public static GeoCode deSerialize_GeoCode(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, GeoCode.class);

    }

    public static void outputToFile(BusStops busStops, String type) {

        try {
            if (type.equals("current")) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("tempFiles/currentLocation_stops.txt"));
                int length = busStops.results.size();

                System.out.println("length: " + length);
                for (int i = 0; i < length; i++) {
                    writer.write(busStops.results.get(i).getName());
                    System.out.println("busStop: " + busStops.results.get(i).getName() + "  place_id: " + busStops.results.get(i).getPlace_id());
                    writer.newLine();
                }

                writer.close();

            } else {

                BufferedWriter writer = new BufferedWriter(new FileWriter("tempFiles/destLocation_stops.txt"));
                int length = busStops.results.size();

                for (int i = 0; i < length; i++) {
                    writer.write(busStops.results.get(i).getName());
                    writer.newLine();
                }

                writer.close();

            }
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("file writing successful");

    }

    public static List<String> readFromFile(String type) {

        List<String> list = new ArrayList<>();
        String str;
        try {

            if (type.equals("current")) {
                FileReader fr = new FileReader(new File("currentLocation_stops.txt"));
                BufferedReader br = new BufferedReader(fr);

                while ((str = br.readLine()) != null) {
                    list.add(str);
                }

            } else {

                FileReader fr = new FileReader(new File("destLocation_stops.txt"));
                BufferedReader br = new BufferedReader(fr);

                while ((str = br.readLine()) != null) {
                    list.add(str);
                }

            }

            return list;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;

    }

}
