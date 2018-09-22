package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false, isVacation = false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
         int isWeekday1 = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        
        int isVacation1 = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        
        if (isWeekday1 == 0)
        {isWeekday = true;
        	}
        
        if (isWeekday1 == 1)
        {isWeekday = false;}
        
        if(isVacation1 == 1)
        {isVacation = false;}
        
        if(isVacation1 == 0)
        {isVacation = true;}
        
        	if(isWeekday == true)       
        	{JOptionPane.showMessageDialog(null, "sleep in�?");}
        	
        	if(isVacation == true)
        	{JOptionPane.showMessageDialog(null, "get up lazybones!�?");}
        	
        	if(isWeekday == false)
        	{JOptionPane.showMessageDialog(null, "get up lazybones!�?");}
        	
        	
        	if(isVacation == false)
        	{JOptionPane.showMessageDialog(null, "get up lazybones!�?");}
        	
        
        	
        	
        	}

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }

