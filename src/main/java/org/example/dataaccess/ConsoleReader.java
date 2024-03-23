package org.example.dataaccess;

import org.example.data.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ConsoleReader {

    public User getUser() {
        System.out.println("Введите данные пользователя через пробел в формате: ");
        System.out.println("<Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол(f/m)>");

        Scanner scanner = new Scanner(System.in);
        String[] fields = scanner.nextLine().split(" ");

        if (fields.length < 6) {
            throw new RuntimeException("Вы ввели меньше данных, чем требуется по формату ввода");
        }
        if (fields.length > 6) {
            throw new RuntimeException("Вы ввели больше данных, чем требуется по формату ввода");
        }

        String lastname = fields[0];
        String firstname = fields[1];
        String middleName = fields[2];

        String birthday = fields[3];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            simpleDateFormat.parse(birthday);
        } catch (ParseException e) {
            throw new RuntimeException("Дата рождения введена не верно. Формат ввода: dd/MM/yyyy");
        }

        String phone = fields[4];
        if (phone.length() > 10 || phone.length() < 10 ) {
            throw new RuntimeException("Номер телефона введен не верно. Номер телефона должен состоять из десяти цифр.");
        }
        long phoneNumber = 0;
        try {
            phoneNumber = Long.parseLong(phone);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Номер телефона введен не верно. Номер телефона должен состоять из десяти цифр.");
        }

        char gender = fields[5].charAt(0);
        if (fields[5].length() > 1 || (gender != 'f' && gender != 'm') ) {
            throw new RuntimeException("Обозначение пола введено не верно. Введите символ 'f' или 'm'.");
        }

        return new User(firstname, lastname, middleName, birthday, phoneNumber, gender);
    }
}
