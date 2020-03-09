package tema6Ejercicio1;

import java.util.Arrays;

import ejercicio1.Consola;

public class OpArray {

	private int[] array;

	public OpArray() {
		
		array=new int[5];
	}
	
	public void cargarArray() {
		int posiciones=0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Numero "+ (i)+ " :");
			array[i]=Consola.leeInt();
			posiciones++;
			if(array[i]==0)
				break;
		}
		
	}
	
	
	public String toString() {
		String str = "";
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			aux=array[i];
			str=str+String.valueOf(aux);
		}

		return str;
	}

	public void ver() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+ " ");
		}
		System.out.println();
	}
	
	public void sustituir(int numero) {
		int numSustituto;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==numero) {
				System.out.println("Introduce numero a sustituir");
				numSustituto=Consola.leeInt();
				array[i]=numSustituto;
			}
		}
	}
	
	public int indicePrimo() {
		int aux=0;
		for (int i = 0; i < array.length; i++) {
			if(esPrimo(array[i])) {
				aux=array[i];
				break;
			}else {
				aux=-1;
			}
		}
		return aux;
		
	}
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	
	public static void main(String[] args) {
		OpArray o1= new OpArray();
		o1.cargarArray();
		o1.ver();
		System.out.println("toString: "+o1.toString());
		o1.sustituir(7);
		o1.ver();
		System.out.println(o1.indicePrimo());
	}
}
