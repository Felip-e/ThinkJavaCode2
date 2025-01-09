public class Time {
       public static void main(String[] args) {
       int hour, minute, 
       second, day,
       time, remaining;
       double percentageDay;

       hour = 20;
       minute = 23;
       second = 30;
       day = 24 * 3600; // secs
       time = (hour * 3600) + (minute * 60) + second;
       remaining = day - time;
       percentageDay = time * 100.0 / (day);

       System.out.println("Time passed since midnight: " + time + " seconds.");
       System.out.println("Time of the day remaing: " + remaining + "seconds.");
       System.out.printf("Percentage of the day that has passed: %.2f\n", percentageDay);       
       }
}
