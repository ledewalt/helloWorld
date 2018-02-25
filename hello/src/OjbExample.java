public class OjbExample {


    public static void main(String[] args) {
        Person person = new Person();
        person.age = 34;
        person.name = "Bruce";

        System.out.println(person.age);
        System.out.println(person.name);


        String str = new String(" this is a new string.");
        System.out.println(str);

        String str2 = "this is also a string.";
        System.out.println(str2);

        System.out.println(String.format("%d is the age.", person.age));
        System.out.println(String.format("%s is the name.", person.name));


    }
}
