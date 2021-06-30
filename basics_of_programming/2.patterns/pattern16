
/*

1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	

*/

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     
     int n2=(n*2)-1;     // number of columns
     int val=1;
     int start=1;        // to know where we want to print val initialize start and end
     int end=(n*2)-1;  
     
     for(int i=1;i<=n;i++){
         val=1; 
         
         for(int j=1;j<=n2;j++){          // outer loop for rows
             if(j<=start || j>=end){      // only print values at this places
             System.out.print(val+"\t");
             }
             else{
                 System.out.print("\t");  // else print blank
             }
             if(j<n){                    // condition where to increase val and decrease val
                 val++;
             }
             else{
                 val--;
             }
         }
         start++;                         // inc start and dec end to get o/p
         end--;
         System.out.println();            // to get new line after one row
         
     }

 }
}




