package googlemapsapi;

import java.util.List;

public class AutoCompleteAddress {

    public List<Prediction> predictions;

    public AutoCompleteAddress(List<Prediction> predictions) {
        this.predictions = predictions;
    }

    public AutoCompleteAddress() {

    }
}

class Prediction {

    private String description;
    private String id;
    private String place_id;
    private String reference;
    private Structured_formatting structured_formatting;

    public Prediction(String description, String id, String place_id, String reference, Structured_formatting structured_formatting) {
        this.description = description;
        this.id = id;
        this.place_id = place_id;
        this.reference = reference;
        this.structured_formatting = structured_formatting;
    }

    //inner class
    class Structured_formatting {

        private String main_text;

        public Structured_formatting(String main_text) {
            this.main_text = main_text;
        }

        public String getMain_text() {
            return main_text;
        }

        public void setMain_text(String main_text) {
            this.main_text = main_text;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Structured_formatting getStructured_formatting() {
        return structured_formatting;
    }

    public void setStructured_formatting(Structured_formatting structured_formatting) {
        this.structured_formatting = structured_formatting;
    }

}
