import java.io.*;

public class Exercise12_13 {
    public static void main(String[] args) {
        int characters = 0;
        int words = 0;
        int lines = 0;

        String fileName = args[0];
        String contents = "";

        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(fileName));

            while ((line = bReader.readLine()) != null) {
                contents += line;
            }

            bReader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        }

        for (String s: contents.split(" ")) {
            words++;
            characters += s.length();
        }

        for (String s: contents.split("\n")) {
            lines++;
        }

        System.out.println(Integer.toString(characters) + " characters\n" + Integer.toString(words) + " words\n" + Integer.toString(lines) + " lines");
    }
}