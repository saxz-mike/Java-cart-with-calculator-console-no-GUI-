import java.util.Scanner;
import java.util.HashMap;

public class Books {
 int ProductId;
 int ProductId2;
 int ProductId3;
 int ProductId4,ProductId5,ProductId6,ProductId7,ProductId8,ProductId9;
 float sum;
 int cartId;
 int quantity;
 String dateAdded;


 Scanner input = new Scanner(System.in);
 Scanner input2 = new Scanner(System.in);
 void register() {
   int echoice;
   int echoice2;
   int echoice3;
   Boolean choice4;
   int bchoice;
   int bchoice1;
   int bchoice2;
   Boolean bchoice3;


  System.out.println(" Books Department ");
  System.out.println(" 1. Children's Books  \n 2. Arts & Photography \n 3. Biographies & Memoirs \n 4. Computers & Technology ");
  
  
  echoice = input.nextInt();
   
switch (echoice) {
 
  case 1:
         System.out.println("1. Oh, the Places You'll Go!  ............USD.11   \n" +
                            "2. The Very Hungry Caterpillar............USD.7    \n" +
                            "3. Colors and Shapes Flash Cards..........USD.3    \n" +
                            "4. Dog Man: For Whom the Ball Rolls.......USD.10  \n");
         /* HashMap */
         HashMap < Integer, String > hmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         hmap.put(1, "Oh, the Places You'll Go!     ");
         hmap.put(2, "The Very Hungry Caterpillar   ");
         hmap.put(3, "Colors and Shapes Flash Cards ");
         hmap.put(4, "Dog ManFor Whom the Ball Rolls");
         HashMap < String, Integer > myMap = new HashMap <  > ();
         myMap.put("Oh, the Places You'll Go!     ", 11);
         myMap.put("The Very Hungry Caterpillar   ", 7);
         myMap.put("Colors and Shapes Flash Cards ", 3);
         myMap.put("Dog ManFor Whom the Ball Rolls", 10);
         System.out.println(" please select an Item to Purchase ");
         echoice2 = input.nextInt();
         ProductId = echoice2;
         if (ProductId > 0 && ProductId < 5) {
          String select = hmap.get(ProductId);
          float selectPrice = myMap.get(select);
          System.out.println("Please Add one more Item into the cart to Proceed with checkout");
          echoice3 = input.nextInt();
          input.nextLine();
          ProductId2 = echoice3;
             if(ProductId2>0 && ProductId2<5){
          String select2 = hmap.get(ProductId2);
          float selectPrice2 = myMap.get(select2);
          System.out.println("               Cart Items                 ");
          System.out.println("==========================================");
          System.out.println(" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
          System.out.println("Item 1: " + select + "...for...USD. " + selectPrice + "\n" +
           "Item 2: " + select2 + "...for...USD. " + selectPrice2 + "\n");
          float a = selectPrice;
          float b = selectPrice2;
          float sum = a + b;
          System.out.println("subTOtal = USD." + sum + "\n");
         
           System.out.println("Enter your Name");
           String customer; 
           customer= input.nextLine();
           
            
           System.out.println("Enter your 16 Digits of the Credit Card");  
           int card[];
           String cardNumber;
           cardNumber= input.nextLine();
           
           
           System.out.println("Enter your Billing Address");
           String billingAd;
           billingAd = input.nextLine();
         
           System.out.println("Enter Your Shipping Address");
           String shippingad;
           shippingad= input.nextLine();
          
           
           System.out.println("               Cart Items                 ");
           System.out.println("==========================================");
           System.out.println(customer+" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
           System.out.println("Item 1: " + select + "...for...USD. " + selectPrice + "\n" +
            "Item 2: " + select2 + "...for...USD. " + selectPrice2 + "\n");
           System.out.println("Your Total Cost is = USD." + sum + "\n"
                   + "Your items will arrive in 2 days at your address:"+billingAd+" "+ shippingad);
         }
         else{
                 System.out.println("Please Input correct choices !. Goodbye..");
         }
          
         }
         
      break;
      
  case 2:
         System.out.println("1. Howard Stern Comes Again..................................USD.21  \n" +
                            "2. The 5 Love Languages: The Secret to Love that Lasts.......USD.10  \n" +
                            "3. The Life-Changing Magic of Tidying Up.....................USD.10  \n" +
                            "4. Man on the Run: Paul McCartney in the 1970................USD.12 \n");
         /* HashMap */
         HashMap < Integer, String > tmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         tmap.put(1, "Howard Stern Comes Again");
         tmap.put(2, "The 5 Love Languages: The Secret to Love that Lasts");
         tmap.put(3, "The Life-Changing Magic of Tidying Up");
         tmap.put(4, "Man on the Run: Paul McCartney in the 1970");
         HashMap < String, Integer > tyMap = new HashMap <  > ();
         tyMap.put("Howard Stern Comes Again", 520);
         tyMap.put("The 5 Love Languages: The Secret to Love that Lasts", 375);
         tyMap.put("The Life-Changing Magic of Tidying Up", 785);
         tyMap.put("Man on the Run: Paul McCartney in the 1970", 555);
         System.out.println(" please select an Item to Purchase ");

         bchoice2 = input.nextInt();
         ProductId3 = bchoice2;
         if (ProductId3 > 0 && ProductId3 < 5) {
          String select3 = tmap.get(ProductId3);
          float selectPrice3 = tyMap.get(select3);
          System.out.println("Please Add one more Item into the cart to Proceed with checkout");
          echoice3 = input.nextInt();
          input.nextLine();
          ProductId4 = echoice3;
             if(ProductId4>0 && ProductId4<5){
          String select4 = tmap.get(ProductId4);
          float selectPrice4 = tyMap.get(select4);
           System.out.println("               Cart Items                 ");
          System.out.println("==========================================");
          System.out.println(" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
          System.out.println("Item 1: " + select3 + "...for...USD. " + selectPrice3 + "\n" +
           "Item 2: " + select4 + "...for...USD. " + selectPrice4 + "\n");
          float a = selectPrice3;
          float b = selectPrice4;
          float sum2 = a + b;
          System.out.println("subTOtal = USD." + sum2 + "\n");
         System.out.println("Enter your Name");
           String customer; 
           customer= input.nextLine();
           
            
           System.out.println("Enter your 16 Digits of the Credit Card");  
           int card[];
           String cardNumber;
           cardNumber= input.nextLine();
           
           
           System.out.println("Enter your Billing Address");
           String billingAd;
           billingAd = input.nextLine();
         
            System.out.println("Enter your  Shipping Address");
           String shippingad;
           shippingad= input.nextLine();
          
           
           System.out.println("               Cart Items                 ");
           System.out.println("==========================================");
           System.out.println(customer+" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
           System.out.println("Item 1: " + select3 + "...for...USD. " + selectPrice3 + "\n" +
            "Item 2: " + select4 + "...for...USD. " + selectPrice4 + "\n");
           System.out.println("Your Total Cost is = USD." + sum2 + "\n"
                   + "Your items will arrive in 2 days at your address:"+billingAd+" "+ shippingad);
         }
         else{
            System.out.println("Please Enter Valid Choices");
         }
          
}
         else{
         System.out.println("please enter valid choices!");
         }
  break;
      
       case 3:
         System.out.println("1.Educated: A Memoir.....................................USD.520  \n" +
                            "2.Becoming...............................................USD.650  \n" +
                            "3.Kushner, Inc.: Greed. Ambition. Corruption.............USD.799  \n" +
                            "4.Grateful American: A Journey from Self to Service......USD.650  \n");
         /* HashMap */
         HashMap < Integer, String > lmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         lmap.put(1, "Educated: A Memoir");
         lmap.put(2, "Becoming");
         lmap.put(3, "Kushner, Inc");
         lmap.put(4, "Grateful American");
         HashMap < String, Integer >lyMap = new HashMap <  > ();
         lyMap.put("Educated: A Memoir", 162);
         lyMap.put("Becoming", 140);
         lyMap.put("Kushner, Inc", 1425);
         lyMap.put("Grateful American", 769);
         System.out.println(" please select an Item to Purchase ");

         bchoice2 = input.nextInt();
         ProductId3 = bchoice2;
         if (ProductId3 > 0 && ProductId3 < 5) {
          String select3 = lmap.get(ProductId3);
          float selectPrice3 = lyMap.get(select3);
          System.out.println("Please Add one more Item into the cart to Proceed with checkout");
          echoice3 = input.nextInt();
          input.nextLine();
          ProductId4 = echoice3;
             if(ProductId4>0 && ProductId4<5){
          String select4 = lmap.get(ProductId4);
          float selectPrice4 = lyMap.get(select4);
           System.out.println("               Cart Items                 ");
          System.out.println("==========================================");
          System.out.println(" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
          System.out.println("Item 1: " + select3 + "...for...USD. " + selectPrice3 + "\n" +
           "Item 2: " + select4 + "...for...USD. " + selectPrice4 + "\n");
          float a = selectPrice3;
          float b = selectPrice4;
          float sum2 = a + b;
          System.out.println("subTOtal = USD." + sum2 + "\n");
         System.out.println("Enter your Name");
           String customer; 
           customer= input.nextLine();
           
            
           System.out.println("Enter your 16 Digits of the Credit Card");  
           int card[];
           String cardNumber;
           cardNumber= input.nextLine();
           
           
           System.out.println("Enter your Billing Address");
           String billingAd;
           billingAd = input.nextLine();
         
           System.out.println("Enter your Shipping Address");
           String shippingad;
           shippingad= input.nextLine();
          
           
           System.out.println("               Cart Items                 ");
           System.out.println("==========================================");
           System.out.println(customer+" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
           System.out.println("Item 1: " + select3 + "...for...USD. " + selectPrice3 + "\n" +
            "Item 2: " + select4 + "...for...USD. " + selectPrice4 + "\n");
           System.out.println("subTOtal = USD." + sum2 + "\n");
             }
             else{
             System.out.println("Please enter valid Choices");
             }
          
}
         else{
         System.out.println("please enter valid choices!");
         }
  break;
            case 4:
         System.out.println("1.Cracking the Coding Interview............................................USD.32   \n" +
                            "2.Clean Code: A Handbook of Agile Software Craftsmanship...................USD.25  \n" +
                            "3.Daily Coding Problem: Get exceptionally good at coding...................USD.33  \n" +
                            "4.CompTIA Security+ Get Certified Get Ahead: SY0-501 Study Guide...........USD.29  \n");
         /* HashMap */
         HashMap < Integer, String > mmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         mmap.put(1, "Cracking the Coding Interview");
         mmap.put(2, "Clean Code: A Handbook of Agile Software Craftsmanship");
         mmap.put(3, "Daily Coding Problem: Get exceptionally good at coding");
         mmap.put(4, "CompTIA Security+ Get Certified Get Ahead: SY0-501 Study Guide");
         HashMap < String, Integer >nyMap = new HashMap <  > ();
         nyMap.put("Cracking the Coding Interview", 32);
         nyMap.put("Clean Code: A Handbook of Agile Software Craftsmanship", 25);
         nyMap.put("Daily Coding Problem: Get exceptionally good at coding", 33);
         nyMap.put("CompTIA Security+ Get Certified Get Ahead: SY0-501 Study Guide", 29);
         System.out.println(" please select an Item to Purchase ");

         bchoice2 = input.nextInt();
         ProductId3 = bchoice2;
         if (ProductId3 > 0 && ProductId3 < 5) {
          String select3 = mmap.get(ProductId3);
          float selectPrice3 = nyMap.get(select3);
          System.out.println("Please Add one more Item into the cart to Proceed with checkout");
          echoice3 = input.nextInt();
          input.nextLine();
          ProductId4 = echoice3;
          String select4 = mmap.get(ProductId4);
          float selectPrice4 = nyMap.get(select4);
           System.out.println("               Cart Items                 ");
          System.out.println("==========================================");
          System.out.println(" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
          System.out.println("Item 1: " + select3 + "........for.....USD. " + selectPrice3 + "\n" +
                             "Item 2: " + select4 + "........for.....USD. " + selectPrice4 + "\n");
          float a = selectPrice3;
          float b = selectPrice4;
          float sum2 = a + b;
          System.out.println("subTOtal = USD." + sum2 + "\n");
         System.out.println("Enter your Name");
           String customer; 
           customer= input.nextLine();
           
            
           System.out.println("Enter your 16 Digits of the Credit Card");  
           int card[];
           String cardNumber;
           cardNumber= input.nextLine();
           
           
           System.out.println("Enter your Billing Address");
           String billingAd;
           billingAd = input.nextLine();
         
           System.out.println("Enter your Shipping Address");
           String shippingad;
           shippingad= input.nextLine();
          
           
           System.out.println("               Cart Items                 ");
           System.out.println("==========================================");
           System.out.println(customer+" Thank You for Shopping with Chanu MegaStores Ltd. \n Your items are:");
           System.out.println("Item 1: " + select3 + "...for...USD. " + selectPrice3 + "\n" +
            "Item 2: " + select4 + "...for...USD. " + selectPrice4 + "\n");
           System.out.println("subTOtal = USD." + sum2 + "\n");
          
          
}
         else{
         System.out.println("please enter valid choices!");
         }
  break;
}
 }

}
   
   
   
   
   
   
   
   
   
 