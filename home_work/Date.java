public class Date {
      public static void main(String args[]) {
             String day, month;
             int date, year;
             day = "Wednesday";
             date = 8;
             month = "January";
             year = 2025;
//             System.out.println(day);
//             System.out.println(month);
//             System.out.println(date);
//             System.out.println(year);
             System.out.printf("American format: %s, %s %d, %d.\n", day, month, date, year);
             System.out.println("European format: " + day + " " + date + " " + month + " " + year + ".");
}

}
