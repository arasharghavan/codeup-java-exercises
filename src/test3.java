class person implements info{

    private String name;

    public person(String name){
        this.name=name;
    }

    public void greet(){
        System.out.println("hello");
    }

   public void showinfo(){
       System.out.println("person name is " + name);
    }

}