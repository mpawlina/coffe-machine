import java.util.Scanner;

public class Machine {
    final double[] NOMINALY = {200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    double change;
    double amount;

    public Machine() {
        this.change = change;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    String wynik = "Reszta:\n";

    public void getChange(Coffee coffee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put money");
        double putMoney= scanner.nextDouble();
        change=putMoney-coffee.getPrice();

        if (putMoney>coffee.getPrice()) {
            System.out.println("Change is: "+change);
            for (int i = 0; ((i < NOMINALY.length) && (change > 0.00)); i++) {
                if (change >= NOMINALY[i]) {
                    int temp = (int) Math.floor(change / NOMINALY[i]);
                    wynik += NOMINALY[i] + " PLN x " + temp + "\n";
                    change = (double) Math.round(100 * (change - (temp * NOMINALY[i]))) / 100;

                }
            }
            System.out.println(wynik);
        }
            else {
                System.out.println("put more money");
        }


    }

    public void changeInventory() {
        setAmount(getAmount() - 1);
    }

    public void resore() {
        setAmount(100);
    }
}
