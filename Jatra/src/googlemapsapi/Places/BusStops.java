package googlemapsapi.Places;

import googlemapsapi.Others.Results;
import java.util.List;

public class BusStops {

    public List<Results> results;
    public String next_page_token;

    public BusStops(List<Results> results, String next_page_token) {
        this.results = results;
        this.next_page_token = next_page_token;
    }

    public String getNext_page_token() {
        return next_page_token;
    }

    public BusStops(List<Results> results) {
        this.results = results;
    }

}
