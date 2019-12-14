import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double putMoney;


        Coffee smallEsspreso = new Coffee(false, "Esspresso", 4.00, "small");
        Coffee bigEsspreso = new Coffee(false, "Esspresso", 7.00, "big");
        Coffee smallCapucino = new Coffee(true, "Cappucino", 4.5, "small");
        Coffee bigCapucino = new Coffee(true, "Cappucino", 8.0, "big");
        Coffee smallLatte = new Coffee(true, "Latte", 4.0, "small");
        Coffee bigLatte = new Coffee(true, "Latte", 8.0, "big");


        Machine machine = new Machine();


        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Please choose number: 1- small esspreso, 2 - big esspresso, 3- small capucino, 4 big capucino, 5- small latte, 6 - big latee");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                client.buyCoffee(machine, smallEsspreso);
                machine.getChange(smallEsspreso);
                break;
            case 2:
                 client.buyCoffee(machine, bigEsspreso);
                 machine.getChange(bigEsspreso);
                break;
            case 3:
                 client.buyCoffee(machine, smallCapucino);
                 machine.getChange(smallCapucino);
                break;
            case 4:
                 client.buyCoffee(machine, bigCapucino);
                 machine.getChange(bigCapucino);
                break;
            case 5:
                 client.buyCoffee(machine, smallLatte);
                 machine.getChange(smallLatte);
                break;
            case 6:
                client.buyCoffee(machine, bigLatte);
                machine.getChange(bigLatte);
                break;

            default:
                System.out.println("You choose wrong number- Please write number from 1 to 6 ");
                break;

        }
    }
}
