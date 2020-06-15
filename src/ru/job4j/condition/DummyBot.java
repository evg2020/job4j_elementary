package ru.job4j.condition;

public class DummyBot {
    public static String answers(String questions) {
        String res = "Это ставит меня в тупик";
        if ("Привет, Бот".equals(questions)) {
            res = "Привет Умник!";
        } else if ("Пока".equals(questions)) {
            res = "До скорой встречи";
        }
        return res;
    }

    public static void main(String[] args) {
        String res = DummyBot.answers("Привет");
        System.out.println(res);
        res = DummyBot.answers("Пока");
        System.out.println(res);
    }
}
