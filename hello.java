

class Person {
Person() {
}
Person(String name, int age) {
this.name = name;
this.age = age;
}
String name;
int age;
}
public class Memory {
public static void main(String[] args) {
Person p1 = new Person("Mehboob", 16);
System.out.println("Name of p1 object: "+p1.name);
Person p2 = new Person("Sagar", 17);
System.out.println("Name of p2 object: "+p2.name);
System.out.println("After changing reference value of p1 to p2");
System.out.println("P2 = null");
p1 = p2;
p2 = null;
System.out.println("Name of p1 object: "+p1.name);
}
}
