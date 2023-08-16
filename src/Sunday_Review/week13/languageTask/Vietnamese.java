package Sunday_Review.week13.languageTask;

public class Vietnamese implements Language{
    @Override
    public void hello() {
        System.out.println("Xin Chao");
    }

    @Override
    public void bye() {
        System.out.println("Tam Biet");
    }
}
