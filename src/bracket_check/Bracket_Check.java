package bracket_check;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author todyerutz@plainintricacy.wordpress.com;
 * 
 */
public class Bracket_Check {
    
    public static ArrayList<Character> BrkList = new ArrayList<Character>();
    public static String str = "([{<)]}>";
    public static char[] brackets = str.toCharArray();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your code:");
        String in = input.nextLine();
        input.close();
        System.out.println(BrkCheck(in));
        
    }
    
    public static boolean BrkCheck(String q){
        boolean check;
        for(int i=0; i<q.length(); i++){
            if(isBrk(q.charAt(i))){
                BrkList.add(q.charAt(i));
            }
        }
        if(BrkList.isEmpty()==false){
            if(BrkList.size()%2==1){
                return false;
            }else{
                int i=0;
                do{
                    check=false;
                    for(int j=i+1; j<BrkList.size(); j++){
                        if(BrkType(BrkList.get(i))+4==BrkList.get(j)){
                            check=true;
                        }
                    }
                    i++;
                }while(i<BrkList.size()&&check==true);
                return check;
            }
        }else{
            return false;
        }
    }
    
    public static boolean isBrk(Character x){
        for(int i=0; i<brackets.length; i++){
            if(brackets[i]==x){
                return true;
            }
        }
        return false;        
    }
    
    public static int BrkType(char q){
        for(int i=0; i<brackets.length; i++){
            if(q==brackets[i]){
                return i;
            }
        }
        return -1;
    }
}
