

class app{


    public static void main(String[] args) {

        machine machine1 = new machine();
        machine1.start();

        person person1 = new person("arash");
        person1.greet();

        info info1 = new machine();
        info1.showinfo();
        info info2 = new person("sudi");
       
    }

}















//        Scanner input = new Scanner(System.in);
//
//        System.out.println("hi what is your name?");
//
//        String name = input.nextLine();
//
//        test2 test2Object = new test2();
//        test2Object.sayHello(name);
//
//        test2Object.test(name);


//        Random dice = new Random();
//        int num;
//        for (int  i = 1; i <= 10; i++){
//            num = 1 + dice.nextInt(4);
//            System.out.println(num);
//        }


//        Random dice = new Random();
//
//        int freq[] = new int [7];
//
//        for (int i = 0 ; i < 1000 ; i++){
//           ++freq[1+dice.nextInt(6)];
//        }
//
//        System.out.println("face\tfreq");
//
//        int total=0;
//
//        for (int i =1; i < freq.length; i++){
//            System.out.println(i + "\t\t" + freq[i]);
//            total += freq[i];
//        }
//        System.out.println("total = " + total);

//        int arash [] = {1,2,3,4,5};
//        int total = 0;
//
//        for (int x: arash){
//            total += x;
//            System.out.println(x);
//        }
//        System.out.println(total);

//sub**
//        int arash[] = {1,2,3,4,5};
//        sub(arash);
//
//        for (int x:arash){
//            System.out.println(x);
//        }

//        int arash[][] = {{1,2,3,4},{2,3,5},{6,7,8,9}};
//        display(arash);

        //System.out.println(ave(1,2,3,4,5));


//        test2 test2Object = new test2();
//        test2Object.time(13,3,40);
//        System.out.println(test2Object.military());
//        System.out.println(test2Object.clock());


//       test2 test2Object = new test2();
//
//       test2Object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       test2Object.setSize(275,180);
//       test2Object.setVisible(true);


//        test2 test2Object = new test2();
//
//        test2Object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        test2Object.setSize(400,400);
//        test2Object.setVisible(true);














//sub**&&&&&&&&&&&&&&&&&&&&&&&&
//    public static void sub(int x[]){
//        for (int i=0; i<x.length; i++){
//            x[i] += -1;
//        }
//    }

//    public static void display(int input [][]){
//        for (int row = 0; row < input.length; row++){
//            for (int col = 0 ; col < input[row].length; col++){
//                System.out.print(input[row][col] + "\t");
//            }
//            System.out.println();
//        }
//    }

//    public static int ave(int...input){
//         int total = 0 ;
//        for (int x:input){
//            total += x;
//        } return total / input.length;
//    }




