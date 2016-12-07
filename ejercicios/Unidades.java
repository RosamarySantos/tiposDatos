  /**Clase que nos permite la 
  * conversión de unidades
  * @author Manuel
  * @version 1.0 */  

  
  public class Unidades{
    /**método para convertir de libras a kilogramos
    * @param masa que es el valor a convertir
    * @return kilogramos de la masa */ 
    public static double deLibrasAKilogramo (double masa) {
	return masa * 0.45 ;
    }
    /**método para convertir de pias a metros
    * @param longitud que es el valor a convertir
    * @return metros de la longitud */ 
    public static double dePiesAMetros (double longitud) {
	return longitud * 0.3048;
    }
    /**método para convertir de galones a litros
    * @param volumen que es el valor a convertir
    * @return litros del volumen */ 
    public static double deGalonesALitros (double volumen){
	return volumen * 3.78;
    }

    public static void main (String[]  args) {
	int masa = 25;
	int longitud = 12;
	double volumen = 3.5;
	double convertirMasa = deLibrasAKilogramo (masa);
	double convertirLongitud = dePiesAMetros (longitud);
	double convertirVolumen = deGalonesALitros (volumen);
	System.out.println("Masa: " + masa + "kg, "+convertirMasa+" libras"); 
	System.out.println("Longitud: " + longitud + "m, "+convertirLongitud+" pies"); 
	System.out.println("Volumen: " + volumen + "l, "+convertirVolumen+" galones"); 
    }
  
  }
