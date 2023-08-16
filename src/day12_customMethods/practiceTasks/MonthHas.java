package day12_customMethods.practiceTasks;

public class MonthHas {

    public static void main(String[] args) {

        monthHas("jUNe");

    }

    public static void monthHas(String month){

        String mth = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();

        System.out.println(mth + " has 30 days");
    }
}
