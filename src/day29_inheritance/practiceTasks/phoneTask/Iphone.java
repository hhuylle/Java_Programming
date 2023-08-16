package day29_inheritance.practiceTasks.phoneTask;

public class Iphone extends Phone {
    /*
    Methods:
        faceTime(long phoneNumber)
		faceTime(String email)
     */
    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is facetime with number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel()+" is facetime with email "+email);
    }
}
