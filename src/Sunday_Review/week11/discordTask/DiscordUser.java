package Sunday_Review.week11.discordTask;

import java.time.LocalDate;

public class DiscordUser {
    /*
    DiscordUser [Inheritance, overriding, super constructor, LocalDate]

	Create an DiscordUser class

	    - create variables:
	        role, name, id
	        variable: account creation date

	    - create constructor to initialize the variables

	    - create a method sendMessage()
	    	prints: "Sending message to class chat"

	    - create a method joinDiscord(String discordUrl)
	    	prints: "Joining $discordUrl"

	    - override toString()

     */
    String role, name;
    int id;
    LocalDate createDate;

    public DiscordUser(String role, String name, int id) {
        this.role = getClass().getSimpleName();
        this.name = name;
        this.id = id;
        createDate = LocalDate.now();
    }

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }

    public void joinDiscord(String discordUrl){
        System.out.println("Joining "+discordUrl);
    }

    public static void launch(){
        System.out.println("Connecting to server");
    }

    @Override
    public String toString() {
        return role +" | "+name+"#"+id+"\nRole: "+role+"\nAccount created: "+createDate;
    }
}
