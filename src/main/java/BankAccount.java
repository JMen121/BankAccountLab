//the class
    public class BankAccount {

      private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String accountNumber;   //this could be a string because int is used when doing calculations
        private int balance;

        //Down below is the Constructor to intialisze the BankAccount Object
    public BankAccount(String firstName, String lastName, String dateOfBirth, String accountNumber){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber =accountNumber;
        this.balance = 0;
    }
//getter
    public String getFirstName(){
        return firstName;
      }
    public String getLastName(){
        return lastName;
    }
      public void setFirstName(String firstName){
          this.firstName= firstName;
      }
    public String getAccountNumber(){
        return accountNumber;
    }

      public void setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
      }

      public void setLastName(String lastName) {
          this.lastName = lastName;
      }

      public String getDateOfBirth() {
          return dateOfBirth;
      }

      public void setDateOfBirth(String dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
      }

      public int getBalance(){
        return balance;
      }

      public void setBalance(int balance) {
          this.balance = balance;
      }


      public void deposit(int amount){
        this.balance+=amount;
        if (amount>=0){
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + this.balance);
        }
      }

      public void withdraw(int amount) {
        this.balance -= amount;
        if (amount<=0){
            System.out.println("Invalid funds. Your account is currently"+ this.balance);
        }
      }
      }




