package Hillel.javaIntroduction;

/**
 * 1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
 * Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
 * Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
 * 1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
 * не было человека весом 3 кг и ростом 180 итд.
 */
class Person {
    private String name;
    private String sureName;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String sureName, int age, int weight, int height) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + sureName + ", age is: " + age + "years, weight is: " + weight + "KG, height is:" + height + "cm";

    }

}

public class HomeWork27Persons {

    public static int HEIGHT;
    public static int WEIGHT;

    public static void main(String[] args) {

        String[] sureNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin", "Jackson", "Thompson", "White", "Lopez", "Lee", "Gonzalez", "Harris", "Clark", "Lewis", "Robinson", "Walker", "Perez", "Hall", "Young", "Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Baker", "Adams", "Nelson", "Hill", "Ramirez", "Campbell", "Mitchell", "Roberts", "Carter", "Phillips", "Evans", "Turner", "Torres", "Parker", "Collins", "Edwards", "Stewart", "Flores", "Morris", "Nguyen", "Murphy", "Rivera", "Cook", "Rogers", "Morgan", "Peterson", "Cooper", "Reed", "Bailey", "Bell", "Gomez", "Kelly", "Howard", "Ward", "Cox", "Diaz", "Richardson", "Wood", "Watson", "Brooks", "Bennett", "Gray", "James", "Reyes", "Cruz", "Hughes", "Price", "Myers", "Long", "Foster", "Sanders", "Ross", "Morales", "Powell", "Sullivan", "Russell", "Ortiz", "Jenkins", "Gutierrez", "Perry", "Butler", "Barnes", "Fisher"};
        String[] names = {"James", "John", "Robert", "Michael", "William", "David", "Richard", "Charles", "Joseph", "Thomas", "Christopher", "Daniel", "Paul", "Mark", "Donald", "George", "Kenneth", "Steven", "Edward", "Brian", "Ronald", "Anthony", "Kevin", "Jason", "Matthew", "Danny", "Timothy", "Jose", "Larry", "Jeffrey", "Frank", "Scott", "Eric", "Stephen", "Andrew", "Raymond", "Gregory", "Joshua", "Jerry", "Dennis", "Walter", "Patrick", "Peter", "Harold", "Douglas", "Henry", "Carl", "Arthur", "Ryan", "Roger", "Joe", "Juan", "Jack", "Albert", "Jonathan", "Justin", "Terry", "Gerard", "Keith", "Samuel", "Willie", "Ralph", "Lawrence", "Nicholas", "Roy", "Benjamin", "Bruce", "Brandon", "Adam", "Harry", "Fred", "Wayne", "Billy", "Steve", "Louis", "Jeremy", "Aaron", "Randy", "Howard", "Eugene", "Carlos", "Russell", "Bobby", "Victor", "Martin", "Ernest", "Tony", "Todd", "Jesse", "Craig", "Alan", "Shawn", "Clarence", "Stanley", "Philip", "Chris", "Johnny", "Earl", "Jimmy", "Antonio"};
        Person[] persons = new Person[100];

        for (int i = 0; i < persons.length; i++) {
            int age = randomGenerator(1, 85);//создаём возраст
            generateHeightWeight(age);//создаём пропорциональные рост и вес
            persons[i] = new Person(names[randomGenerator(0, names.length)], sureNames[randomGenerator(0, sureNames.length)], age, WEIGHT, HEIGHT);//создаём обьект
            System.out.println(persons[i]); //выводим его в консоль используя toString
        }

    }

    //исходя из таблиц пропорций веса, роста и возраста разделил на 3 группы от 1 до 4, с 4х до 17лет и выше
    private static void generateHeightWeight(int age) {
        if (age >= 1 && age < 4) {
            HEIGHT = 72 + (age * 5);
            WEIGHT = 9 + age;
        } else if (age >= 4 && age <= 17) {
            HEIGHT = 100 + ((age - 3) * 5);
            WEIGHT = 9 + (age - 3) * 4;
        } else if (age >= 18 && age <= 80) {
            HEIGHT = randomGenerator(150, 197);
            WEIGHT = HEIGHT / 2; //просто делим рост на 2, тут упростил задачу в среднем так и есть норма
        }
    }

    private static int randomGenerator(int min, int max) { //random generator method
        double random = Math.random();
        int r2 = (int) ((random * (max - min)) + min);
        return r2;
    }
}
