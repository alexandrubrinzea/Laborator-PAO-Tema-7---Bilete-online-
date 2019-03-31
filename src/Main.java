import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    private static Services service = Services.getService();


    public static void main(String[] args) throws Exception
    {
        int option;
        Scanner input = new Scanner(System.in);
//        System.out.println("What type of event are you interested in? \n 1. Concerts \n 2. Theatres \n 3. Stand up Shows");
//        option = input.nextInt();
//
//        switch(option)
//        {
//            case 1:
//
//        }
        Events e1 = new Concerts("Metallica30", "CONCERT", 1234, "2019-11-21 20:30:00", "2019-11-22 01:30:00", new String[]{"Metallica", "Ghost"}, "Black Album",
                new Venue("Arena Nationala", 50000, true, false));
        Events e2 = new ArtGalleries("Expozitie Brancusi", "ART", 1516, "2019-11-25 08:00:00", "2019-12-22 20:00:00", "Brancusi", "Sculpturi", new Venue("Muzeu de arta", 2000, false, false));
//        if (e1.getEventType() == "CONCERT") service.printConcerts(service.getConcerts());

    }
}
