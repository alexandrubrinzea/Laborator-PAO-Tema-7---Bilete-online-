import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Events {
    private String eventName, eventType;
    private int uniqueCode;
    private Date startDate, endDate;
    Venue venue;

    public Events() {
    }

    //Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //String stringStartDate = formatter.format(startDate);
    //String stringEndDate = formatter.format(endDate);

    public Events(String eventName, String eventType, int uniqueCode, String stringStartDate, String stringEndDate, Venue venue) throws Exception{
        startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(stringStartDate);
       this.eventName = eventName;
       this.eventType = eventType;
       this.uniqueCode = uniqueCode;
       this.startDate = startDate;
       this.endDate = endDate;
       this.venue = venue;
    }

    public Venue getVenue() {
        return venue;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public int getUniqueCode() {
        return uniqueCode;
    }
}
