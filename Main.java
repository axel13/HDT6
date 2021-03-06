
import java.util.Scanner;

import java.util.HashSet;
import java.util.Iterator;
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
        Set desJava = null; //conjunto de desarrolladores Java
        Set desWeb = null; //conjunto de desarrolladores Web
        Set desCel = null; //conjunto de desarrolladores Celulares
        
        FactorySET factory = new FactorySET();
        int opcion = 0; //aqui se fuardara la opcion del usuario
            
        while(opcion < 1 || opcion > 4){
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
                
            if (opcion < 1 || opcion > 4){
                System.out.println ("\nERROR: Opcion incorrecta\n"); }  
        }
            
        String opcionSET;
            
        switch (opcion){
            case 1:
                opcionSET = "hashset";
                desJava = factory.ObtenerSET(opcionSET);
                desWeb = factory.ObtenerSET(opcionSET);
                desCel = factory.ObtenerSET(opcionSET);
                System.out.println ("hashset"); 
                break;
            case 2:
                opcionSET = "treeset";
                desJava = factory.ObtenerSET(opcionSET);
                desWeb = factory.ObtenerSET(opcionSET);
                desCel = factory.ObtenerSET(opcionSET);
                System.out.println ("treeset"); 
                break;
            case 3:
                opcionSET = "linkedhashset";
                desJava = factory.ObtenerSET(opcionSET);
                desWeb = factory.ObtenerSET(opcionSET);
                desCel = factory.ObtenerSET(opcionSET);
                System.out.println ("linkedhashset"); 
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
        
        Iterator javaItr = desJava.iterator();
        Iterator webItr = desWeb.iterator();
        Iterator celItr = desCel.iterator();
        
        String nomJava;
        String nomWeb;
        String nomCel;
        
        System.out.println ("\nDesarrolladores Java: ");
        while (javaItr.hasNext()){
            nomJava = javaItr.next().toString();
            System.out.println(nomJava);
        }
        
        System.out.println ("\nDesarrolladores Web: ");
        while (webItr.hasNext()){
            nomWeb = webItr.next().toString();
            System.out.println(nomWeb);
        }
        
        System.out.println ("\nDesarrolladores Celulares: ");
        while (celItr.hasNext()){
            nomCel = celItr.next().toString();
            System.out.println(nomCel);    
        }
        
        
        System.out.println ("\nPreguntas: "); 
        System.out.println ("1. Desarrolladores con experiencia en Java, web y celulares : "); 
        
        javaItr = desJava.iterator();
        webItr = desWeb.iterator();
        celItr = desCel.iterator();
        
        while (javaItr.hasNext()){
            nomJava = javaItr.next().toString();
            while (webItr.hasNext()){
                nomWeb = webItr.next().toString();
                if (nomJava.equals(nomWeb)){
                    while (celItr.hasNext()){
                        nomCel = celItr.next().toString();
                        if (nomJava.equals(nomCel)){
                            System.out.println (nomCel); 
                        }    
                    }
                }
            }
        }
       
        System.out.println ("2. Desarrolladores con experiencia en Java pero que no tengan experiencia en web : "); 
        
        javaItr = desJava.iterator();
        webItr = desWeb.iterator();
        celItr = desCel.iterator();
        
        
        while (javaItr.hasNext()){
            nomJava = javaItr.next().toString();
            while (webItr.hasNext()){
                nomWeb = webItr.next().toString();
                if (nomJava.equals(nomWeb) == false){
                    System.out.println(nomJava);
                }
            }
        }
        
        System.out.println ("3. Desarrolladores con experiencia en Web y Celulares: ");
        
        javaItr = desJava.iterator();
        webItr = desWeb.iterator();
        celItr = desCel.iterator();
        
        while (webItr.hasNext()){
            nomWeb = webItr.next().toString();
            while (celItr.hasNext()){
                nomCel = celItr.next().toString();
                if (nomWeb.equals(nomCel)){
                    System.out.println(nomWeb);
                }
            }
        }
        
        System.out.println ("4. Desarrolladores con experiencia en Web o Celulares");
        
        javaItr = desJava.iterator();
        webItr = desWeb.iterator();
        celItr = desCel.iterator();
        
        while (webItr.hasNext()){
            nomWeb = webItr.next().toString();
            System.out.println(nomWeb);
        }
        while (celItr.hasNext()){
            nomCel = celItr.next().toString();
            System.out.println(nomCel);    
        }
        
        
        System.out.println ("5. Indicar SI o NO el conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web: ");
        
        javaItr = desJava.iterator();
        webItr = desWeb.iterator();
        celItr = desCel.iterator();
        
        while (javaItr.hasNext()){
            nomJava = javaItr.next().toString();
            while (webItr.hasNext()){
                nomWeb = webItr.next().toString();
                if (nomJava.equals(nomWeb)){
                    System.out.println("Si");
                }else{ 
                    System.out.println("No");}
            }
        }
        
        System.out.println ("6. El conjunto (Java, Web o Celulares) que tenga la cantidad más grande de desarrolladores: ");
        
        javaItr = desJava.iterator();
        webItr = desWeb.iterator();
        celItr = desCel.iterator();
        
        
        if (desJava.size() >= desWeb.size() && desJava.size() >= desCel.size()){
            System.out.println("Hay mas desarrolladores Java");
            while (javaItr.hasNext()){
                nomJava = javaItr.next().toString();
                System.out.println(nomJava);
            }
        }
        
        if (desWeb.size() >= desJava.size() && desWeb.size() >= desCel.size()){
            System.out.println("Hay mas desarrolladores Web");
            while (webItr.hasNext()){
                nomWeb = webItr.next().toString();
                System.out.println(nomWeb);
            }
        }
        
        if (desCel.size() >= desWeb.size() && desCel.size() >= desJava.size()){
            System.out.println("Hay mas desarrolladores Celulares");
            while (celItr.hasNext()){
                nomCel = celItr.next().toString();
                System.out.println(nomCel);    
            }
        }
        
        
        System.out.println ("7. desplegar la lista de los nombres de sus integrantes en orden ascendente: ");
        
        javaItr = desJava.iterator();
        webItr = desWeb.iterator();
        celItr = desCel.iterator();
        
        
        if (desJava.size() >= desWeb.size() && desJava.size() >= desCel.size()){
            while (javaItr.hasNext()){
                nomJava = javaItr.next().toString();
                System.out.println(nomJava);
            }
        }
        
        if (desWeb.size() >= desJava.size() && desWeb.size() >= desCel.size()){
            while (webItr.hasNext()){
                nomWeb = webItr.next().toString();
                System.out.println(nomWeb);
            }
        }
        
        if (desCel.size() >= desWeb.size() && desCel.size() >= desJava.size()){
            while (celItr.hasNext()){
                nomCel = celItr.next().toString();
                System.out.println(nomCel);    
            }
        }
        
                
    }
}
    
   
    

