public class BurgerTools {

    private String mostPopularTopping ;
    private int averageDaysBeforeExpiration;
    private int temperatureWhenCooked;

    private void grill(){
        System.out.println("Grilling burger");
    }

    public BurgerTools(String mostPopularTopping, int averageDaysBeforeExpiration, int temperatureWhenCooked){
        this.mostPopularTopping = mostPopularTopping;
        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
        this.temperatureWhenCooked = temperatureWhenCooked;
    }

    public String share(){
        return mostPopularTopping;
    }

    public int share1(){
        return averageDaysBeforeExpiration;
    }

    public int share2(){
        grill();
        return temperatureWhenCooked;

    }

    public void edit(int temperatureWhenCooked){
        this.temperatureWhenCooked = temperatureWhenCooked;
    }

}

