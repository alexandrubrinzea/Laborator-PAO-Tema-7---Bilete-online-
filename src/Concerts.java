import java.util.Date;
import java.lang.String;

public class Concerts extends Events{
    private String[] Artists;
    private String Tour;

    public Concerts() throws Exception{
        super();
    }

    public Concerts(String eventName, String eventType, int uniqueCode, String stringStartDate, String stringEndDate, String[] artists, String tour, Venue location) throws Exception{
        super(eventName, eventType, uniqueCode, stringStartDate, stringEndDate, location);
        Artists = artists;
        Tour = tour;
    }

    public String getTour() {
        return Tour;
    }

    public void setTour(String tour) {
        Tour = tour;
    }
}
