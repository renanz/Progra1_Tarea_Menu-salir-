import java.util.Scanner;

public class WhileTest {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);
		boolean continuar=false;
		boolean exit=true;
		int menu=0;

		do{ 
			do {
				System.out.println ("\nIngrese el primer valor");
				int valor1 = lea.nextInt();
				System.out.println ("Ingrese el segundo valor");
				int valor2 = lea.nextInt();
				System.out.println ("\n------------");
				
				System.out.println ("Seleccione su opcion: ");
				System.out.println ("1. Sumar");
				System.out.println ("2. Restar");
				System.out.println ("3. Multiplicar");
				System.out.println ("4. Dividir");
				System.out.println ("5. Cambiar valores");
				System.out.println ("6. Exit");
				menu = lea.nextInt();
				if (menu<5) 
					System.out.print ("\n\nResultado = ");
				if (menu==6)
					exit=false;

				switch (menu){
					case 1: System.out.print (valor1+valor2); 
					break;
					case 2: System.out.print (valor1-valor2);
					break;
					case 3: System.out.print (valor1*valor2);
					break;
					case 4: System.out.print (valor1/valor2);
					break;
					case 5: break;
					default: break;
				}
			}while (menu==5);
			
			if (exit==false){
				continuar=false;
			}
			else{
				System.out.println ("\n------------");
				System.out.println ("Intentar de nuevo y/n");
				char varChar = lea.next().charAt(0);
				continuar=false;
				if (varChar == 'Y'||varChar == 'y'){
					continuar=true;
				}
				System.out.println ("\n------------");
			}
							
		}while (continuar==true);	
		
		//Renan Zelaya
	} 
}