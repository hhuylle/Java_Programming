package day25_constructor.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    /*
    2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
     */
    public static void main(String[] args) {

        Offer obj1 = new Offer("Texas","Cydeo","Java Developer",120_000,false,true,false,true);
        Offer obj2 = new Offer("New Jersey","Apple","Project Manager",120_000,true,false,false,false);
        Offer obj3 = new Offer("Florida","Disney","Java Developer",120_000,false,true,true,false);
        Offer obj4 = new Offer("Pennsylvania","FreedomPay","SDET",120_000,true,true,true,true);
        Offer obj5 = new Offer("Colorado","NASA","Java Engineer",120_000,true,false,true,false);
        Offer obj6 = new Offer("New York","Square","Data Analyst",120_000,false,true,false,true);
        Offer obj7 = new Offer("Ohio","Oracle","Java Developer",120_000,true,false,false,false);

        Offer[] myOffer = { obj1,obj2,obj3,obj4,obj5,obj6,obj7 };

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList(myOffer));
        fullTimeOffers.removeIf(p->!p.isFullTime);
        System.out.println(fullTimeOffers);

        ArrayList<Offer> localOffers = new ArrayList<>();
        localOffers.addAll(Arrays.asList(myOffer));
        localOffers.removeIf(p-> p.equals(p.location));
        System.out.println(localOffers);

        ArrayList<Offer> offersWithBenefits = new ArrayList<>();
        offersWithBenefits.addAll(Arrays.asList(myOffer));
        offersWithBenefits.removeIf(p -> !p.hasBenefit && !p.hasPTO );
        System.out.println(offersWithBenefits);

        ArrayList<Offer> devOffers = new ArrayList<>();
        devOffers.addAll(Arrays.asList(myOffer));
        devOffers.removeIf(p-> !p.jobTitle.toLowerCase().contains("developer"));
        System.out.println(devOffers);

        ArrayList<Offer> offersWith100K = new ArrayList<>();
        offersWith100K.addAll(Arrays.asList(myOffer));
        offersWith100K.removeIf(p->p.salary<100000);
        System.out.println(offersWith100K);

    }
}
