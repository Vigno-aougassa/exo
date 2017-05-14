
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
public class Impair {
   

/**
 *
 * @author AOUGASSA VIGNO
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir un nombre positif :");
int n = sc.nextInt();

        if( n==0||n==1){
        System.out.println("il n'ya pas de nombre impair strictement inferieur a:"+n);
    }else{
            System.out.println("Voici le(s) nombre(s) impair(s) strictement(s) inferieur(s) a:"+ n);
            for (int i=1; i<n; i++){

       
    if(i%2!=0)
        System.out.println(i);
            }
//MOI C'EST AOUGASSA VIGNO MATRICULE 15A080FS
    }
    
    
    }
}


