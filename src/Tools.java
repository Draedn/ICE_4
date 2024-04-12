/* ###################################
Title: Tools Class
Author: Draedn Groves
Date: Apr.10th/2024
Purpose: Tools class containing different tools for the program
################################### */

/**
 * Tools class
 */
public class Tools {

    /**
     * validates String With Conditions
     */
    public static boolean validateStringWithConditions(String str) {
        return str != null && !str.isEmpty() && str.matches("[a-zA-Z ]+");
    }

    /**
     * validates String and trims it.
     */
    public static String validateAndTrimString(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return str.trim();
        }
        return null;
    }
}
