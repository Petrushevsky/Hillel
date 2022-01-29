package Hillel.javaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork9Stipendium {
    public static void main(String[] args) throws IOException {
        //variables and massive
        String[] studySubjects = {"Math", "English", "Ukrainian", "Philosophy", "Physical culture"}; //student's subjects
        double sumMark = 0; //variable to sum all marks in massives
        int[] marks = new int[5]; //new massive for grades
        //initialization of buffer reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Intro
        System.out.println("Hello, dear student! ");
        System.out.println("In vino veritas, in aqua sanitas");
        System.out.println("Enter your grade at university (1-12) as a number and press ENTER");
        //reading from console grades to massive
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter grade for: " + studySubjects[i]);
            marks[i] = Integer.parseInt(reader.readLine()); //read console size of massive times
        }
        //Show results of subject + grade
        System.out.println("Your marks are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(studySubjects[i] + " - " + marks[i]);//show Subject + grade
            sumMark = sumMark + marks[i]; //calculating sum of marks
        }
        //calculating average grade with length of massive
        double averageGrade = sumMark / marks.length;
        //now checking average grade for grants
        System.out.println("Average is " + averageGrade);
        if (averageGrade > 0 && averageGrade <= 7) {
            System.out.println("Sorry, You have no grants");
        } else if (averageGrade >= 8 && averageGrade < 10) {
            System.out.println("Yeah, You have REGULAR grant");
        } else if (averageGrade >= 10 && averageGrade <= 12) {
            System.out.println("Fantastic, You have HIGHEST grant");
        } else System.out.println("Your mark is Unreal, 1-12 only ");
        //if we enter impossible grades it shows the message
        //Have a nice day
    }

}

