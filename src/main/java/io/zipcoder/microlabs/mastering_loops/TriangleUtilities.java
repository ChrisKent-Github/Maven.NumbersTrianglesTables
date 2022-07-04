package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 1; i < numberOfRows; i++) {
            result += getRowNewLine(i);
        }
        System.out.println(result);
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i = 0; i < numberOfStars; i++) {
            result += "*";
        }
        return result;
    }

    public static String getSmallTriangle() {
        String result = getTriangle(5);
        return result;
    }

    public static String getLargeTriangle() {
        String result = getTriangle(10);
        return result;
    }


    public static String getRowNewLine(int numberOfStars) {
        String result = "";
        for (int i = 0; i < numberOfStars; i++) {
            result += "*";
        }
        result += "\n";
        return result;
    }

}
