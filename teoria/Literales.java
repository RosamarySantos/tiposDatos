	public class Literales {
	  public static void main(String[] arg) {
		//declaración variables y asignación de literales
		//tipo boolean
		boolean variableBoolean = false;
		System.out.println("variable de tipo boolean: "
			 		+ variableBoolean);
		//boolean otraVariableBoolean = "true" no funciona
		//porque "true" es un literal de tipo cadena (String)
	        //tipo byte
		byte variableByte = -120;
		System.out.println("variable de tipo byte: " +
			 variableByte);
		//variableByte = -130; error en tiempo de compilación, no puede sobrepasar -127
		//tipo short
		short variableShort = 32_000;
		System.out.println("variable de tipo short: " +
			 variableShort);
		//short otraVariableShort = 32_000_000; sobrepasamos el valor máximo
		//tipo int
		int variableInt = 32_000;		
		System.out.println("variable de tipo int: " +
			 variableInt);
		//int otraVariableInt = 3_000_000_000; //sobrepasamos
		//int otraVariableInt = 320l; tampoco funcina
		//tipo long
		long variableLong = 32_000;
		System.out.println("variable de tipo long: " +
			 variableLong);
		/*long otraVariableLong = 3e6; //sería 3_000_000
		no compila, la notación científica implica que 
		el literal sea double*/
		long otraVariableLong = 3_000_000_000l; //necesario l
		//o entendería que 3_000_000_000 es un literal int
		//sobrepasa el límite valor
		System.out.println("variable de tipo long: " +
			 otraVariableLong);


	  }
	}
