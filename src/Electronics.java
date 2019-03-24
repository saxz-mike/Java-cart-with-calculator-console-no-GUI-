import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author 
 */
class Electronics {
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
   
  


   System.out.println(" Electronics Department ");
   System.out.println(" 1. Cellphones & Accessories  \n 2. Tv's and Videos \n 3. Fridges  \n 4. Computers & Accessories ");
   echoice = input.nextInt();
   
switch (echoice) {
 
  case 1:
         System.out.println("1. Iphone  5............USD.299  \n" +
          "2. Huawei Mate 12.......USD.375  \n" +
          "3. Iphone  6............USD.785  \n" +
          "4. Samsung s9...........USD.999  \n");
         /* HashMap */
         HashMap < Integer, String > hmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         hmap.put(1, "Iphone 5");
         hmap.put(2, "Huawei Mate 12");
         hmap.put(3, "Iphone  6");
         hmap.put(4, "Samsung s9");
         HashMap < String, Integer > myMap = new HashMap <  > ();
         myMap.put("Iphone 5", 299);
         myMap.put("Huawei Mate 12", 375);
         myMap.put("Iphone  6", 785);
         myMap.put("Samsung s9", 999);
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
         
      break;
      
  case 2:
         System.out.println("1. Sony 32 Inch............USD.520  \n" +
                            "2. LG 49 Inch..............USD.650  \n" +
                            "3. Samsung 52 Inch.........USD.799  \n" +
                            "4. Sony 40 Inch............USD.650  \n");
         /* HashMap */
         HashMap < Integer, String > tmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         tmap.put(1, "Sony 32 Inch");
         tmap.put(2, "LG 49 Inch");
         tmap.put(3, "Samsung 52 Inch");
         tmap.put(4, "Sony 40 Inch");
         HashMap < String, Integer > tyMap = new HashMap <  > ();
         tyMap.put("Sony 32 Inch", 520);
         tyMap.put("LG 49 Inch", 375);
         tyMap.put("Samsung 52 Inch", 785);
         tyMap.put("Sony 40 Inch", 555);
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
  break;
      
       case 3:
         System.out.println("1. Arctic King 3.2 Cu Ft Two Door Mini Refrigerator with Freezer............USD.520  \n" +
                            "2. Willz 2.7 Cu Ft Refrigerator Single Door/Chiller.........................USD.650  \n" +
                            "3. KoolMore 19 cu. ft Stainless Steel Solid Door refrigerator Cooler........USD.799  \n" +
                            "4. Galanz 7.6 cu. ft. Mini Refrigerator in Red..............................USD.650  \n");
         /* HashMap */
         HashMap < Integer, String > lmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         lmap.put(1, "Arctic King 3.2 Cu Ft...");
         lmap.put(2, "Willz 2.7 Cu Ft...");
         lmap.put(3, "KoolMore 19 cu. ft...");
         lmap.put(4, "Galanz 7.6 cu. ft...");
         HashMap < String, Integer >lyMap = new HashMap <  > ();
         lyMap.put("Arctic King 3.2 Cu Ft...", 162);
         lyMap.put("Willz 2.7 Cu Ft...", 140);
         lyMap.put("KoolMore 19 cu. ft...", 1425);
         lyMap.put("Galanz 7.6 cu. ft...", 769);
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
          System.out.println("Your Total Cost is = USD." + sum2 + "\n");
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
  break;
            case 4:
         System.out.println("1. Samsung 860 EVO 500GB 2.5 Inch SATA III Internal SSD...............................USD.520  \n" +
                            "2. Acer Aspire E 15,8th Gen Intel Core i3-8130U, 6GB RAM, 1TB HDD, 8X DVD.............USD.650  \n" +
                            "3. Acer SB220Q bi 21.5\" Full HD (1920 x 1080)(HDMI & VGA Port).......................USD.799  \n" +
                            "4. HP 952 Cyan, Magenta & Yellow Ink Cartridges, 3 Cartridges.........................USD.650  \n");
         /* HashMap */
         HashMap < Integer, String > mmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         mmap.put(1, "Samsung 860 EVO 500GB 2.5 Inch SATA III  SSD");
         mmap.put(2, "Acer Aspire E 15,8th Gen Intel Core i3-8130U");
         mmap.put(3, "Acer SB220Q bi 21.5\" Full HD (1920 x 1080).");
         mmap.put(4, "HP 952 Cyan, Magenta & Yellow Ink Cartridges");
         HashMap < String, Integer >nyMap = new HashMap <  > ();
         nyMap.put("Samsung 860 EVO 500GB 2.5 Inch SATA III  SSD", 78);
         nyMap.put("Acer Aspire E 15,8th Gen Intel Core i3-8130U", 330);
         nyMap.put("Acer SB220Q bi 21.5\" Full HD (1920 x 1080).", 90);
         nyMap.put("HP 952 Cyan, Magenta & Yellow Ink Cartridges", 66);
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
  break;
}
 }

}
   
   
   
   
   
   
   
   
   
 