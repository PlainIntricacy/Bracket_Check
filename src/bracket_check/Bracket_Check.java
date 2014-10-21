/*
Code bracket checker.

Checks given input for proper code bracket etiquette.

A line of code is considered proper it obeys the following bracket order:

<{[()]}>

Returns true if all brackets are paired and ordered correctly, false if not.

Based on this reddit daily challenge:

http://goo.gl/eb12iW

*/

package bracket_check;
import java.util.Scanner;

/**
 *
 * @author todyerutz@plainintricacy.wordpress.com;
 * 
 */
public class Bracket_Check {
    
    public static String brk = "<{[()]}>";
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your code:");
        String in = input.nextLine();
        input.close();
        System.out.println(CheckBrk(getBrk(in)).isEmpty());
        
    }
    
    public static String getBrk(String q){
        String x="";
        for(int i=0; i<q.length(); i++){
            for(int j=0; j<brk.length(); j++){
                if(q.substring(i, i+1).equals(brk.substring(j, j+1))){
                    x+=q.substring(i, i+1);
                }
            }
        }
        return x;
    }
    
    public static String CheckBrk(String q){
        return q.replace("()", "").replace("[]", "").replace("{}", "").replace("<>", "");
    }
    
}
