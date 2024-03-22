package org.example.dataaccess;

import org.example.data.User;
import java.io.IOException;

public class FileWriter {
    private static final String folder_path = "src/Main/resources/";

    public void append(User user) {
        try {
            java.io.FileWriter out = new java.io.FileWriter(folder_path + user.lastname(), true);
            out.append(user.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
