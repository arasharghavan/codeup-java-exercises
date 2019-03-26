public class PersonMain {

    public static void main(String[] args) {

        Person Object = new Person("arash");
//
        Person person1 = new Person("John1");
        Person person2 = new Person("John");

        //System.out.println(person1.getName().equals(person2.getName()));
        //System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());







        Object.setName("arash");
        person1.setName("mio");
        System.out.println(Object.getName());
        Object.sayHello();
        System.out.println(person1.getInfo());
        System.out.println(person2.getInfo());







    }

}
