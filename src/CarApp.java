
import com.sun.deploy.net.proxy.UserDefinedProxyConfig;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anthonymparker on 2/16/17.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Car("Chevrolet\t", "Silverado", 2017, 45300.0));
        carList.add(new Car("Ford\t", "\tMustang\t", 2017, 40540));
        carList.add(new Car("Buick", "\t\tLacrosse", 2017, 32300.00));
        carList.add(new UsedCar("GMC", "\t\t\tSierra\t", 2003, 12000.00, 1891000));
        carList.add(new UsedCar("Oldsmobile", "\tAlero\t", 1999, 8925.00, 2130000));
        carList.add(new UsedCar("Honda\t", "\tCivic\t", 2000, 11900.00, 1455505));

        int userPick;
        do {
            for (int i = 0; i < carList.size(); i++) {
                //System.out.print(i + 1 + ". ");
                System.out.println(i + 1 + ". " + carList.get(i));
            }
            userPick = Validation.getInt(scan, "Which vehicle would you like? ") - 1;


            if (userPick != carList.size() - 1) {

                System.out.println();
                System.out.println(carList.get(userPick));
                String answer = Validation.getString(scan, "Would you like to buy this vehicle? ");
                if (answer.equalsIgnoreCase("y")) {
                    carList.remove(userPick);
                    System.out.println("Great! Our finance department will be in touch shortly.");
                    System.out.println();

                } else
                    userPick = -1;
                System.out.println("Have a great day!");
                System.out.println();

            }
        } while (userPick != -1);

        scan.close();


    }

    }



