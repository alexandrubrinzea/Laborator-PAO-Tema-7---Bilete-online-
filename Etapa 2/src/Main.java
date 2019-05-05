import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Services service = Services.getService();


    public static void main(String[] args) throws Exception
    {
        int option;
        Scanner input = new Scanner(System.in);

        Events e1 = new Concerts("Metallica30", "CONCERT", 1234, "2019-11-21 20:30:00", "2019-11-22 01:30:00", new String[]{"Metallica", "Ghost"}, "Black Album",
                new Venue("Arena Nationala", 50000, true, false));
        Events e2 = new ArtGalleries("Expozitie Brancusi", "ART", 1516, "2019-11-25 08:00:00", "2019-12-22 20:00:00", "Brancusi", "Sculpturi", new Venue("Muzeu de arta", 2000, false, false));
        Events e3 = new Concerts("Bullet For My Valentine", "CONCERT", 1264, "2019-12-21 20:30:00", "2019-12-22 01:30:00", new String[]{"Bullet For My Valetine", "The Word Alive"}, "BFMV",
                new Venue("Arena Nationala", 50000, true, false));
        Services s1 = new Services();

        List<Events> listOfEvents = new ArrayList<Events>();

        listOfEvents.add(e1);
        listOfEvents.add(e2);
        listOfEvents.add(e3);

        System.out.println("What would you like to do? \n 1. Print all concerts \n 2. Print all art galleries \n 3. Print all galleries");
        option = input.nextInt();

        switch(option)
        {
            case 1:
                s1.setListOfEvents(listOfEvents);
                s1.printConcerts(s1.getConcerts());
                break;

            case 2:
                s1.setListOfEvents(listOfEvents);
                s1.printAllGalleries(s1.getArtGalleries());
                break;
        }

    }
}
