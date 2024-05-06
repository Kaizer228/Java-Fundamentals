package Objects;
 
public class Main {

public static void main(String[] args) {
    
Human person = new Human(null, null, null);

person.setName("Marc");
person.setGender("Male");
person.setHeight(173.5);
System.out.println(person.getName());
System.out.println(person.getGender());
System.out.println(person.getHeight());

Child children = new Child(null, null, null);

 
children.setName("Erman");

 
System.out.println("Child: " + children.getName());

System.out.println(Human.Player);
  }
 
 
}