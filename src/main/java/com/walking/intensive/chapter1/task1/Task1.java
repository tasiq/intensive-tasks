package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i = 0; i < 2000; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
//        Место для вашего кода

        if (age % 10 == 1 && age % 100 != 11) {
            return "Вам" + " " + age + " " + "год";
        }
        if ((age % 10 == 2 && age % 100 != 12) || (age % 10 == 3 && age % 100 != 13) || (age % 10 == 4 && age % 100 != 14)) {
            return "Вам" + " " + age + " " + "года";
        }
        return "Вам" + " " + age + " " + "лет";
    }
}