  public class AsignacionCompuesta{
   public static void main(String[] arg){
     //usamos variables de tipo int
     int a = 10;
     int b = 3;
     a += b; // a = a + b;  sumamos el contenido de "a" a "b" y
	     // lo guardamos en "a"
     System.out.println("Valor de a: "+a+", valor de b: "+b);
     //reseteamos el valor de a, para que tenga el valor inicial
     a = 10; 
     a %= b; //a = a % b hacemos el resto de división de "a" entre "b"
             //y lo guardamos en "a"
     System.out.println("Valor de a: "+a+", valor de b: "+b);
     //¿se puede hacer esto:? 
     //++a *= b; debe haber una variable a la izquierda, NO una 
     //expresión aritmética
     //reseteamos el valor de a, para que tenga el valor inicial
     a = 10;  
     a /= b++; 
     System.out.println("Valor de a: "+a+", valor de b: "+b);
     //reseteamos el valor de a, para que tenga el valor inicial
     a = 10; b = 3;
     a /= ++b; 
     System.out.println("Valor de a: "+a+", valor de b: "+b);
     
    }
  }
