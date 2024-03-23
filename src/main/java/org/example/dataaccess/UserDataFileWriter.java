package org.example.dataaccess;

import org.example.data.User;

import java.io.FileWriter;
import java.io.IOException;

public class UserDataFileWriter {
    private static final String folder_path = "src/Main/resources/";

    public void append(User user) {
        try {
            FileWriter fileWriter = new FileWriter(folder_path + user.lastname(), true);
            fileWriter.write(user.toString() + "\n");
            fileWriter.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
