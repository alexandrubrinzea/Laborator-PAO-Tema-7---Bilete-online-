
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CSVReader {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Concerte.csv"));
        Scanner dataScanner = null;
        int index = 0;

        List<Events> evsList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            dataScanner = new Scanner(scanner.nextLine());
            dataScanner.useDelimiter(",");
            Events evs = new Events();

            while (dataScanner.hasNext()) {
                String data = dataScanner.next();
                if (index == 0)
                    evs.setEventType(Integer.parseInt(data));
                else if (index == 1)
                    evs.setEventName(data);
                else if (index == 2)
                    evs.setUniqueCode(data);
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            index = 0;
            evsList.add(evs);
        }

        scanner.close();

        System.out.println(evsList);

    }

}
