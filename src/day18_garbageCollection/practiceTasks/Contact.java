package day18_garbageCollection.practiceTasks;

public class Contact {
    /*
    Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
     */

    public String name;
    public int phoneNumber;
    public String email;

    public void setInfo(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void call(){
        System.out.println("Calling "+name+" now");
    }

    public void sendMessage(){
        System.out.println("Sending message to "+phoneNumber+" now");
    }

    public void sendEmail(){
        System.out.println("Sending email to "+email+" now");
    }
}
