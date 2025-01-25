package bankapp;

public class User {
    private Long id;
    private String name;
    private Double balance;
    public User(Long id, String name, Double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public void decreaseBalance(Double amount){balance-=amount;}
    public void increaseBalance(Double amount){balance+=amount;}
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getBalance() {
        return balance;
    }
}
