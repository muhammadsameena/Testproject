package ContactManager;
/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class

 public class Contact{
	String name;

    //@Override
    public String toString() {
        return "{" +
                " Name = " + name  +
                ", Email = " + email  +
                ", Phone Number = "+phoneNumber+" }";
    }

    String email;
    String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public Contact(String name,String email,String phoneNumber) {
        this.name=name;
        this.email = email;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
