
package cointoss;

import java.util.Scanner;
public class CoinToss {

    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in); 
int heads = 0; 
int tails = 0; 
System.out.println("For each coin toss enter either h for heads or t for tails."); 
for(int i = 1; i <= 8; i++) 
{ 
String numEnding = "th"; 
if(i == 1) 
{ 
numEnding = "st"; 
} 
else if(i == 2) 
{ 
numEnding = "nd"; 
} 
else if(i == 3) 
{ 
numEnding = "rd"; 
} 
System.out.println(i + numEnding + " toss:"); 
String type = keyboard.next(); 
if(type.equals("h")) 
{ 
heads++; 
} 
else 
{ 
tails++; 
} 
} 
System.out.println("Number of heads: " + heads + " (" + (((double)heads / 8.0) * 100) + "%)"); 
System.out.println("Number of tails: " + tails + " (" + (((double)tails / 8.0) * 100) + "%)");
    }
    
}
