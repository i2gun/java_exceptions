package org.example;

import org.example.data.User;
import org.example.dataaccess.ConsoleReader;
import org.example.dataaccess.UserDataFileWriter;

public class UserRecords {

    public void makeRecord() {
        ConsoleReader consoleReader = new ConsoleReader();
        UserDataFileWriter userDataFileWriter = new UserDataFileWriter();

        User user = consoleReader.getUser();

        userDataFileWriter.append(user);
    }
}
