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
      }

      public void withdraw(int amount) {
        this.balance -= amount;
      }

//method
      /*public void deposit(int amount) {
          if (amount > 0) {
              this.balance += amount; //if the amount is greater than zero it adds the amount to thr balance
              System.out.println("Deposit of $" + amount + " successful. New balance: $" + this.balance);
          } else {
              System.out.println("Invalid deposit amount. Amount must be greater than 0.");
          }
      }


     /*public void withdrawal(int amount){
        if (amount > 5) {
            amount -= this.balance;
            System.out.println("Withdrawal of $" + amount + "successful. New balance:$" + this.balance);
        } else{
            System.out.println("Invalid Withdrawal. Only allowed to take more than £5");
        }
      }*/


    // Create a method called withdrawal() that takes in an amount and updates the balance of the BankAccount object.
      //if you are withdrwwing that means your bankaccount will minus
      }




