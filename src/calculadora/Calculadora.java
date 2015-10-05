
package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Calculadora {

    public static void main(String[] args) {
        
              Scanner opcion = new Scanner(System.in) ;
              
       
       int num , numerouno,  numerodos , nummayor  ; 
        String op ;
      
       
    do {    
        
     
        System.out.println("Menu");  
        System.out.println("sumar 2 numeros ..................1");  
        System.out.println("restar 2 numeros..................2");  
        System.out.println("multiplicar 2 numeros.............3 ");  
        System.out.println("dividir  2 numeros................4");
        System.out.println("calcular el  mayor de 2 numeros ..5");
        System.out.println("Calcular porcentaje de un numero..6");
        System.out.println("salir.............................0");
       try {    
        System.out.println("Que desea hacer ? (0-5)");
                  op = opcion.next();   
                  
                  
            num=Integer.parseInt(op);
       }  catch (RuntimeException e) {
            System.out.println("Ingrese un numero entero");
             op = opcion.next();   
             num=Integer.parseInt(op);
       } 
           switch ( num ) {
	
        case 1:
       
            try {
            System.out.println("Ingrese Primer numero");
                   numerouno = opcion.nextInt() ;
                  
         
                   System.out.println("Ingrese segundo numero");
                  numerodos = opcion.nextInt() ;
         
                  
            int suma = numerouno+numerodos; 
            System.out.println("LA suma de 2 numeros es " + suma);
        
            } catch(InputMismatchException e) {
            System.out.println("Ingrese un numero entero valido ");
       } 
           
            
 
            
            break;
        case 2:
            try {
                
            
            System.out.println("Ingrese Primer numero");
                   numerouno = opcion.nextInt() ;
                  
         
                   System.out.println("Ingrese segundo numero");
                  numerodos = opcion.nextInt() ;
               int resta = numerouno-numerodos ; 
            System.out.println("La resta de 2 numero es " + resta); 
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un numero entero");
       }
            break;
        case 3:
            try {
                
            
                   System.out.println("Ingrese Primer numero");
                   numerouno = opcion.nextInt() ;
                          
                   System.out.println("Ingrese segundo numero ");
                  numerodos = opcion.nextInt() ;
               int multiplicacion  = numerouno*numerodos ; 
            System.out.println("La multiplicacion  de 2 numero es " + multiplicacion); 
	} catch (InputMismatchException e) {
            System.out.println("Ingrese un numero entero");
        }
            break;
	case 4:
	           try { System.out.println("Ingrese Primer numero(Nominador)");
                  numerouno = opcion.nextInt() ;
                  
         
                   System.out.println("Ingrese segundo numero(denominador");
                  numerodos = opcion.nextInt();
            double division = numerouno/numerodos ; 
            System.out.println("La division de 2 numero es " + division); 
                
            } catch (ArithmeticException e) {
                       System.out.println("Ingrese denominador distinto de 0 ");
                       
                 
            } catch (InputMismatchException e) {
            System.out.println("Ingrese un numero entero");
       }
                
	 break; 
         
        
        case 5 :   
            try {
                
            
            System.out.println("Ingrese Primer numero");
                   numerouno = opcion.nextInt() ;
                  
         
                   System.out.println("Ingrese segundo numero");
                  numerodos = opcion.nextInt() ;
            if  (numerouno>numerodos) {
                   
                  nummayor = numerouno ; 
                   
                  
                  System.out.println("El numero mayor es " + nummayor );
                
              } else {
                  nummayor=numerodos ;
                   System.out.println("El numero mayor es " + nummayor );
                  }
            }  catch (InputMismatchException e) {
            System.out.println("Ingrese un numero entero");
       }
            break;
        case 6 :   
            try {
                
            
            System.out.println("Ingrese  numero para sacar porcentaje");
                  int num1 = opcion.nextInt() ;
                  
         
                   System.out.println("ingrese porcentaje que "
                           + "desea sacar");
                   int numporcentaje= opcion.nextInt() ;
           
            int porcentaje = (num1*numporcentaje)/100 ;  
           
            System.out.println(" el " + numporcentaje + " % de " + num1 + " es : "
                    + "" + porcentaje);
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un numero entero");
       }
        break;
        case 0 :   
          
            System.out.println("Hasta luego..");
           
          break;
            
        default:
            
            
          System.out.println("ingrese opcion valida (0-5)");
        
          break;
}

      
        } while (num>=5 || num!=0 ) ; 
        
   
                
                
      
       
            
}
}