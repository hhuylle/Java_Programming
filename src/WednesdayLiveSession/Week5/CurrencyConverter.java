package WednesdayLiveSession.Week5;

public class CurrencyConverter {
    /*
   Currency Converter [methods, conditional, operators]
   create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type. return the converted number
   Use the following sample rates for currency conversions
       1 dollar = 0.91 euro
       1 dollar = 121.03 yen
       1 dollar = 14.85 lira
       1 dollar = 1,217.52 won
       1 dollar = 181.45 rupee
   Note: Don't worry about decimal formats, focus on the code to create these conversions
       Ex:
           Input: euro, 100
           Output: 91
       Ex:
           Input: yen, 50
           Output: 6051.5
    */
    public static void main(String[] args) {

        System.out.println(convertFromDollar("yen",100));
    }

    public static double convertFromDollar(String currency, double amount){

        double result = 0;
        switch (currency.toLowerCase()){
            case "euro":
                result = amount*0.91;
                break;
            case "yen":
                result = amount*121.03;
                break;
            case "lira":
                result = amount*14.85;
                break;
            case "won":
                result = amount*1217.52;
                break;
            case "rupee":
                result = amount*181.45;
                break;
        }
        return result;

    }
}
