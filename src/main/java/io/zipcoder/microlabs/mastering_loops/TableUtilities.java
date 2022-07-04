package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = getMultiplicationTable(5);
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = getMultiplicationTable(10);
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for(int j = 1; j <= tableSize; j++) {
            for (int i = j; i <= tableSize * j; i += j) {
                if (i > 99) {
                    result += i + " |";
                } else if (i > 9) {
                    result += " " + i + " |";
                } else {
                    result += "  " + i + " |";
                }
            }
            result += "\n";
        }
        System.out.println(result);
        return result;
    }

    public static String getTableRow() {
        return null;
    }
}
