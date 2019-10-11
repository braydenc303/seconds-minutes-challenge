package academy.learnprogramming;


public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(17362));
        System.out.println(getDurationString(-5));
    }

    // Create a method called getDurationString with two parameters, first parameter minutes, 2nd parameter seconds.
    private static String getDurationString(int minutes, int seconds) {

        // Validate that the first parameter minutes is >=0
        
        // Validate that the second parameter seconds is >=0 and <=59.
        if(minutes >= 0 && (seconds >=0 && seconds <=59)) {
            // If they are valid, calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as a string in the format "XXh YYm ZZs"
            String formattedHours = String.format("%02d", minutes/60);            
            String formattedMinutes = String.format("%02d", minutes%60);           
            String formattedSeconds = String.format("%02d", seconds);

            return formattedHours + "h " + formattedMinutes + "m " + formattedSeconds + "s";
        } else {
            // If either of the above are not true, return the string "Invalid value"
            return INVALID_VALUE_MESSAGE;
        }
        
    }
        
    // Create a second method with the same name, but with only one parameter seconds.
    private static String getDurationString(int seconds) {

        
        // Validate that it is >=0, and return "Invalid value" if it is not true.
        if(seconds >=0) {
            // If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated.
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
            
    }
    // Then call both methods to print values to the console.

    // Tips:
    // Use int or long for your number data types
    // 1 min = 60 sec, and 1 hour = 60 min or 3600 sec
    // Methods should be static

    //Bonus: Done
    // For the input 61 min, output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
    // Create a new console project and call it SecondsAndMinutesChallenge
}