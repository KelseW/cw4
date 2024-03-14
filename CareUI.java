package guis;

import java.util.*;
/**
 * Write a description of class CareUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CareUI
{
    // instance variables - replace the example below with your own
    private Scanner reader = new Scanner(System.in);
    private CARE vizier = new Actor("Vizier");

    private void runUI()
    {
        int choice = getOption();
        while (choice != 0)
        {
            if      (choice == 1){payEntry();}
            else if (choice == 2){payEnemy();}
            else if (choice == 3){retireChampion();}
            choice = getOption();
        }
    }
    
    private int getOption()
    {
        System.out.println("What would you like to do?");
        System.out.println("0. Quit");
        System.out.println("1. Pay entry fee for a team member");
        System.out.println("2. Pay reward to enemy");
        System.out.println("3. Retire a champion");
        
        System.out.println("Enter your choice");
        
        int option = reader.nextInt();
        reader.nextLine();
        return option;
    }
    
    private void payEntry()
    {
        System.out.println("Enter the team member ID you want to pay for:");
        int ww = reader.nextInt();
        System.out.println(vizier.payFee(ww));
    }
    
    private void payEnemy()
    {
        System.out.println("Enter the enemy ID you want to pay:");
        int ww = reader.nextInt();
        System.out.println(vizier.payGould(ww));
    }
    
    private void retireChampion()
    {
        System.out.println("Enter the champion ID you want to retire:");
        int ww = reader.nextInt();
        System.out.println(vizier.retirement(ww));
    }
    
    public static void main(String[] args)
    {
        CareUI xx = new CareUI();
        xx.runUI();
    }
}
