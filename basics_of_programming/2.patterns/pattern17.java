/*
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	


*/


import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    
    int sp = n / 2;      // for spaces
    int star = 1;        // for stars

    for (int i = 1; i <= n; i++) {    // for rows
      for (int j = 1; j <= sp; j++) {   // for spaces
        System.out.print("\t");
      }
      for (int j = 1; j <= star; j++) {    // for stars
        if (j <= star / 2 && i != (n / 2) + 1) {     // print spaces till condition
          System.out.print("\t");
        }
        else {
          System.out.print("*\t");   // else stars print
        }
      }
      System.out.println();
      
      // update stars and spaces
      
      if (i <= n / 2) {
        sp--;
        star += 2;
      }
      else {
        sp++;
        star -= 2;
      }
    }

  }
}
