/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantordermain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vikashgiritharan
 */
public class RestaurantOrdermain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalBill = 0;
        int quantity = 0;
        
        List<String> AppetizerNames = new ArrayList<>();
        // Up to 6 Appetizer Options
        AppetizerNames.add("Lettuce Wraps");
        AppetizerNames.add("Dynamite Shrimp");
        AppetizerNames.add("Signature Sampler Dumplings");
        AppetizerNames.add("Tempura Calamari & Vegetables");
        AppetizerNames.add("Chili-Garlic Green Beans");
        AppetizerNames.add("Crispy Green Beans");
        
        List<Integer> AppetizerPrices = new ArrayList<>();
        // Matching Prices for Up to 6 Options
        AppetizerPrices.add(9);
        AppetizerPrices.add(5);
        AppetizerPrices.add(7);
        AppetizerPrices.add(9);
        AppetizerPrices.add(6);
        AppetizerPrices.add(8);
        
        List<String> EntreeNames = new ArrayList<>();
        // Up to 10 Entree Options
        EntreeNames.add("Stir Fry Eggplant");
        EntreeNames.add("Sesame Chicken");
        EntreeNames.add("Peking Duck");
        EntreeNames.add("Shrimp with Lobster Sauce");
        EntreeNames.add("Crisp Honey");
        EntreeNames.add("Ginger Chicken with Broccoli");
        EntreeNames.add("Salt & Pepper Prawns");
        EntreeNames.add("Sweet & Sour Chicken");
        EntreeNames.add("Kung Pao Chicken");
        EntreeNames.add("Ma Po Tofu");
        
        List<Integer> EntreePrices = new ArrayList<>();
        // Matching Prices for Up to 10 Options
        EntreePrices.add(12);
        EntreePrices.add(11);
        EntreePrices.add(13);
        EntreePrices.add(14);
        EntreePrices.add(15);
        EntreePrices.add(11);
        EntreePrices.add(10);
        EntreePrices.add(13);
        EntreePrices.add(16);
        EntreePrices.add(13);
        
        List<String> DessertNames = new ArrayList<>();
        // Up to 4 Dessert Options
        DessertNames.add("New York-Style Cheesecake");
        DessertNames.add("Bao Donuts");
        DessertNames.add("Fire & Ice");
        DessertNames.add("Banana Spring Rolls");
        
        List<Integer> DessertPrices = new ArrayList<>();
        // Matching Prices for Up to 4 Options
        DessertPrices.add(5);
        DessertPrices.add(6);
        DessertPrices.add(6);
        DessertPrices.add(4);
        
        System.out.println("\t\t\t\tWelcome to Kash's Cuisine! Give us a moment while we get your menu setup!");
        System.out.println("\t\t\t\t=========================================================================");
        System.out.println("\t\t\t\t          Would you like to start with any Appetizers? Y or N?           ");
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner (System.in);
        Scanner scan6 = new Scanner (System.in);
        Scanner scan7 = new Scanner (System.in);
        Scanner scan8 = new Scanner (System.in);
        Scanner scan9 = new Scanner (System.in);
        Scanner scan10 = new Scanner (System.in);
        Scanner scan11 = new Scanner (System.in);
        Scanner scan12 = new Scanner (System.in);
        Scanner scan13 = new Scanner (System.in);
        Scanner scan14 = new Scanner (System.in);
        Scanner scan15 = new Scanner (System.in);
        Scanner scan16 = new Scanner (System.in);
        Scanner scan17 = new Scanner (System.in);
        String dessertChoose = "";
        String entreeChoose = "";
        String optionChoose = scan.nextLine();
        int k = 0;
        if (optionChoose.equalsIgnoreCase("y"))
        {
            while (k==0){
            {
       
                System.out.println("\t\t\t\t                               APPETIZERS MENU                           ");
                for (int i=0; i<AppetizerPrices.size(); i++)
                {
                    System.out.println("\t\t\t\t           " + (i+1) + ". $ " + AppetizerPrices.get(i) + " ------------------ " + AppetizerNames.get(i));
                }
                System.out.println();
                System.out.println("\t\t\t\t     Which item would you like? Enter the # of the selection below!"      );
                int optionNumber = scan.nextInt();
                System.out.println("\t\t\t\t        Great! You have chosen " + AppetizerNames.get(optionNumber-1) + " for $" + AppetizerPrices.get(optionNumber-1));
                System.out.println("\tIf you would like to confirm this selection - enter Y! If you would like to change the quantity of this selection - enter C!");
                String decidingValue = scan1.nextLine();
                
                if (decidingValue.equalsIgnoreCase("c"))
                {
                    System.out.println("\t\t\t\t                           How many would you like?     ");
                    int number = scan10.nextInt();
                    quantity = number;
                    totalBill += (quantity*AppetizerPrices.get(optionNumber-1));
                    System.out.println("\t\t\t\tWould you like anything else from appetizers? If so, enter Y! If not, enter N!     ");
                    String decider2 = scan2.nextLine();
                        if (decider2.equalsIgnoreCase("y"))
                        {
                            k=0;
                        }
                        else
                        {
                            k=1;
                            optionChoose = "n";
                        }
                }
                if (decidingValue.equalsIgnoreCase("y"))
                {
                    totalBill += AppetizerPrices.get(optionNumber-1);
                    System.out.println("\t\t\t\tWould you like anything else from appetizers? If so, enter Y! If not, enter N!     ");
                    String decider3 = scan9.nextLine();
                    if (decider3.equalsIgnoreCase("y"))
                        k=0;
                    else
                        k=1;
                        optionChoose = "n"; 
                }
            }
            }
        }
            if (optionChoose.equalsIgnoreCase("n"))
            {
            System.out.println("\t\t\t\t          Would you like to move on to the Entree Menu? Y or N?           ");
            entreeChoose = scan3.nextLine();
            int m = 0;
        if (entreeChoose.equalsIgnoreCase("y"))
        {
            while (m==0){
            {
       
                System.out.println("\t\t\t\t                               ENTREE MENU                           ");
                for (int i=0; i<EntreePrices.size(); i++)
                {
                    System.out.println("\t\t\t\t           " + (i+1) + ". $ " + EntreePrices.get(i) + " ------------------ " + EntreeNames.get(i));
                }
                System.out.println();
                System.out.println("\t\t\t\t     Which item would you like? Enter the # of the selection below!"      );
                int optionNumber = scan4.nextInt();
                System.out.println("\t\t\t\t        Great! You have chosen " + EntreeNames.get(optionNumber-1) + " for $" + EntreePrices.get(optionNumber-1));
                System.out.println("\tIf you would like to confirm this selection - enter Y! If you would like to change the quantity of this selection - enter C!");
                String decidingValue = scan5.nextLine();
                
                if (decidingValue.equalsIgnoreCase("c"))
                {
                    System.out.println("\t\t\t\t                           How many would you like?     ");
                    int number = scan6.nextInt();
                    quantity = number;
                    totalBill += (quantity*EntreePrices.get(optionNumber-1));
                    System.out.println("\t\t\t\tWould you like anything else from entrees? If so, enter Y! If not, enter N!     ");
                    String decider4 = scan7.nextLine();
                    if (decider4.equalsIgnoreCase("y"))
                        m=0;
                    else
                        m=1;
                        dessertChoose = "n";
                }
                if (decidingValue.equalsIgnoreCase("y"))
                {
                    totalBill += EntreePrices.get(optionNumber-1);
                    System.out.println("\t\t\t\tWould you like anything else from entrees? If so, enter Y! If not, enter N!     ");
                    String decider2 = scan8.nextLine();
                    if (decider2.equalsIgnoreCase("y"))
                        m=0;
                    else
                        m=1;
                        dessertChoose = "n";
                }
            }    
        }         
    }
}
             if (dessertChoose.equalsIgnoreCase("n") || entreeChoose.equalsIgnoreCase("n"))
            {
            System.out.println("\t\t\t\t          Would you like to move on to the Dessert Menu? Y or N?           ");
            entreeChoose = scan3.nextLine();
            int v = 0;
            if (entreeChoose.equalsIgnoreCase("y"))
        {
            while (v==0){
       
                System.out.println("\t\t\t\t                               DESSERT MENU                           ");
                for (int i=0; i<DessertPrices.size(); i++)
                {
                    System.out.println("\t\t\t\t           " + (i+1) + ". $ " + DessertPrices.get(i) + " ------------------ " + DessertNames.get(i));
                }
                System.out.println();
                System.out.println("\t\t\t\t     Which item would you like? Enter the # of the selection below!"      );
                int newOptionNumber = scan11.nextInt();
                System.out.println("\t\t\t\t        Great! You have chosen " + DessertNames.get(newOptionNumber-1) + " for $" + DessertPrices.get(newOptionNumber-1));
                System.out.println("\tIf you would like to confirm this selection - enter Y! If you would like to change the quantity of this selection - enter C!");
                String decidingValue3 = scan12.nextLine();
                
                if (decidingValue3.equalsIgnoreCase("c"))
                {
                    System.out.println("\t\t\t\t                           How many would you like?     ");
                    int number2 = scan13.nextInt();
                    quantity = number2;
                    totalBill += (quantity*DessertPrices.get(newOptionNumber-1));
                    System.out.println("\t\t\t\tWould you like anything else from desserts? If so, enter Y! If not, enter N!     ");
                    String decider2 = scan14.nextLine();
                    if (decider2.equalsIgnoreCase("y"))
                        v=0;
                    else
                        v=1;;
                }
                if (decidingValue3.equalsIgnoreCase("y"))
                {
                    totalBill += DessertPrices.get(newOptionNumber-1);
                    System.out.println("\t\t\t\tWould you like anything else from desserts? If so, enter Y! If not, enter N!     ");
                    String decider2 = scan15.nextLine();
                    if (decider2.equalsIgnoreCase("y"))
                        v=0;
                    else
                        v=1;
                }
            }    
        }         
    }
             System.out.println("\t\t\t\t\t\t\tYour Total Bill is: $" + totalBill);
             System.out.println("\t\tWould you like to include a tip? Your options are as follows.... Enter a corresponding # option 1-5");
             System.out.println("\t\t\t\t\t\t\t\t1. 0% Tip \n\t\t\t\t\t\t\t\t2. 10% Tip \n\t\t\t\t\t\t\t\t3. 15% Tip \n\t\t\t\t\t\t\t\t4. 20% Tip \n\t\t\t\t\t\t\t\t5. Custom");
             int newTip = scan16.nextInt();
             double finalBill = (double)(totalBill);
             if (newTip == 1)
                 finalBill+= (double)(totalBill*0);
             if (newTip == 2)
                 finalBill+= (double)(totalBill*0.1);
             if (newTip == 3)
                 finalBill+= (double)(totalBill*0.15);
             if (newTip == 4)
                 finalBill+= (double)(totalBill*0.2);
             if (newTip == 5)
                 
             {
                 System.out.println("\t\t\t\t\t\tEnter your custom tip as a Dollar Amount! $");
                 double bonusTip = scan17.nextDouble();
                 finalBill += bonusTip;
             }
             System.out.println("\t\t\t\t\t\t\tYour final bill is $" + finalBill);
             System.out.println("\t\t\tThank you for dining with us!! Have a great rest of your day! Hope to see you soon.");
             
}   
}