import java.util.ArrayList;
import java.util.List;

public class Services {
    private List<Events> listOfEvents;

    private static Services services = new Services();

    public Services() {
    }

    public static Services getService() {
        return services;
    }

    public List<Concerts> getConcerts() throws Exception{
        List<Concerts> concerts = new ArrayList<>();

        for (Events event : listOfEvents)
            if (event instanceof Concerts)
                concerts.add((Concerts) event);
        return concerts;
    }

    public void printConcerts(List<Concerts> allConcerts){
        int counter = 0;
        for (Concerts event : allConcerts) {
            System.out.println(++counter + ". " + event.getEventName());
        }
    }
}
