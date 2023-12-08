package se.lexicon;

public class Person {
  private int id;
  private String firstName;
  private String lastName;
  private String email;


  public Person (int id,String firstName, String lastName, String email){
     setFirstname(firstName);
     setLastName(lastName);
     setEmail(email);
     setId(id);
  }

   public void setFirstname (String firstName){
      if (firstName == null) throw new IllegalArgumentException("First name was null");
      this.firstName =firstName;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setLastName (String lastName) {
      if (lastName == null) throw new IllegalArgumentException("Lastname was null");
      this.lastName =lastName;
   }
   public String getLastName() {
      return lastName;
   }
   public int getId() {
      return id;
   }
   public void setId(int id) {
      if (id <0) {
          throw new IllegalArgumentException("Id cannot be negative");
      }
      this.id = id;
   }

   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      if (email == null) throw new IllegalArgumentException("email was null");
     this.email = email;
   }
   public String getSummary(){
      return "{ " + firstName + " " + lastName + ", email: " + email + ", id: " + id + " }";
   }
}
