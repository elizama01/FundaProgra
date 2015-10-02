
package calculadora;

import java.util.Scanner;
import javax.swing.WindowConstants;


public class Calculadora {

    public static void main(String[] args) {
        
              Scanner opcion = new Scanner(System.in) ;
              
       
       int num;
        int numerouno ; 
        int numerodos ; 
        String op ;
        
    do {    
        
          
        System.out.println("Menu");  
        System.out.println("sumar 2 numeros ......1");  
        System.out.println("restar 2 numeros......2");  
        System.out.println("multiplicar 2 numeros.3 ");  
        System.out.println("dividir  2 numeros....4");
        System.out.println("salir.................0");
    
        System.out.println("Ingrese Primer numero");
                   numerouno = opcion.nextInt() ;
                  
         System.out.println("Ingrese segundo numero");
                  numerodos = opcion.nextInt() ;
        
        System.out.println("Que desea hacer ? (0-4)");
                  op = opcion.next();   
                 num=Integer.parseInt(op);
     
        
         
        
        
                 switch ( num ) {
	
        case 1:
	          
       int suma = numerouno+numerodos; 
            System.out.println("LA suma de 2 numeros es " + suma);
          break;
        case 2:
                  int resta = numerouno-numerodos ; 
            System.out.println("La resta de 2 numero es " + resta); 
        break;
        case 3:
            
             int multiplicacion  = numerouno*numerodos ; 
            System.out.println("La multiplicacion  de 2 numero es " + multiplicacion); 
	break;
	case 4:
	double division = numerouno/numerodos ; 
            System.out.println("La division de 2 numero es " + division); 
	 break; 
        case 0 :   
          System.out.println("Hasta luego..");
          
          break;
            
        default:
            
            
          System.out.println("ingrese opcion valida (0-4)");
        
          break;
}

        } while (num>=5 || num!=0 ) ; 
        
            
}
}