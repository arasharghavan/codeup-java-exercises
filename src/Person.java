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
       name = newName;
   }

   public String getInfo(){
       return String.format("name is %s",name);
   }




}


