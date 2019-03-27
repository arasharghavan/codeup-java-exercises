import java.util.Arrays;

public class Person {

// 1************************

   private String name;

   public String getName(){
       return this.name;
   }

   public void setName(String name){
       this.name = name;
   }

   public void sayHello(){
       System.out.println("Hello " + this.name);
   }


//  2 ***********************

   public Person(String newName){
       this.name = newName;
   }

   public String getInfo(){
       return String.format("name is %s",this.name);
   }

    static Person[] addPerson(Person[] oldPeople, Person newPerson){
        Person[] newPeople;
        //or// newPeople = new Person[oldPeople.length + 1];
        newPeople = Arrays.copyOf(oldPeople,oldPeople.length+1);

        newPeople[newPeople.length-1] = newPerson;
        return newPeople;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}


