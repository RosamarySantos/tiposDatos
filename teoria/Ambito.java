  public class Ambito {
   static int variableClase = 1;
   //System.out.println( variableClase + "," + variableLocal + "," +
   //			variableBloque1 + "," + variableBloque2 );		
   //debe estar dentro del main
   public static void main(String[] args){
     int variableLocal = 2;
     //System.out.println( variableClase + "," + variableLocal + "," +
     //			variableBloque1 + "," + variableBloque2 );		
     System.out.println( variableClase + "," + variableLocal );
     {
	int variableBloque1 = 3;
     //System.out.println( variableClase + "," + variableLocal + "," +
     //			variableBloque1 + "," + variableBloque2 );		
     System.out.println( variableClase + "," + variableLocal + "," +
			variableBloque1 );
     	{
	  int variableBloque2 = 4;
          System.out.println( variableClase + "," + variableLocal + "," +
     			variableBloque1 + "," + variableBloque2 );		
	}
     System.out.println( variableClase + "," + variableLocal + "," +
     			variableBloque1 + "," + variableBloque2 );		
     }
   }
  } 	
