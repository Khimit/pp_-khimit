/*

*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

*/

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    int star = (n + 1) / 2;
    int sp = 1;
    
    for (int i = 1; i <= n; i++) {
      
      for (int j = 1; j <= star; j++) {
        System.out.print("*\t");
      }
      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= star; j++) {
        System.out.print("*\t");
      }
      //upgrade for first half and second half
      System.out.println();
      if (i <= n / 2) {
        star--;
        sp += 2;
      }
      else {
        star++;
        sp -= 2;
      }

    }

  }
}
