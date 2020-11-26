package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
enum Season{
    winter, spring, summer, autumn
}

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Print a month");
        String input = br.readLine();
        Season season;
        season = Season.winter;
        switch (input.toLowerCase()){
            case "december":
            case "january":
            case "february":
                season = Season.winter;
                System.out.println("It's "+season+ " now");
                break;
            case "march":
            case "april":
            case "may":
                season = Season.spring;
                System.out.println("It's "+season+ " now");
                break;
            case "june":
            case "july":
            case "august":
                season = Season.summer;
                System.out.println("It's "+season+ " now");
                break;
            case "september":
            case "october":
            case "november":
                season = Season.autumn;
                System.out.println("It's "+season+ " now");
                break;
            default:
                System.out.println("Print correct month!");
                break;
        }
    }
}
