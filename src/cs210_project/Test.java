package cs210_project;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner input = new Scanner(System.in);
        String textfile = input.next();
        File infile = new File(textfile);
        int numberOfTweets = 0;

        int d = input.nextInt();
        String u = input.next();
        String k = input.next();
        double startTime = System.nanoTime();
        
        if (isIllegalValue(d, u)) {
            System.out.println("stop");
        }
        
        String document = "";
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(infile));
        String line = "";
        while ((line = br.readLine()) != null) {
            document += line + "\n";
        }
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> tweet = new ArrayList<>();
        ArrayList<String> id = new ArrayList<>();
        while (!document.isEmpty()) {
            list.add(document.substring(document.indexOf(" ") + 1, document.indexOf("Wed Dec 14")));
            document = document.substring(document.indexOf("Wed Dec 14") + 30);
        }

        for (int i = 0; i < list.size(); i++) { 
            id.add(list.get(i).substring(0,list.get(i).indexOf(" ")));
            tweet.add(list.get(i).substring(list.get(i).indexOf(" ") + 1));
            if (tweet.get(i).contains("@"))
                tweet.set(i , tweet.get(i).substring(tweet.get(i).indexOf(" ", tweet.get(i).indexOf("@"))));
        }

        if (d == 1) {
            Arraylist a = new Arraylist();
            for (int i = 0; i < list.size(); i++) {
                a.addfirst(new Tweeto(id.get(i), tweet.get(i)));
            }
            numberOfTweets = a.search(u, k);
            double endTime = System.nanoTime();
            printOut(numberOfTweets, (endTime-startTime)/1e+9);
            
            System.out.println(a.search(u,k));
        } else if (d == 2) {
            System.out.println("implemented yet");
            double endTime = System.nanoTime();
            printOut(numberOfTweets, (endTime-startTime)/1e+9);
        } else {
            System.out.println("implemented yet");
            double endTime = System.nanoTime();
            printOut(numberOfTweets, (endTime-startTime)/1e+9);
        }

    }

}
