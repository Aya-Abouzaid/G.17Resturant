
package burger.resturent.manager;
import java.util.Scanner;
public class BurgerResturentManager {
  public static void main(String[] args) {
        Scanner input =new Scanner ( System.in);
       System.out.println("Welcome To Restaurant.\nPlease Select the number of burger type you want.\n "
                + " 1. Normal Burger\n" + " 2. Healthy Burger\n" + " 3. Deluxe Burger\n");

        int burgerType = input.nextInt();
        if (burgerType == 3) {
            DeluxBerger order = new DeluxBerger();
            System.out.println("you select Delux Burger with beef and white bread and two additions chips and cola");
            System.out.println("Your order price is 60.00 L.E");
        } else if (burgerType == 2) {
            HealthyBurger order = new HealthyBurger();
            System.out.println("Please select the meat type.\n 1.Beef - 2.Cicken");
            int meatType = input.nextInt();
            order.setMeatType(meatType);
            order.setRollBreadType();

            System.out.println("Please select the additions.\n 1.Chips  -  2.cola  - 3.Both");
            int additionsType = input.nextInt();
            order.getAdditions(additionsType);
            System.out.println("Your order price is " + order.getPrice());

        }else if (burgerType == 1){
            NormalBurger order = new NormalBurger();
            System.out.println("Please select the meat type.\n 1.Beef - 2.Cicken");
            int meatType = input.nextInt();
            order.setMeatType(meatType);

            System.out.println("Please select the roll bread type.\n 1.White - 2.Brown");
            int rollBreadType = input.nextInt();
            order.setRollBread(rollBreadType);

            System.out.println("Please select the additions.\n 1.tomato  -  2.cheese  -   3.cola   -    4.chips");
            int additionType = input.nextInt();
            order.setAdditions(additionType);
            System.out.println("Your order price is " + order.getPrice());

        }
}}
