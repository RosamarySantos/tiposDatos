	/*programa que calcula el 
	valor del área de un círculo
	dado su radio */
	public class ComputaArea {
	  public static void main(String[] args){
	    //declaramos las variables
	    //de tipo double pues son decimales
	    double radio;
	    double area; //usamos nombre legibles
	    //damos valor a la variable radio:
	    radio = 5.7;
	    //realizamos el cálculo
	    area = radio * radio * 3.14;
	    System.out.print("El área del circulo de radio ");
	    System.out.print(radio);
	    System.out.print(" es ");
	    System.out.print(area);
	    System.out.print("\n"); //salto de línea
	  }
	}
