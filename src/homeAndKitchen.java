import java.util.Scanner;
import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home Office
 */
public class homeAndKitchen {
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



  System.out.println(" Home & Kitchen Department ");
  System.out.println(" 1. Kitchen & Dining  \n 2. Bedding \n 3. Furniture \n 4. Cleaning Supplies ");
  
  
  echoice = input.nextInt();
   
switch (echoice) {
 
  case 1:
         System.out.println("1.Magic Bullet Blender, Silver..............................USD.33    \n" +
                            "2.AmazonBasics Silicone Baking Mat - 2-Pack.................USD.35    \n" +
                            "3.Kleenex Hand Towels, 60 Count per Box, Pack of 6..........USD.18    \n" +
                            "4.Nuby Garden Fresh Fruitsicle Frozen Pop Tray..............USD.9     \n");
         /* HashMap */
         HashMap < Integer, String > hmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         hmap.put(1, "Magic Bullet Blender, Silver");
         hmap.put(2, "AmazonBasics Silicone Baking Mat - 2-Pack");
         hmap.put(3, "Kleenex Hand Towels, 60 Count per Box, Pack of 6");
         hmap.put(4, "Nuby Garden Fresh Fruitsicle Frozen Pop Tray");
         HashMap < String, Integer > myMap = new HashMap <  > ();
         myMap.put("Magic Bullet Blender, Silver", 33);
         myMap.put("AmazonBasics Silicone Baking Mat - 2-Pack", 35);
         myMap.put("Kleenex Hand Towels, 60 Count per Box, Pack of 6", 18);
         myMap.put("Nuby Garden Fresh Fruitsicle Frozen Pop Tray", 9);
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
          if(ProductId4>0 && ProductId4<5){
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
         
           System.out.println("Enter your Shipping Address");
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
          System.out.println("Please Input valid choices !");
          }
    
          
         }
         
      break;
      
  case 2:
         System.out.println("1.AmazonBasics Microfiber Sheet Set - Queen, Dark Grey....................USD.20  \n" +
                            "2.Little Sleepy Head Toddler Pillow, White, 13 X 18.......................USD.10  \n" +
                            "3.Dreamtown Kids Toddler Pillow With Pillowcase 14x19 White...............USD.14  \n" +
                            "4.Travelmate Memory Foam Neck Pillow, Dark Blue...........................USD.13  \n");
         /* HashMap */
         HashMap < Integer, String > tmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         tmap.put(1, "AmazonBasics Microfiber Sheet Set - Queen, Dark Grey");
         tmap.put(2, "Little Sleepy Head Toddler Pillow, White, 13 X 18");
         tmap.put(3, "Dreamtown Kids Toddler Pillow With Pillowcase 14x19 White");
         tmap.put(4, "Travelmate Memory Foam Neck Pillow, Dark Blue");
         HashMap < String, Integer > tyMap = new HashMap <  > ();
         tyMap.put("AmazonBasics Microfiber Sheet Set - Queen, Dark Grey", 20);
         tyMap.put("Little Sleepy Head Toddler Pillow, White, 13 X 18", 10);
         tyMap.put("Dreamtown Kids Toddler Pillow With Pillowcase 14x19 White", 14);
         tyMap.put("Travelmate Memory Foam Neck Pillow, Dark Blue", 13);
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
          float all=sum+sum2;
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
           System.out.println("Your Total Cost is = USD." + sum2 + "\n"
                   + "Your items will arrive in 2 days at your address:"+billingAd+" "+ shippingad);
          }
       
          
         else{
         System.out.println("please enter valid choices!");
         }
}
         else{
         System.out.println("please enter valid choices!");
         }
  break;
      
       case 3:
         System.out.println("1.Linenspa 6 Inch Innerspring Mattress - Twin.......................USD.72  \n" +
                            "2.AmazonBasics Mid-Back Black Mesh Chair............................USD.58  \n" +
                            "3.SHW L-Shaped Home Office Corner Desk Wood Top, Espresso...........USD.89  \n" +
                            "4.Furinno 14035EX Study Table Espresso..............................USD.27  \n");
         /* HashMap */
         HashMap < Integer, String > lmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         lmap.put(1, "Linenspa 6 Inch Innerspring Mattress - Twin");
         lmap.put(2, "AmazonBasics Mid-Back Black Mesh Chair");
         lmap.put(3, "SHW L-Shaped Home Office Corner Desk Wood Top, Espresso");
         lmap.put(4, "Furinno 14035EX Study Table Espresso");
         HashMap < String, Integer >lyMap = new HashMap <  > ();
         lyMap.put("Linenspa 6 Inch Innerspring Mattress - Twin", 72);
         lyMap.put("AmazonBasics Mid-Back Black Mesh Chair", 58);
         lyMap.put("SHW L-Shaped Home Office Corner Desk Wood Top, Espresso", 89);
         lyMap.put("Furinno 14035EX Study Table Espresso", 27);
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
          float all=sum+sum2;
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
           System.out.println("Your Total Cost is = USD." + sum2 + "\n"
                   + "Your items will arrive in 2 days at your address:"+billingAd+" "+ shippingad);
          
          }
         
          else{
         System.out.println("please enter valid choices!");
         }
}
         else{
         System.out.println("please enter valid choices!");
         }
  break;
            case 4:
         System.out.println("1.Glad Tall Kitchen Drawstring Trash Bag - 13 Gallon, 90 Count.................USD.15   \n" +
                            "2.Scotch-Brite Non-Scratch Scrub Sponge, 6-Sponges.............................USD.6    \n" +
                            "3.O-Cedar Easy Wring Spin Mop and Bucket Floor Cleaning System.................USD.30  \n" +
                            "4.CompTIA Security+ Get Certified Get Ahead: SY0-501 Study Guide...........USD.29  \n");
         /* HashMap */
         HashMap < Integer, String > mmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         mmap.put(1, "Glad Tall Kitchen Drawstring Trash Bag - 13 Gallon, 90 Count");
         mmap.put(2, "Scotch-Brite Non-Scratch Scrub Sponge, 6-Sponges");
         mmap.put(3, "O-Cedar Easy Wring Spin Mop and Bucket Floor Cleaning System");
         mmap.put(4, "AmazonBasics Microfiber Cleaning Cloth - 24-Pack");
         HashMap < String, Integer >nyMap = new HashMap <  > ();
         nyMap.put("Glad Tall Kitchen Drawstring Trash Bag - 13 Gallon, 90 Count", 15);
         nyMap.put("Scotch-Brite Non-Scratch Scrub Sponge, 6-Sponges", 6);
         nyMap.put("O-Cedar Easy Wring Spin Mop and Bucket Floor Cleaning System", 30);
         nyMap.put("AmazonBasics Microfiber Cleaning Cloth - 24-Pack", 13);
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
           if(ProductId4>0 && ProductId4<5){
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
          float all=sum+sum2;
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
                      System.out.println("Your Total Cost is = USD." + sum2 + "\n"
                   + "Your items will arrive in 2 days at your address:"+billingAd+" "+ shippingad);
           }
           else{
         System.out.println("please enter valid choices!");
         }
}
         else{
         System.out.println("please enter valid choices!");
         }
  break;
}
 }

}
   
   
   
   
   
   
   
   
   
 