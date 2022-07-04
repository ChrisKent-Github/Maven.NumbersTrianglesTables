package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i = i + 2){
            if(start % 2 != 0){
            result += i;}

        }
        return result;

    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i = start + 1; i < stop; i = i + 2){
            if(start % 2 != 0){
                result += i;}

        }
        return result;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = getExponentiations(start, stop, step, 2);
        return result;
    }

    public static String getRange(int stop) {
        String result = getRange(0, stop, 1);
        return result;
    }


        //StringBuilder str = new Stringbuilder();
    //for (int i = start; i < stop; i +=step){
    //str.append(i)}
    public static String getRange(int start, int stop) {
        String result = getRange(start, stop, 1);
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        int adder = start;
        for (int i = start; i < stop; i += step){
            result += adder;
            adder += step;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        int adder = start;
        int exponenter = 0;
        for (int i = start; i < stop; i += step){
            exponenter = (int) Math.pow(adder, exponent);
            result += exponenter;
            adder += step;
        }
        return result;
    }

}
