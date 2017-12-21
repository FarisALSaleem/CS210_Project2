package cs210_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
        double startTime;

        if (isIllegalValue(d, u)) {
            System.out.println("stop");
        }

        String document = new String(Files.readAllBytes(Paths.get(infile.getAbsolutePath())),StandardCharsets.UTF_8);

        ArrayList<String> tweet = new ArrayList<String>(Arrays.asList(document.split("BDT")));
        ArrayList<String> id = new ArrayList<>();
        
        tweet.remove(tweet.size() - 1);     
        //Last element is not a tweet
        
        //Formatting the contents of the array
        for (int i = 0; i < tweet.size(); i++) {
            String extractedTweet = tweet.get(i).substring(tweet.get(i).indexOf("@"), tweet.get(i).indexOf(" Wed Dec 14"));
            id.add(extractedTweet.substring(0, extractedTweet.indexOf(" ")+1));
            tweet.set(i, extractedTweet.substring(extractedTweet.indexOf(" ")+1));
            if (tweet.get(i).contains("@"))
                tweet.set(i , tweet.get(i).substring(tweet.get(i).indexOf(" ",tweet.get(i).indexOf("@"))+1));
        }

        if (d == 1) {
            Arraylist a = new Arraylist();
            for (int i = 0; i < tweet.size(); i++) {
                a.addfirst(new Tweeto(id.get(i), tweet.get(i)));
            }
            
            startTime = System.nanoTime();
            numberOfTweets = a.search(u, k);
            double endTime = System.nanoTime();
            printOut(numberOfTweets, (endTime - startTime) / 1e+9);
        } else if (d == 2) {

            TweetoHT h = new TweetoHT();
            for (int i = 0; i < tweet.size(); i++) 
                h.add(new Tweeto(id.get(i), tweet.get(i)));

            startTime = System.nanoTime();
            numberOfTweets = h.search(u, k);
            double endTime = System.nanoTime();
            printOut(numberOfTweets, (endTime - startTime) / 1e+9);

        } else {
            TweetoBHHT t = new TweetoBHHT();
            for (int i = 0; i < tweet.size(); i++) 
                t.add(new Tweeto(id.get(i), tweet.get(i)));
            
            startTime = System.nanoTime();
            numberOfTweets = t.search(u, k);
            double endTime = System.nanoTime();
            printOut(numberOfTweets, (endTime - startTime) / 1e+9);
        }

    }

}
