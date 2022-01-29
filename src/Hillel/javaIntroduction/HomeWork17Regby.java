package Hillel.javaIntroduction;

import java.util.Arrays;

/**
 * ДЗ 17. Регби
 * <p>
 * Есть две команды регби по 25 человек разного возраста каждая.
 * Возрасты членов команд подбирались случайным образом (Math.random).
 * Выведите на экран в двух отдельных строках возраста участников каждой команды через запятую.
 * Посчитайте средний возраст каждой команды и сообщите, для какой из них это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */

public class HomeWork17Regby {
    public static void main(String[] args) {

        //hardcode!!! as a task
        int teamSize = 25;

        //arays
        int[] teamA = new int[teamSize];
        int[] teamB = new int[teamSize];

        //fill arrays with random
        fillArrays(teamA);
        fillArrays(teamB);

        //calculate average
        int avgTeam1 = colculateAverageInArray(teamA);
        int avgTeam2 = colculateAverageInArray(teamB);

        //output
        System.out.println("Team 1: " + Arrays.toString(teamA) + " average Age is: " + avgTeam1);
        System.out.println("Team 2: " + Arrays.toString(teamB) + " average Age is: " + avgTeam2);

        //compare teams
        comparing(avgTeam1, avgTeam2);

    }

    private static void comparing(int avgTeam1, int avgTeam2) {
        if (avgTeam1 > avgTeam2) {
            System.out.println("Team 1 has bigger average age!");
        } else if (avgTeam1 < avgTeam2) {
            System.out.println("Team 2 has bigger average age!");
        } else if (avgTeam1 == avgTeam2) {
            System.out.println("Team 1 has the same average age as Team 2!");
        }
    }

    private static int colculateAverageInArray(int[] teamA) {
        int avg = 0;
        for (int i = 0; i < teamA.length; i++) {
            avg += teamA[i];
        }
        avg /= teamA.length;//without float because age in years
        return avg;
    }

    private static void fillArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator(5, 100); //hardcode limits for ages from 5 to 100
        }
    }

    private static int randomGenerator(int max, int min) { //random
        double random = Math.random();
        int r2 = (int) ((random * (max - min)) + min);
        return r2;
    }

}
