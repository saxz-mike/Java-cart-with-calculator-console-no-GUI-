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
public class healthAndHousehold {
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



  System.out.println(" Health and Household ");
  System.out.println(" 1. Oral Care  \n 2. Health Care \n 3. Medical Supplies and Equipment \n 4. Stationery & Gift Wrapping  ");
  
  
  echoice = input.nextInt();
   
switch (echoice) {
 
  case 1:
         System.out.println("1.Glide Oral-B Pro-Health Deep Clean Floss, Mint, Pack of 6................USD.14    \n" +
                            "2.Dr. Tung's Tongue Cleaner, Stainless Steel (colors may vary).............USD.6     \n" +
                            "3.Colgate Extra Clean Full Head Toothbrush, Medium - 6 Count...............USD.5     \n" +
                            "4.GUM Anti-Bacterial Toothbrush ...........................................USD.3     \n");
         /* HashMap */
         HashMap < Integer, String > hmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         hmap.put(1, "Glide Oral-B Pro-Health Deep Clean Floss, Mint, Pack of 6");
         hmap.put(2, "Dr. Tung's Tongue Cleaner, Stainless Steel (colors may vary)");
         hmap.put(3, "Colgate Extra Clean Full Head Toothbrush, Medium - 6 Count");
         hmap.put(4, "GUM Anti-Bacterial Toothbrush");
         HashMap < String, Integer > myMap = new HashMap <  > ();
         myMap.put("Glide Oral-B Pro-Health Deep Clean Floss, Mint, Pack of 6", 14);
         myMap.put("Dr. Tung's Tongue Cleaner, Stainless Steel (colors may vary)", 6);
         myMap.put("Colgate Extra Clean Full Head Toothbrush, Medium - 6 Count", 5);
         myMap.put("GUM Anti-Bacterial Toothbrush", 3);
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
         System.out.println("1.Sea-Band The Original Wristband Adults...............................USD.6   \n" +
                            "2.A World Of Deals Disposable Blue Underpad 23 X 36, 150/Case..........USD.28  \n" +
                            "3.Bruder Moist Heat Eye Compress.......................................USD.14  \n" +
                            "4.Poise Incontinence Pads, Maximum Absorbency, Long, 84 Count..........USD.23  \n");
         /* HashMap */
         HashMap < Integer, String > tmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         tmap.put(1, "Sea-Band The Original Wristband Adults");
         tmap.put(2, "A World Of Deals Disposable Blue Underpad 23 X 36, 150/Case");
         tmap.put(3, "Bruder Moist Heat Eye Compress");
         tmap.put(4, "Poise Incontinence Pads, Maximum Absorbency, Long, 84 Count");
         HashMap < String, Integer > tyMap = new HashMap <  > ();
         tyMap.put("Sea-Band The Original Wristband Adults", 6);
         tyMap.put("A World Of Deals Disposable Blue Underpad 23 X 36, 150/Case", 28);
         tyMap.put("Bruder Moist Heat Eye Compress", 14);
         tyMap.put("Poise Incontinence Pads, Maximum Absorbency, Long, 84 Count", 23);
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
         System.out.println("1.Plastic Transfer Bench..........................................USD.56  \n" +
                            "2.Clearblue Digital Ovulation Test, 20 Ovulation Tests............USD.37  \n" +
                            "3.Power One Mercury Free Hearing Aid Batteries Size P312..........USD.14  \n" +
                            "4.Drive Medical Folding Steel Bedside Commode, Grey...............USD.35  \n");
         /* HashMap */
         HashMap < Integer, String > lmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         lmap.put(1, "Plastic Transfer Bench");
         lmap.put(2, "Clearblue Digital Ovulation Test, 20 Ovulation Tests");
         lmap.put(3, "Power One Mercury Free Hearing Aid Batteries Size P312");
         lmap.put(4, "Drive Medical Folding Steel Bedside Commode, Grey");
         HashMap < String, Integer >lyMap = new HashMap <  > ();
         lyMap.put("Plastic Transfer Bench", 56);
         lyMap.put("Clearblue Digital Ovulation Test, 20 Ovulation Tests", 37);
         lyMap.put("Power One Mercury Free Hearing Aid Batteries Size P312", 14);
         lyMap.put("Drive Medical Folding Steel Bedside Commode, Grey", 35);
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
         System.out.println("1.Wilton 1912-1239 Clear Tall Treat Bags, 4 × 9½..................USD.6   \n" +
                            "2.Knock Knock All Out of Note Pad, Blue (12226)...................USD.8   \n" +
                            "3.Happy Birthday Cake Pop Up Greeting Card........................USD.5   \n" +
                            "4.Hallmark White Tissue Paper (100 Sheets)........................USD.10  \n");
         /* HashMap */
         HashMap < Integer, String > mmap = new HashMap <  > ();
         /*Adding elements to HashMap*/
         mmap.put(1, "Wilton 1912-1239 Clear Tall Treat Bags, 4 × 9½");
         mmap.put(2, "Knock Knock All Out of Note Pad, Blue (12226)");
         mmap.put(3, "Happy Birthday Cake Pop Up Greeting Card");
         mmap.put(4, "Hallmark White Tissue Paper (100 Sheets)");
         HashMap < String, Integer >nyMap = new HashMap <  > ();
         nyMap.put("Wilton 1912-1239 Clear Tall Treat Bags, 4 × 9½", 6);
         nyMap.put("Knock Knock All Out of Note Pad, Blue (12226)", 8);
         nyMap.put("Happy Birthday Cake Pop Up Greeting Card", 5);
         nyMap.put("Hallmark White Tissue Paper (100 Sheets)", 10);
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
   
   
   
   
   
   
   
   
   
 