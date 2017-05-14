
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AOUGASSA VIGNO
 */
public class ConverBinaire {
     public static void main(String[] args) {
        int y=0;
        int q;
int r;
int  i=1;
        Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir un nombre positif:");
int n = sc.nextInt();
System.out.println("Voici l'equivalance de "+n+" en binaire:");
while(n!=0){
        q=n/2;
        r=n%2;
        y= y + r*i;
        i=i*10;
        n=q;
}
System.out.print(y);
    }
    
}


