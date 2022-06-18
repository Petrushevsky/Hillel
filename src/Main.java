import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //создаём значения мапы
        Books book1 = new Books("H.Potter part 1", "J.Rowling", "Fantasy", 2002);
        Books book2 = new Books("H.Potter part 2", "J.Rowling", "Fantasy", 2003);
        Books book3 = new Books("H.Potter part 3", "J.Rowling", "Fantasy", 2004);
        Books book4 = new Books("H.Potter part 4", "J.Rowling", "Fantasy", 2005);
        Books book5 = new Books("H.Potter part 5", "J.Rowling", "Fantasy", 2006);

        MyMap<String, Books> map = new BooksHashMap<>();
        //выводим всё в консоль
        System.out.println("###################################");
        System.out.println("Первому ключу мапы дадим null и книгу " + map.put(null, book1));
        System.out.println("Ване дадим null " + map.put("Ivan", null));
        System.out.println("Ване дадим 1 " + map.put("Ivan", book1));
        System.out.println("Ване дадим 2 " + map.put("Ivan", book2));
        System.out.println("Ване дадим 3 " + map.put("Ivan", book3));
        System.out.println("Ване дадим 4 " + map.put("Ivan", book4));
        System.out.println("Ване дадим 5 " + map.put("Ivan", book5));
        System.out.println("Ире дадим 3 " + map.put("Ira", book3));
        System.out.println("Люсе дадим 5 " + map.put("Lucya", book5));
        System.out.println("###################################");
        System.out.println("Прочитаем всю мапу " + map.toString());
        System.out.println("###################################");
        System.out.println("удалим из мапы Люсю " + map.remove("Lucya"));
        System.out.println("###################################");
        System.out.println("мапа содержит ключи Иван? " + map.containsKey("Ivan"));
        System.out.println("###################################");
        System.out.println("выведем из мапы ключ Иры " + map.get("Ira"));
        System.out.println("###################################");
        System.out.println("выведем размер мапы " + map.size());
        System.out.println("###################################");
        System.out.println("переведем мапу в массив " + Arrays.toString(map.toArray()));
        System.out.println("###################################");
        System.out.println("Очистим мапу ");
        map.clear();
        System.out.println("###################################");
        System.out.println("Мапа пустая? - " + map.isEmpty());


    }

}
