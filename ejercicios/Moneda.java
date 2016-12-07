  public class Moneda {
    //atributos
    private double cantidad;
    //constructor
    public Moneda(double cantidad){
	this.cantidad = cantidad;
    }
    //métodos para intercambiar € y $
    public double convertirAEuros(){
	return this.cantidad * 1.0897;
    }
    public double convertirADolares(){
	return this.cantidad * 0.917683766;
    }
    public static void main(String[] arg) {
	//int valor = 100;
	Moneda m1 = new Moneda(100);
	Moneda m2 = new Moneda(1000);
	System.out.println("100 € son: "+ m1.convertirADolares() +" $");
	System.out.println("1000 $ son: "+ m2.convertirAEuros() +" €");
	
    }
  }
