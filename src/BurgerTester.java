public class BurgerTester {

    public static void main(String[] args) {

        BurgerTools Object = new BurgerTools("abc",
                22,
                304);


//        Object.mostPopularTopping = "topping 1";
//        Object.averageDaysBeforeExpiration = 4;
//        Object.temperatureWhenCooked = 400;

       // Object.grill();
        System.out.println(Object.share());
        System.out.println(Object.share1());
        System.out.println(Object.share2());

        Object.edit(33);

        System.out.println(Object.share2());

    }

}
