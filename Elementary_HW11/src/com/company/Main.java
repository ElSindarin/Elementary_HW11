package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String engTrue = "Petrov Alexander Alexeevich";
        String engFalse = "Petrov Aleфффxander Alexeevich";
        String rusTrue = "Легасов Валерий Алексеевич";
        String rusFalse = "Легасов Валерий Алексеzzzевич";

        checkName(engTrue);
        checkName(engFalse);
        checkName(rusTrue);
        checkName(rusFalse);
    }

    public static void checkName (String text) {
        String regex = "(^[A-Z]{1}[a-z]{1,15}\\s[A-Z]{1}[a-z]{1,15}\\s[A-Z]{1}[a-z]{1,15}[a-z]$)|([А-ЯЁ]{1}[а-яё]{1,15}\\s[А-ЯЁ]{1}[а-яё]{1,15}\\s[А-ЯЁ]{1}[а-яё]{1,15}[а-яё]$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find(0)) {
            System.out.println("Данное выражение, вероятно, является ФИО");
        }
        else {
            System.out.println("Данное выражение точно не является ФИО");
        }
    }
}
