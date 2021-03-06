package mailsender;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        Scanner file_input = new Scanner(new File(filename));

        while (file_input.hasNextLine()){
            text.append(file_input.nextLine());
            text.append("\n");
        }
        return text.toString();
    }
}
