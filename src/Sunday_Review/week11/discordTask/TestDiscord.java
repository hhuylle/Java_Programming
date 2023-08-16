package Sunday_Review.week11.discordTask;

public class TestDiscord {

    public static void main(String[] args) {

        Student student1 = new Student("James",7,100);
        student1.sendMessage();
        student1.sendMessage("Anna");

        DiscordUser.launch();
        Student.launch();

    }
}
