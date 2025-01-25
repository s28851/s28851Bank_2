package bankapp;

public interface AccountOperations {
    Double payment(Long id, Double amount);
    Double transfer(Long id, Double amount);


}
