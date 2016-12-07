//programa para probar el funcionamiento
//del incremento y decremento
//en sus versiones pre y posfija
  public class Acumulador {
    public static void main(String[] args){
	int variable = 0; //declaramos e inicializamos
	System.out.println(++variable); //nos da 1
	int otraVariable = 0;
	System.out.println(otraVariable++);//nos da 0
	System.out.println(otraVariable); //nos da 1
    }
}

