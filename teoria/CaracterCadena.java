  public class CaracterCadena{
    public static void main(String[] arg){
	//declaramos cadenas: ambas son objetos
	String cadena1 = "esto es una cadena ";
	String cadena2 = new String("esto es otra cadena");
	//mostramos en pantalla usando la concatenación (+)
	System.out.println(cadena1 + cadena2);
	//declaramos tipos char: son tipos primitivos
	char caracter1 = 'a';
	char caracter2 = 'Z';
	char caracter3 = '1';
	char caracter4 = '$';
	System.out.println(caracter1+caracter2+caracter3+caracter4);
	//forzamos la conversión a cadena
	System.out.println(""+caracter1+caracter2+caracter3+caracter4);
	//cadenas con caracteres especiales "\
	String cadena3 = "hola \"entre comillas\" hola";
	System.out.println(cadena3);
	String cadena4 = "hola usando caracter especial \\ hola";
	System.out.println(cadena4);
	String cadena5 = "usando comillas simples 'algo' hola";
	System.out.println(cadena5);
	//imprimir caracteres de unicode
	char copyright = '\u00A9';
	System.out.println(copyright+" de quien sea");
	String cadena6 = "Valor de un medio \u00BD, valor de "+	
			  "un cuarto \u00BC y tres cuartos \u00BE";
	System.out.println(cadena6);	
	System.out.println("el precio es 5€");			












	
    }
  }
