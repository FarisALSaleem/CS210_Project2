package cs210_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static boolean isIllegalValue(int d, String u) { // checks if d or u has an IllegalValue
                                                            //returns true if they do
        if (d < 1 || d > 3) {
            System.out.println("d is a Illegal value");
            return true;
        }

        if (u.length() > 1) {
            System.out.println("u is a longer than 1 character");
            return true;
        }

        if (u.charAt(0) > 'z') {
            System.out.println("u is a Illegal value");
            return true;
        } else if (u.charAt(0) <= '`' && u.charAt(0) >= ':') {
            System.out.println("u is a Illegal value");
            return true;
        } else if (u.charAt(0) < '0') {
            System.out.println("u is a Illegal value");
            return true;
        }

        return false;

    }

    public static void printOut(int t, double s) {
        System.out.printf("Total Tweets: %d\n", t);
        System.out.printf("Total Time: %f\n", s);
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        String textfile = input.next();
        File infile = new File(textfile);

        int d = input.nextInt();
        String u = input.next();
        String k = input.next();
        input = new Scanner(infile);

        if (!isIllegalValue(d, u)) {
            System.out.println("stop");
        } else if (d == 1) {
            ArrayList list = new ArrayList();
            while(input.hasNext()){
            String temp = input.next();
            String id = input.next();
            StringBuilder Tweet = new StringBuilder(280);
            Tweet.append(input.nextLine());          
            }
        } else if (d == 2) {
            System.out.println("implemented yet");
        } else {
            System.out.println("implemented yet");
        }

    }

}
