//programa que mezcla double e int
//y distintos operadores matemáticos

  public class Aritmetica {
    public static void main(String[] arg){
      int a = 10;
      double b = 3;
      System.out.println("Valor de a: "+a+" valor de b: "+b);
      a -= b; // a = a - b;
      System.out.println("Valor de a: "+a+" valor de b: "+b);
      //reseteamos valore:
      a = 10; b = 3.9999;
      a += b; // a = a + b 
      System.out.println("Valor de a: "+a+" valor de b: "+b);
      //reseteamos valores
      a = 2; b = 15;
      b /= a; // b = b / a;
      System.out.println("Valor de a: "+a+" valor de b: "+b);
    }
  }
