  public class Ejercicio2 {
    public static void main(String[] arg) {
	int    a = 1;
	double b = 1.0;
	
	{
	  a = 46 / 9;
	  System.out.println( "Valor de a: " + a + " valor de b: " + b );
	
	}
	{
	  a = 46 % 9 + 4 * 4 - 2;
          System.out.println( "Valor de a: " + a + " valor de b: " + b );

	}
	{
	  a = 45 + 43 % 5 * (23 * 3 % 2);
          System.out.println( "Valor de a: " + a + " valor de b: " + b );
	}
	{
	  a = 1; //reseteamos el valor de a
	  a %= 3 / a + 3;
          System.out.println( "Valor de a: " + a + " valor de b: " + b );
	}
	{
	  b = 4 + b * b + 4;
          System.out.println( "Valor de a: " + a + " valor de b: " + b );
	}
	{
	  a = 1; b = 1.0; //reseteamos el valor de b
	  b += 1.5 * 3 + (++a);
          System.out.println( "Valor de a: " + a + " valor de b: " + b );
	}
	{
	  a = 1; b = 1.0; //reseteamos el valor de b
	  b += 1.5 * 3 + (a++);
          System.out.println( "Valor de a: " + a + " valor de b: " + b );
	}
	{
	  a = 1; b = 1.0; //reseteamos el valor de b
   	  b -= 1.5 * 3 + a++;
          System.out.println( "Valor de a: " + a + " valor de b: " + b );
	}

	System.out.println( "Valor de a: " + a + " valor de b: " + b );
    }
  }
