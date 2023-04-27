package Commands;

import Organization.Organization;

import java.time.LocalDateTime;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Update extends Command{
    private static final String name = "update";
    private final static String description = ": Update value of field for organization from collection;";

    public static String getName(){return name;}
    public static String getDescription(){return description;}
    public static void update(){
        Integer id = arg.length > 0 ? parseInt(arg[0]) : -1;
        if (arg.length == 0)
        {
            System.out.println("Please input command in format: update 'id'");
            return;
        }
        try {
            final Organization t = org.stream().filter(o -> o.getId() == id).findFirst().orElseThrow();
            System.out.println("What do u wanna change: ");
            System.out.println("0 - nothing\n1 - name\n2 - coordinates\n3 - creation date\n4 - annual turnover\n5 - type\n6 - postal address");

            switch (scan.nextLine()) {
                case "0": case "nothing": case "-": break;
                case "1": case "name": case "Name": {System.out.print("Input <string> name: "); t.setName(scan.next());}
                case "2": case "coordinates": case "Coordinates": case "coordinate": case "Coordinate": {System.out.print("Input coordinates 'x <long>, y <double>': ");
                    t.setCoordinates(scan.next()); break;}
                case "3": case "date": case "Date": case "creation date": case "creationDate": case "creation_date": {System.out.print("Input date 'yyyy-mm-dd': ");
                    t.setCreationDate(LocalDateTime.parse(scan.next())); break;}
                case "4": case "annual turnover": case "annualTurnover": case "annualTurnOver": case "annual_turnover": case "annual_Turnover": case "annual_TurnOver": {System.out.print("Input <float> annual turnover: ");
                    t.setAnnualTurnover(scan.next()); break;}
                case "5": case "type": case "Type": {System.out.print("Input <string> type: ");
                    t.setType(scan.next()); break;}
                case "6": case "postalAddress": case "postal address": case "postal_address": case "postal addres": case "postal_addres": case "postal adress": case "postal_adress": case "postal adres": case "postal_adres": {System.out.print("Input postal address '<string> zipcode, <string> street, <int> x, <long> y, <string> town': ");
                    t.setPostalAddress(scan.next()); break;}


                default: throw new IllegalStateException("Unexpected value: " + scan.next());
            }
        } catch (NoSuchElementException e) {
            System.out.println("Sorry...\nDon't find organization by this id(");
        }

    }
}
