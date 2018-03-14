/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTBIS
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MenuPrincipal {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        
  carros carros1 = new carros("Negro", false,"Audi","TLX-00-00",5,276.90);
  carros carros2= new carros("Verde",false, "Ford","JKL-23-VBH",5,256.47);
  carros carros3= new carros("Azul",false, "Ferrari","F1-1929",7,1475.65);
  carros carros4= new carros("Amarillo",false,"Lamborghini","VLN-25-30",7,1548.968);
  carros carros5= new carros("Rojo",false,"Volkswagen","VKA-10-48",4,1287.132);
  carros carros6= new carros("Blanco",false,"Isuzu","ISZ-05-18",5,2128.652);
  carros carros7= new carros("Rosa",false,"Bugatti","BUT-20-68",8,512.2185);
  carros carros8= new carros("Vino",false,"Porsche","PSH-89-64",5,251325.121);
  carros carros9= new carros("Gris",false,"Koenigsegg","KNG-26-30",5,12321.9874);
  carros carros10= new carros("Dorado",false,"Bentley","BTY-19-21",5,1232.2154);
                                             
    ArrayList<carros>coche=new ArrayList();
    coche.add(carros1);
    coche.add(carros2);
    coche.add(carros3);
    coche.add(carros4);
    coche.add(carros5);
    coche.add(carros6);
    coche.add(carros7);
    coche.add(carros8);
    coche.add(carros9);
    coche.add(carros10);
    
 System.out.println("Modificacion de algun dato de los carros");
          System.out.println("¿Que modificacion desea realizar del carros2?Eliga una opcion:\n1) Color \n2) Status \n3 Numerodepersonas \n4 Precio\n)");
       
          int carros=sc.nextInt();
          
        switch (carros){

            case 1:

            System.out.println ("Seleccionaste la primera opcion color");
            String color=sc.next();
           carros1.setColor(color);
          for(carros uno:coche)
           {
        System.out.println(uno);
       
           }
 break;
        case 2:
                System.out.println ("Seleccionaste la segunda opcion Status"); 
        boolean Status=sc.nextBoolean();
           carros1.setStatus(Status);
           for (carros uno:coche)
           {
               System.out.println(uno);
                
        }
       break;
              
           
       case 3:
                System.out.println ("Seleccionaste la tercera opcion de Numerodepersonas");
              int pasa=sc.nextInt();
              carros1.Numerodepersonas(pasa);
              for (carros uno:coche)
           {
               System.out.println(uno);
                
        }
       
         break;     
         case 4:

            System.out.println ("Seleccionaste la cuarta opcion Precio");
            int Precio=sc.nextInt();
           carros1.setPrecio(Precio);
           for (carros uno:coche)
           {
               System.out.println(uno);
               
        }
 break;
   default:
                System.out.println ("La modificacion ha sido correcta"); 
                break;

               }
               
        

    
          System.out.println( "Autos de lujo Vazquez S.A de C.V" );
         System.out.println("Gracias por su visita");
            System.out.printf("Desea salir de la aplicacion ? [(S),(N),]", "SN"); 
         
         
         }
}
   
 

   