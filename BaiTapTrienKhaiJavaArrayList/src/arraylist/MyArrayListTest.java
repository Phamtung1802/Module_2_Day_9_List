package arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> Demo=new MyArrayList<Integer>(0);
        System.out.println("length= "+ Demo.printElementLenght());
        Demo.add(0,3);
        Demo.add(1,4);
        Demo.add(2,5);
        Demo.add(3,7);
        System.out.println("length= "+ Demo.printElementLenght());
        System.out.println(Demo.printAllElement());
        Demo.add(4,6);
        Demo.add(5,9);
        System.out.println("length= "+ Demo.printElementLenght());
        System.out.println(Demo.printAllElement());
        Demo.remove(3);
        System.out.println("length= "+ Demo.printElementLenght());
        System.out.println(Demo.printAllElement());
        System.out.println(Demo.contains(19));
        System.out.println(Demo.indexOf(6));
        System.out.println(Demo.get(1).toString());
        Demo.clear();

    }
}
