package praktikumInheritance;

public class Account {
    protected double balance;
    
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt){
        balance+=amt;
        return true;
    }
    
    public boolean withDraw(double amt){
        balance-=amt;
        return true;
    }
}

//Praktikum_Inheritance_Piky
