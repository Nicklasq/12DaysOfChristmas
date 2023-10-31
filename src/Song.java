import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Song {

    public void output() {

        for (int day = 1; day <= 12; day++) {
            PrintStream setOut = System.out;

            setOut.print("On the ");
            setOut.print(day);


            switch (day) {
                case 1 ->  setOut.print("st");
                case 2 ->  setOut.print("nd");
                case 3 ->  setOut.print("rd");
                default -> setOut.print("th");
            }

            setOut.println(" day of Christmas my true love gave to me");

            switch (day) {
                case 12: setOut.println("Twelve drummers drumming,");
                case 11: setOut.println("Eleven pipers piping,");
                case 10: setOut.println("Ten lords a leaping,");
                case 9:  setOut.println("Nine ladies dancing,");
                case 8:  setOut.println("Eight maids a milking,");
                case 7:  setOut.println("Seven swans a swimming,");
                case 6:  setOut.println("Six geese a laying,");
                case 5:  setOut.println("Five golden rings,");
                case 4:  setOut.println("Four calling birds,");
                case 3:  setOut.println("Three French hens,");
                case 2:  setOut.println("Two turtle doves, and");
                default: setOut.println("A partridge in a pear tree.");
            }
            setOut.println();
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        PrintStream output = new PrintStream(("songtext.txt"));
        System.setOut(output);

        System.out.println("before");
        System.out.println();


        Song song = new Song();
        song.output();

        System.out.println("after");

    }
}
