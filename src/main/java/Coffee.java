import java.math.BigDecimal;
import java.util.Currency;

public class Coffee {
    boolean haveMilk;
    String kindOfCoffee;
    double price;
    String size;

    public Coffee(boolean haveMilk, String kindOfCoffee,  double price, String size) {
        this.haveMilk = haveMilk;
        this.kindOfCoffee = kindOfCoffee;
        this.price = price;
        this.size = size;
    }

    public boolean isHaveMilk() {
        return haveMilk;
    }

    public void setHaveMilk(boolean haveMilk) {
        this.haveMilk = haveMilk;
    }

    public String getKindOfCoffee() {
        return kindOfCoffee;
    }

    public void setKindOfCoffee(String kindOfCoffee) {
        this.kindOfCoffee = kindOfCoffee;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
