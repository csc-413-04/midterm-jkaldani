package midterm2018;


import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
                + "Host: localhost:1298\n"
                + "Connection: keep-alive\n"
                + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
                + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
                + "Referer: http://localhost:1298/\n"
                + "Accept-Encoding: gzip, deflate, br\n"
                + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
                + "    “task” : “inc”,\n"
                + "    “num” : 3\n"
                + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        System.out.println(question1and2);
        System.out.println(question3);
        System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host

        public String[] arrOfquestion1and2 = question1and2.split("\n");

        for (String a : arrOfquestion1and2)
            System.out.println("Hostname" + host);
            System.out.println(a);

        // Question 2
        // return sum of a and b

        String[] String2 = splitString[0].split("\\?");
        int sum = Integer.parseInt(String2[3]) + Integer.parseInt(String2[4]);
            System.out.println(sum);
            System.out.println(question1and2);

        // Question 3
        // convert to java object, increment num, convert back to json and return
        JsonParser jsonParser = new JsonParser();
        Gson gSon = new Gson();
        JsonObject jsonObject = jsonParser.parse(question3).getAsJsonObject();
            System.out.println(jsonObject);
            System.out.println(question3);
            
        // Question 4
        // return unique words
        String[] question4and5 = str1.split("[!-~]* ");
        Set<String> uniqueWords = new HashSet<String>();

        for (String word : question4and5) {
            uniqueWords.add(word);
        }
            System.out.println(question4and5);

        // Question 5
        // return 2nd most common word
        NavigableMap<Integer, Set<String>> ordered;
        Map<String, Integer> frequency;

        void add(String word) {
            int count = frequency.getOrDefault(word, 0);
            if ( count > 0 ) {
                ordered.get(count).remove(word);
            }
            ordered.computeIfAbsent(count + 1, HashSet::new).add(word);
            frequency.put(word, count + 1);
            
        }
            System.out.println(question4and5);
    }
}
