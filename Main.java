import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    char znak;
    double rand=Math.random();
    //System.out.println(znak);
  //  char[] slowo={'A','d','a','m'};
   double tablica[]=new double[10];
    for(int i=0;i<10;i++)
      {
       // System.out.println("Podaj kolejna liczbe: ");
    tablica[i]=Math.random()*100;
      }
    for(int i=0;i<10;i++)
      {
        System.out.println(tablica[i]);
      }
    double suma=0;
      for(int i=0;i<10;i++)
      {
        suma=suma+tablica[i];
      }
    double srednia=suma/tablica.length;
    System.out.println("Srednia z podanych liczb wynosi: "+srednia);
  }
  
}