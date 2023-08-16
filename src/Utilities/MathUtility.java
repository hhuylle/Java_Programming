package Utilities;

import java.text.DecimalFormat;

public class MathUtility {

    public static double format(double num){
        DecimalFormat df =new DecimalFormat("#.##");
        return Double.parseDouble(df.format(num));
    }
}
