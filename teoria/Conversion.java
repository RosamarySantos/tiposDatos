  public class Conversion {
    public static void main (String[] arg) { 
	//definimos tipos int, long
	int   tipoInt = 2;
	long tipoLong = 1_123;
	tipoInt *= tipoLong; // multiplicamos tipoInt por tipoLong
	// y lo almacenamos en tipoInt
	System.out.println("Valor de la operación: " + tipoInt);
	tipoLong = 3_000_000_000L;
	tipoInt *= tipoLong;
	//el valor obtenido no es verdadero
	System.out.println("Valor de la operación: " + tipoInt);
	//introducimos valores de tipo double
	tipoInt = 2; //reseteamos al valor inicial
	double tipoDouble = 2.5e6; //2_500_000
	tipoDouble /= tipoInt;
	System.out.println("Valor de la operación: " + tipoDouble);
	tipoDouble = 2.5e6; //reseteamos al valor inicial
	tipoInt += tipoDouble;
	System.out.println("Valor de la operación: " + tipoInt);

	
    }
  }
