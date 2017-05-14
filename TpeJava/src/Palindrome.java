/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AOUGASSA VIGNO
 */

    import static java.sql.DriverManager.println;
import java.util.Scanner;

/**
 *
 * @author AOUGASSA VIGNO
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str, mot_inverse="";
          Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir un mot :");
 str = sc.nextLine();
 if(palindrome(str))
     System.out.println("'"+str+"'est un palindrome");
 else
     System.out.println("'"+str+"' n'est pas un palindrome");
 
    }
    
        public static boolean palindrome(String str){
        int i=0;
        
int longueur=str.length()-1;
boolean egale=true;
while(i<longueur/2 && egale){
if(str.charAt(i)==str.charAt(longueur-i)){
    egale=true;
}else{egale=false;
i++;
}
}
return egale;
}
}
        
    


