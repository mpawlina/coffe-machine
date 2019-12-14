public class Client {
    double putMoney;
    double change;

    public Client() {
    }

    public double getPutMoney() {
        return putMoney;
    }

    public void setPutMoney(double putMoney) {
        this.putMoney = putMoney;
    }


    public double buyCoffee (Machine machine,Coffee coffee){
         change = putMoney-coffee.getPrice();
        machine.setAmount(machine.getAmount() - 1);
        return change ;
    }

}