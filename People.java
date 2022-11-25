public class People {

  private String firstName;
  private String lastName;
  private int age;
  
//create a person with default values 
  public People() {
    firstName = "";
    lastName = "";
    age = 0;
  }
  
//create a person with given values
  public People(String f, String l, int a) {
    firstName = f;
    lastName = l;
    age = a;
  }
//change the person's name
  public void changeAge(int newAge) {
    age = newAge;
  }
//increase the age of person by 1
  public void increment() {
    age++;
  }
//increase the age of person by requested years
  public void increase(int years) {
    age += years;
  }
//change the first name of the person
  public void changeFName(String newFName) {
    firstName = newFName;
  }
//change the last name of the person
  public void changeLName(String newLName) {
    lastName = newLName;
  }
//check whether the person is old enough to drive
  public boolean canDrive() {
    if (age >= 16) {
      return true;
    }
    return false;
  }
//check whether the person can get a license by using canDrive method
  public String getLicense() {
    if (canDrive()) {
      return firstName + " can get a drivers license.";
    } else {
      return firstName + " cannot get a drivers license.";
    }
  }
//check if two people have the same first name 
  public boolean sameFirstName(People person) {
    if (firstName.equals(person.firstName)) {
      return true;
    }
    return false;
  }
  
//check if two people have the same last name 
  public boolean sameLastName(People person) {
    if (lastName.equals(person.lastName)) {
      return true;
    }
    return false;
  }
//check if two people are duplicates by using sameFirstName and sameLastName methods
  public String dups(People person) {
    if (sameFirstName(person) && sameLastName(person)) {
      return firstName + " " + lastName + " and " + person.firstName + " " + person.lastName + " are duplicates.";
    }
    return firstName + " " + lastName + " and " + person.firstName + " " + person.lastName + " are not duplicates.";

  }

}