package Hillel.javaIntroduction;

class Persons {
    private String name;
    private String parents = "";

    public Persons() {
    }

    public Persons(String name) {
        this.name = name;
    }

    public void parents(Persons persons) {
        this.parents += persons.name + " ";
    }

    public void showParents() {
        System.out.println("Child called: " + this.name);
        System.out.println(this.name + "'s parents are: " + parents);
    }

    @Override
    public String toString() {
        return parents + "'s name is " + name;
    }
}

public class HomeWork26Family {
    public static void main(String[] args) {
        System.out.println("Home Work 26 Family");
        System.out.println();
        Persons sasha = new Persons("Sasha");
        Persons masha = new Persons("Masha");
        Persons oleg = new Persons("Oleg");
        sasha.parents(oleg);
        sasha.parents(masha);
        sasha.showParents();


    }

}
