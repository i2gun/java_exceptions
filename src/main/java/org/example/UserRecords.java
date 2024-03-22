package org.example;

import org.example.data.User;
import org.example.dataaccess.ConsoleReader;
import org.example.dataaccess.FileWriter;

public class UserRecords {

    public void makeRecord() {
        ConsoleReader consoleReader = new ConsoleReader();
        FileWriter fileWriter = new FileWriter();

        User user = consoleReader.getUser();

        fileWriter.append(user);
    }
}
