package bank;

class Account{
    protected int acc = 123456;
    private int pin = 1234;

    public int getPin(){
        return this.pin;
    }

    public void setPin(int pin){
        this.pin = pin;
    }
}

public class Bank {
    // public static void main(String[] args) {
    //     System.out.println("this is bank package" );
    public static void main(String[] args) {
        Account ac = new Account();
        System.out.println(ac.acc);
        // System.out.println(ac.pin); // private not accessible

        ac.setPin(909);
        System.out.println(ac.getPin());
    }
    // }
}


// public - accessible everywhere
// protected - package + child class(through inheritance)  
// default - package (within a file)
// private - class