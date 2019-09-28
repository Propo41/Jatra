/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.Maps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JFrame;

/**
 *
 * @author Swapnil
 */
public class ShowBusStops {

    private static String url;
    private static List<googlemapsapi.Others.Location> stopList;

    /*
    used to show the list of bus Stops a bus travels through. Called from Bus Details window
     */
    public ShowBusStops(String type, int busID) throws IOException {

        //using the busID, fetch all the busStops cordinates that bus travels through.
        stopList = new database.dataBaseSQL().getLocationOfBusStops(busID);
        createURL();
        start();

    }

    //this is called when debugging from this main method
    public ShowBusStops() throws IOException {

        stopList = new database.dataBaseSQL().getLocationOfBusStops(5);
        createURL();
        //  start();
    }

    private static void createURL() throws IOException {

        // <editor-fold defaultstate="collapsed" desc="MAPS JAVASCRIPT API URL">
        url = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "\n"
                + "<head>\n"
                + "    <style>\n"
                + "        /*  <span class=\"metadata-marker\" style=\"display: none;\" data-region_tag=\"css\"></span>       Set the size of the div element that contains the map */\n"
                + "        #map {\n"
                + "            height: 600px;\n"
                + "            /* The height is 400 pixels */\n"
                + "            width: 100%;\n"
                + "            /* The width is the width of the web page */\n"
                + "        }\n"
                + "    </style>\n"
                + "    <script>\n"
                + "        var map;\n"
                + "        var InforObj = [];\n"
                + calculateCenterCords()
                + createMarkers()
                + "\n"
                + "        window.onload = function () {\n"
                + "            initMap();\n"
                + "        };\n"
                + "\n"
                + "        function addMarkerInfo() {\n"
                + "            for (var i = 0; i < markersOnMap.length; i++) {\n"
                + "                var contentString = '<div id=\"content\"><h1>' + markersOnMap[i].placeName +\n"
                + "                    '</h1><p>Lorem ipsum dolor sit amet, vix mutat posse suscipit id, vel ea tantas omittam detraxit.</p></div>';\n"
                + "\n"
                + "                const marker = new google.maps.Marker({\n"
                + "                    position: markersOnMap[i].LatLng[0],\n"
                + "                    map: map\n"
                + "                });\n"
                + "\n"
                + "                const infowindow = new google.maps.InfoWindow({\n"
                + "                    content: contentString,\n"
                + "                    maxWidth: 200\n"
                + "                });\n"
                + "\n"
                + "                marker.addListener('click', function () {\n"
                + "                    closeOtherInfo();\n"
                + "                    infowindow.open(marker.get('map'), marker);\n"
                + "                    InforObj[0] = infowindow;\n"
                + "                });\n"
                + "                 marker.addListener('mouseover', function () {\n"
                + "                     closeOtherInfo();\n"
                + "                    infowindow.open(marker.get('map'), marker);\n"
                + "                     InforObj[0] = infowindow;\n"
                + "                 });\n"
                + "                 marker.addListener('mouseout', function () {\n"
                + "                    closeOtherInfo();\n"
                + "                     infowindow.close();\n"
                + "                     InforObj[0] = infowindow;\n"
                + "                 });\n"
                + "            }\n"
                + "        }\n"
                + "\n"
                + "        function closeOtherInfo() {\n"
                + "            if (InforObj.length > 0) {\n"
                + "                /* detach the info-window from the marker ... undocumented in the API docs */\n"
                + "                InforObj[0].set(\"marker\", null);\n"
                + "                /* and close it */\n"
                + "                InforObj[0].close();\n"
                + "                /* blank the array */\n"
                + "                InforObj.length = 0;\n"
                + "            }\n"
                + "        }\n"
                + "\n"
                + "        function initMap() {\n"
                + "            map = new google.maps.Map(document.getElementById('map'), {\n"
                + "                zoom: 12,\n"
                + "                center: centerCords\n"
                + "            });\n"
                + "            addMarkerInfo();\n"
                + "        }\n"
                + "    </script>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "    <h3>Target Stops</h3>\n"
                + "    <!--The div element for the map -->\n"
                + "    <div id=\"map\"></div>\n"
                + "\n"
                + "    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDfAKN5tfaNv6CfPgwkcoSW9vmmgwYdM1A\"></script>\n"
                + "\n"
                + "</body>\n"
                + "\n"
                + "</html>";
        // </editor-fold>

        BufferedWriter out = new BufferedWriter(new FileWriter("map.html"));
        out.write(url);
        out.close();

    }

    /*
    the function iterates thru all the cords lat and long and finds the average
    this is necessary for the map to center itself around the markers.
     */
    private static String calculateCenterCords() {

        double avgLat = 0, avgLng = 0;

        // find the average of the lat
        for (int i = 0; i < stopList.size(); i++) {

            avgLat += stopList.get(i).getLat();
            avgLng += stopList.get(i).getLng();
        }
        avgLat /= stopList.size();
        avgLng /= stopList.size();

        String centerCords = "var centerCords = {"
                + "lat: " + avgLat + ", "
                + "lng: " + avgLng
                + "};";

        return centerCords;

    }

    private static String createMarkers() {

        String markers = "var markersOnMap = ["
                + createLocations()
                + "];";

        return markers;

    }

    private static String createLocations() {

        //  String temp = "New bus";
        //double lat = 23.7504831, lng = 90.3788895;
        //int noOfBusStops = 1;
        String location = "";

        int noOfBusStops = stopList.size();

        for (int i = 0; i < noOfBusStops; i++) {

            location += "{"
                    + "placeName: \"" + stopList.get(i).getStopName() + "\", "
                    + "LatLng: [{ "
                    + "lat: " + stopList.get(i).getLat() + ", "
                    + "lng: " + stopList.get(i).getLng()
                    + "}]"
                    + "}";

            if (i < noOfBusStops - 1) {

                location += ",";
            }

        }

        return location;

    }

    public void start() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFXPanel jfxPanel = new JFXPanel();

                jFrame = new JFrame();
                jFrame.add(jfxPanel);

                Platform.runLater(() -> {
                    WebView webView = new WebView();
                    jfxPanel.setScene(new Scene(webView));
                    webView.getEngine().load("file:///C:/Users/Swapnil/Documents/NetBeansProjects/Jatra/SD_Lab_Project_2/Jatra/map.html");

                });

                jFrame.setSize(800, 710);
                jFrame.setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {

        //  createURL();
        ShowBusStops showBusStops = new ShowBusStops();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFXPanel jfxPanel = new JFXPanel();

                jFrame = new JFrame();
                jFrame.add(jfxPanel);

                Platform.runLater(() -> {
                    WebView webView = new WebView();
                    jfxPanel.setScene(new Scene(webView));
                    webView.getEngine().load("file:///C:/Users/Swapnil/Documents/NetBeansProjects/Jatra/SD_Lab_Project_2/Jatra/map.html");

                });

                jFrame.setSize(800, 710);
                jFrame.setVisible(true);
            }
        });
    }

    private static JFrame jFrame;
}
