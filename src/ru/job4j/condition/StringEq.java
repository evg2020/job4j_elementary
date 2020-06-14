package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("your_name");
        boolean access = login.equals(root);
        return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
