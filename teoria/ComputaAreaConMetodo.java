  public class ComputaAreaConMetodo{
    public static final double PI = 3.14; //visible en todo el código
    public static void main(String[] arg){
	//código del método main
	//hacemos la llamada al método:
	double area = calcularAreaCirculo(2.5);
	System.out.println("El area vale: " + area);
	System.out.println("El area vale: " + calcularAreaCirculo(5.7));
	imprimirAreaCirculo(8.8);
	String resultado = devolverAreaCirculo(7.1);
	System.out.println(resultado);
        
    }
    public static double calcularAreaCirculo(double radio){
	//código del método calcularAreaCirculo
	return  radio * radio * PI;
    }
    public static void imprimirAreaCirculo(double radio) {
	//código del segundo métod
	System.out.println("El area vale: " + radio * radio * PI);
    } 
    public static String devolverAreaCirculo(double radio) {
	return "El cálculo del area del circulo de radio " + radio 
		+ " vale " + calcularAreaCirculo(radio); 
    }
  }
