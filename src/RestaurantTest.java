public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish restaurantObject = new RestaurantDish();

        restaurantObject.costInCents = 2000;
        restaurantObject.nameOfDish = "Shish kebab";
        //restaurantObject.wouldRecommend = true;

        System.out.println("Cost in cents: "+restaurantObject.costInCents);
        System.out.println("Name of dish: "+restaurantObject.nameOfDish);
        System.out.println("Recommening: "+restaurantObject.wouldRecommend);

        restaurantObject.eat();

    }

}
