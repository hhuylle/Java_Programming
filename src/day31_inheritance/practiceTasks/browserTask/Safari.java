package day31_inheritance.practiceTasks.browserTask;

public class Safari extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing safari browser");
    }
}
