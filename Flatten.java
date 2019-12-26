/*
 * This Java application "flattens" a 2d-array
 * into a 1d-array.  
 *
 * @creator John Cody
 * @created 02019.02.03
 */

package Flatten;

public class Flatten {
   public static void main(String[] argv) {

      int[][] x = {
         { },
         { 1, },
         { 1, 2, },
         { 1, 2, 3, },
         { 1, 2, 3, 4, },
         { 1, 2, 3, 4, 5, },
         { 1, 2, 3, 4, 5, 6, },
      };
      print(flatten(x));

      String[][] y = {
         { "if", "else", "switch", }, 
         { "while", "do while", "for", },
         { "break", "continue", },
         { "*", "/", "%", "+", "-", },
         { ">", ">=", "<=", "<", "==", "!=", },
         { "&&", "||", "!", },
         { "<<", ">>", ">>>", "&", "|", "^", "~", },
      };
      print(flatten(y));
   }

   /**
    * Prints a "flattened" 1d-array of ints.
    *
    * @param a the flattened array to print
    */
   static void print(int[] a) {
      for (int i = 0; i < a.length; i++) {
         System.out.print("{ ");
         for (int j = 0, k = a[i]; j < k; j++)
            System.out.print(a[++i] + ", ");
         System.out.println("}");
      }
   }

   /**
    * Prints a "flattened" 1d-array of String objects.
    *
    * @param a the flattened array to print
    */
   static void print(String[] a) {
      for (int i = 0; i < a.length; i++) {
         System.out.print("{ ");
         for (int j = 0, k = Integer.parseInt(a[i]); j < k; j++)
            System.out.print("\"" + a[++i] + "\", ");
         System.out.println("}");
      }
   }

   static int[] flatten(int[][] x) {
       int k = 0;
       
       for(int i = 0; i < x.length; i++) {
           k += x[i].length + 1;
       }
       
       int flat[] = new int[k];
       k = 0;
       
       for(int i = 0; i < x.length; i++) {
           flat[k++] = x[i].length;
           for(int j = 0; j < x[i].length; j++) {
               flat[k++] = x[i][j]; 
           }
       }
       
       return flat;
   }

   static String[] flatten(String[][] x) {
       int k = 0;
       
       for(int i = 0; i < x.length; i++) {
           k += x[i].length + 1;
       }
       
       String flat[] = new String[k]; 
       k = 0;
       
       for(int i = 0; i < x.length; i++) {
           flat[k++] = Integer.toString(x[i].length);
           for(int j = 0; j < x[i].length; j++) {
               flat[k++] = x[i][j]; 
           }
       }
       
       return flat;
   }
}