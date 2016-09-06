
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
        int opcion = 0; //aqui se fuardara la opcion del usuario
            
        while(opcion < 1 && opcion > 4){
            // menu del programa
            System.out.println ("\nBienvenidos\n"); 
            System.out.println ("1.HashSet");
            System.out.println ("2.Treeset");
            System.out.println ("3.LinkedHashSet");
            System.out.println ("4.SALIR");
            System.out.println ("Por favor introduzca una opcion preferida (1,2,3,4): ");
               
            // solicitamos al usuario que ingres una opcion
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
        
        int nUsuarios = 0; 
        System.out.println ("\nAhora agregaremos usuarios"); 
        while (nUsuarios <= 0){
            System.out.println ("¿Cuatos usuarios desea agregar?: "); 
            Scanner ingreso = new Scanner (System.in); 
            nUsuarios = ingreso.nextInt();        
        }
        
        int contador = 0;
        String nombre;
        String java;
        String web;
        String cel;
        while (nUsuarios > 0){
            System.out.println ("\nIngrese el nombre del usuario " +(contador+1)+" : "); 
            Scanner ingreso = new Scanner (System.in); 
            nombre = ingreso.next();
            
            System.out.println (nombre+" es desarrollador Java?: (y/n) ");
            java = ingreso.next().toUpperCase();
            System.out.println (nombre+" es desarrollador Web?: (y/n) ");
            web = ingreso.next().toUpperCase();
            System.out.println (nombre+" es desarrollador de Celulares?: (y/n) ");
            cel = ingreso.next().toUpperCase();
            
            if (java.equals("Y")){
                desJava.add(nombre);}
            if (web.equals("Y")){
                desWeb.add(nombre);}
            if (cel.equals("Y")){
                desCel.add(nombre);}
            
            nUsuarios -= 1;
            contador +=1;
            
        }
        
        
        
        
                
    }
}
    
   
    

