package ru.itpark;

public class InitialCalculation {
    public String getInitials(String name) {
        String[] parts = name.split(" ");

        if (parts.length == 2) {
            return parts[0].substring(0, 1).toUpperCase() + parts[1].substring(0, 1).toUpperCase();
        }

        if (parts.length == 3){
            return parts[0].substring(0,1) + parts[2].substring(0, 1);
        }

        return parts[0].substring(0, 1);
    }
}
