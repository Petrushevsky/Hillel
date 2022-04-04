package HomeWorks.homeWork3;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();

        System.out.println("##################### BEGIN ########################");
        //вывод всех возможностей интерфейса
        System.out.println("add");
        //добавляем в коллекцию значения
        list.add(230);
        list.add(44);
        list.add(232);
        list.add(355);
        list.add(222);
        list.add(99);
        list.add(66);
        list.add(456);
        System.out.println(list);
        System.out.println("####################################################");
        System.out.println("add(index 5 ,element 111)");
        list.add(5, 111);
        System.out.println(list);
        System.out.println("####################################################");
        System.out.println("Size of list is: "+list.size());
        System.out.println("####################################################");
        System.out.println("remove 5 index");
        list.remove(5);
        System.out.println(list);
        System.out.println("####################################################");
        System.out.println("remove 222");
        list.removeByValue(222);
        System.out.println(list);
        System.out.println("####################################################");
        System.out.println("Set index 4 to 1000 is " + list.set(4, 1000));
        System.out.println(list);
        System.out.println("####################################################");
        System.out.println("sublist(3,6)");
        IntList subLIst = list.subList(3, 6);
        System.out.println(subLIst);
        System.out.println("####################################################");
        System.out.println("Get index 3: " + list.get(3));
        System.out.println("####################################################");
        System.out.println("List is empty? " + list.isEmpty());
        System.out.println("####################################################");
        System.out.println("clear");
        list.clear();
        System.out.println(list);
        System.out.println("######################### END #######################");

    }
}
