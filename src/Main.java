/*public class Main {
    public static void main(String[] args) {
        boolean loggedIn = false;
        boolean isWorker = false;

        Product product = new Product("shir", 15);
        Product product2 = new Product("cola", 100);
        Product[] products = {product, product2};
        Cart cart = new Cart(new Customer("admin","admin"), products);
        System.out.println(cart);
        cart.addProduct(new Product("shoko", 100000));
        System.out.println(cart);

        Worker worker = new Worker("admin", "admin", 0.8);
        Worker worker2 = new Worker("admin", "123", "manager");

        if(!worker.equals(worker2)){
            System.out.println("not the same");
        }

        while(true){
            if(!loggedIn){
                //1. sign in 2. sign up 3. exit

                // if 3 - > break;
            }else{
                if(isWorker){
                    // worker menu
                }else{
                    // customer menu
                }
            }
            break; // delete later
        }

    }
}*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 100;
        User [] users = new User[ARRAY_SIZE];
        Product [] products = new Product[ARRAY_SIZE];
        Worker worker = new Worker("KJFK","SKJFKDFG",1);


        final int CREATE_NEW_ACCOUNT = 1;
        final int LOG_IN = 2;
        final int EXIT = 3;
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        boolean loggedIn = false;
        boolean isWorker = false;

        Cart cart = new Cart(users[0]);
     //   shop.addProduct("salt", 3, true);

        while (true) {
                System.out.println("Please select one of the following options:");
                System.out.println("1 - Create new account ");
                System.out.println("2 - Log in ");
                System.out.println("3 - Exit ");
                int cases = scanner.nextInt();
                User user;
                switch (cases) {
                    case CREATE_NEW_ACCOUNT:
                        System.out.println("You chose to creat a new account");
                        shop.createUser();
                        String password = new Scanner(System.in).nextLine();
                        for (int i = 0; i < password.length(); i++) {
                            char currentChar = password.charAt(i);

                        }
                        break;
                    case LOG_IN:

                        user =  shop.login ();
                      if (user == null){
                          System.out.println("incorrect username or password");
                          break;
                      }

                        if (user.getIsWorker()){
                            System.out.println("hello, " + user.getFirstName() + " " + user.getLastName() + worker.getRank() );
                                System.out.println("Please select one of the following options:");
                                System.out.println("1 - Print all customers details ");
                                System.out.println("2 - Print club customers details ");
                                System.out.println("3 - Print customers who perches details ");
                                System.out.println("4 - Print the details of the customer who has spend the most money here  ");
                                System.out.println("5 - Add a new product ");
                                System.out.println("6 - Change in stock status");
                                System.out.println("7 - Perches ");
                                System.out.println("8 -exit");



                            int workerOptions = scanner.nextInt();
                                switch (workerOptions) {
                                    case 1:
                                       shop.printUser();
                                       break;

                                    case 2:
                                        for (int i = 0; i < users.length; i++) {
                                            if (users[i].getClubMember()){
                                                System.out.println(users[i]);
                                            }
                                        }
                                    case 3:
                                        
                                }



                        }
                        else {

                            if (user.getClubMember()) {
                                System.out.println("hello, " + user.getFirstName() + " " + user.getLastName() + "{VIP!}");
                            } else {
                                System.out.println("hello, " + user.getFirstName() + " " + user.getLastName() + "!");
                            }

                        }

                        System.out.println("Here are some of our products: ");
                      shop.myProducts(cart);
                        System.out.println(" ");


                        System.out.println("please choose the number of the product you want to add to your cart" +
                                "or chose -1 to exit");

                        System.out.println(" ");

                        cart.printCart();
               }
                if (cases == 3) {
                    break;
                }

        }
    }
}