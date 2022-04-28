package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String[] arrayDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        for (String day : arrayDays) {
            System.out.println(day);
        }
        for (int i = 0; i > arrayDays.length; i--) {
            System.out.println(arrayDays[i-1]);
        }
        ArrayList<String>arrayListDays = new ArrayList<String>(Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
        for (String day : arrayListDays) {
            System.out.println(day);
        }

        ArrayList<String>arrayListMonths = new ArrayList<String>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "september", "November", "December"));
        for (String month : arrayListMonths) {
            System.out.println(month);
        }
        LinkedList<String> linkedListDays = new LinkedList<>();
        linkedListDays.add("Sunday");
        linkedListDays.add("Monday");
        linkedListDays.add("Tuesday");
        linkedListDays.add("Wednesday");
        linkedListDays.add("Thursday");
        linkedListDays.add("Friday");
        linkedListDays.add("Saturday");

        System.out.println(linkedListDays);
        for (String day : linkedListDays) {
            System.out.println(day);
        }
        HashMap<String,String> hashMapCapitols = new HashMap<>();
        hashMapCapitols.put("New Hampshire", "Concord");
        hashMapCapitols.put("Vermont", "Montpelier");
        hashMapCapitols.put("Maine", "Augusta");
        hashMapCapitols.put("Massachusetts", "Boston");
        hashMapCapitols.put("Connecticut", "Hartford");
        hashMapCapitols.put("Rhode Island", "Providence");

        System.out.println(hashMapCapitols);

        for (String state : hashMapCapitols.keySet()) {
            System.out.println(state);
        }

    }
}
