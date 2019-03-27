public class ServerNameGenerator {


    public static void main(String[] args) {

        String[] adjectives = {"adjectives1","adjectives2","adjectives3","adjectives4","adjectives5",
                "adjectives6","adjectives7","adjectives8","adjectives9","adjectives10"
        };

        String[] nouns = {"nouns1","nouns2","nouns3","nouns4","nouns5","nouns6",
                "nouns7","nouns8","nouns9","nouns10"
        };

        System.out.println("Here is your server name: ");
        System.out.println(adjectives[(int) number(adjectives)] + " " + nouns[(int) number(nouns)]);
    }


    public static double number(String[] input){
       double random = (Math.random() * input.length);
       return random;
    }




}
