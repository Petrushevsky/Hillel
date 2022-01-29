package Hillel.HomeWorksJavaIntroduction;

/**
 * Создать класс Cat.
 * У кота должны быть такие свойства как имя, возраст, вес, порода.
 * Создать конструктор по умолчанию, конструктор с 4 параметрами, конструктор с 2 параметрами(имя и возраст)
 * Переопределить метод toString
 * Реализовать для класса Cat свою версию метода equals, который будет сравнивать котов только по весу и возрасту.
 * Создать 2 кота и вывести на экран результат их сравнения
 */

public class HomeWork23Cat {
    public static void main(String[] args) {
        System.out.println("Home work 23 - Cat");
        System.out.println();

        //using constructor we made 4 cats classes
        Cat unknownCat = new Cat();//default Cat class constructor

        Cat cat1 = new Cat("Malevich", 8, 8, "Siam");
        Cat cat2 = new Cat("Kandinsky", 8, 8, "Metis");
        Cat cat3 = new Cat("Leshiy", 3);

        //using toString
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        //using Cat class equals function
        System.out.println();
        System.out.println("Now we check is one cat equals to another by age and weight");
        System.out.println("Is cat " + cat1.name + " equals to cat " + cat2.name + "? - " + cat1.equals(cat2));
        System.out.println("Is cat " + cat1.name + " equals to cat " + cat3.name + "? - " + cat1.equals(cat3));
    }

}

class Cat {
    String name;
    int age;
    int weight;
    String breed;

    public Cat() {
        System.out.println("New Unknown cat was created!");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return (this.weight == cat.weight) && this.age == cat.age;//check weight and age - only if all items is the same it will be true
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat's name is " + name
                + "; and its age is " + age + " years"
                + "; and weight is: " + weight + " KG"
                + "; and breed is " + breed;
    }

}
