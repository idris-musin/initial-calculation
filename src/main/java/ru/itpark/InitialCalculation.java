package ru.itpark;

public class InitialCalculation {
    public String getInitials(String name) {
        String[] parts = name.split(" ");

        String firstLetter = parts[0].substring(0, 1);

        if (parts.length == 1) {
            return firstLetter;
        }

        String secondLetter = parts[1].substring(0, 1);

        if (parts.length == 2){
            return firstLetter.toUpperCase() + secondLetter.toUpperCase();
        }

        return firstLetter + parts[parts.length - 1].substring(0, 1);
    }
}