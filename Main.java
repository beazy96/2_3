import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] tab = new int[10];
    int suma = 0;
 		for (int i = 0; i < 10; i++)
      {
      int min = 0;
      int max = 100;
        
      
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      tab[i] = random_int;
      }
    for (int i = 0; i < 10; i++)
      {
      suma = suma + tab[i];
      }
    System.out.println("srednia to:"); 
    System.out.println(suma/10); 
  }
}