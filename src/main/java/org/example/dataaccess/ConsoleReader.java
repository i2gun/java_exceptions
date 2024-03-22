package org.example.dataaccess;

import org.example.data.User;
import java.util.Scanner;

public class ConsoleReader {

    public User getUser() {
        System.out.println("Введите данные пользователя через пробел в формате: ");
        System.out.println("<Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол>");

        Scanner scanner = new Scanner(System.in);
        String[] fields = scanner.nextLine().split(" ");

        if (fields.length < 6) {
            throw new RuntimeException("Вы ввели меньше данных, чем требуется по формату ввода");
        }

        if (fields.length > 6) {
            throw new RuntimeException("Вы ввели больше данных, чем требуется по формату ввода");
        }

        String firstname = fields[0];
        String lastname = fields[1];
        String middleName = fields[2];
        String birthday = fields[3];
        long phoneNumber = Long.parseLong(fields[4]);
        char gender = fields[5].charAt(0);

        return new User(firstname, lastname, middleName, birthday, phoneNumber, gender);
    }
}
