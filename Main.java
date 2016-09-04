
import java.util.Scanner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet; 

/**
 * Axel Mazariegos 131212
 * Julio Merida 15242
 * Gustavo Orellana 15073
 */
public class Main {
    
    public static void main(String[] args) {
        
        //conjuntos
        Set desJava; //conjunto de desarrolladores Java
        Set desWeb; //conjunto de desarrolladores Web
        Set desCel; //conjunto de desarrolladores Celulares
        
        FactorySET factory = new FactorySET();
        int opcion = 0; //aqui se guarda la opcion del usuario
            
        while(opcion < 1 && opcion > 4){
            // menu del programa
            System.out.println ("\nBienvenidos\n"); 
            System.out.println ("1.HashSet");
            System.out.println ("2.Treeset");
            System.out.println ("3.LinkedHashSet");
            System.out.println ("4.SALIR");
            System.out.println ("Por favor introduzca una opcion preferida (1,2,3,4): ");
               
            // solicitamos al usuario que ingrese una opcion
            Scanner ingreso = new Scanner (System.in); 
            opcion = ingreso.nextInt();
                
            if (opcion < 1 && opcion > 4){
                System.out.println ("\nERROR: Opcion incorrecta\n"); }  
        }
            
        String opcionSET;
            
        switch (opcion){
            case 1:
                opcionSET = "hashset";
                desJava = factory.ObtenerSET(opcionSET);
                desWeb = factory.ObtenerSET(opcionSET);
                desCel = factory.ObtenerSET(opcionSET);
                break;
            case 2:
                opcionSET = "treeset";
                desJava = factory.ObtenerSET(opcionSET);
                desWeb = factory.ObtenerSET(opcionSET);
                desCel = factory.ObtenerSET(opcionSET);
                break;
            case 3:
                opcionSET = "linkedhashset";
                desJava = factory.ObtenerSET(opcionSET);
                desWeb = factory.ObtenerSET(opcionSET);
                desCel = factory.ObtenerSET(opcionSET);
                break;
            case 4:
                System.out.println ("\nAdios :)\n"); 
                System.exit(0);
                break;    
        }
        
        
        
        while(opcion < 1 && opcion > 4){
            // siguiente menu de opciones
            System.out.println ("\nAgregamos usuarios:"); 
            System.out.println ("1.Desarolladores Java");
            System.out.println ("2.Desarrolladores Web");
            System.out.println ("3.Desarrolladores Celulares");
            System.out.println ("4.TERMINAR EL INGRESO");
            System.out.println ("Por favor introduzca una opcion preferida (1,2,3,4): ");
            
            Scanner ingreso = new Scanner (System.in); 
            opcion = ingreso.nextInt();
                
            if (opcion < 1 && opcion > 4){
                System.out.println ("\nERROR: Opcion incorrecta\n"); }  
        }
                
    }
}
    
   
    
