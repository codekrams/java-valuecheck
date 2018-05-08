
package arraykleinerfuenf;

import java.util.Random;


public class ArrayKleinerFuenf {
     public static void main(String[] args) {
    
    int [] zufall = new int[10];
    
    for (int i=0; i<10; i++){
            Random rand = new Random();
            zufall[i] = rand.nextInt(10)+1;
        }
    
    int ausgabe = 0;
    System.out.print("In diesem Array sind die folgenden Zahlen kleiner als 5: ");
         System.out.println();
         
    for (int j=0; j<5; j++){
        if(zufall[j]<5) {
        ausgabe = zufall[j];
            System.out.print(ausgabe + " ");
        }
    }
         System.out.println();
    }
}
