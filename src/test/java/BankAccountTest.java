import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;


public class BankAccountTest {

    BankAccount bankAccount;//this is preparing the program, it for the whole test run

    @BeforeEach
    public void setBankAccount() {
        bankAccount= new BankAccount("Janet","Mensah",
                "22-02-2001", "23343453");
    }


    //Testing of getters and setters
    @Test
    public void canGetfirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Janet");
    }

    @Test
    public void canGetlastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Mensah");
    }

    @Test
    public void canGetdateOfBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("22-02-2001");
    }

    @Test
    public void canGetaccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo("23343453");
    }

    @Test
    public void canGetbalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(300);
        assertThat(bankAccount.getBalance()).isEqualTo(300);
    }


    @Test
    public void canDepositAmount(){
        bankAccount.deposit(300);
        assertThat(bankAccount.getBalance()).isEqualTo(300);
    }
    @Test
    public void canWithdrawAmount(){
        bankAccount.withdraw(200);
        //bankAccount.deposit(300);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }
}


// the problem is I have withdrawn money of £200 and the system is saying Deposit of $300 successful. New balance $100





