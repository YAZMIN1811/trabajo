/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTBIS
 */
public class carros {
private String Color;
private boolean Status;
private String Name;
private String Id;
private int Numerodepersonas;
private double Precio;

    
    public carros(String Color, boolean Status, String Name, String Id, int Numerodepersonas, double Precio){
        this.Color=Color;
        this.Status=Status;
        this.Name=Name;
        this.Id=Id;
        this.Numerodepersonas=Numerodepersonas;
        this.Precio=Precio;
     }// cierre constructor
    
    /**
     *
     * @param
     */
    public void Color(String a){
       this.Color=a;
    }// cierre de color
    public String getColor(){
        System.out.println("El carro es de color: " +Color +" Color");
        return Color;
    }// cierre de getColor
    public void setColor(String Color){
        Color = Color;
    }// cierre de setColor
     public void Status(boolean b){
        this.Status=b;
    }// cierre de encendido
     public boolean getStatus(){
        System.out.println("El carro esta: " +Status+" Status");
        return Status;
    }// cierre de getStatus
      public void setStatus(boolean Status){
      Status = Status; 
    }// Cierre de setStatus
     public void Numerodepersonas(int c){
        this.Numerodepersonas=c;
    }// cierre de Numerodepersonas
    public int getNumerodepersonas(){
        System.out.println("El carro tiene: " +Numerodepersonas+ " Numerodepersonas");
        return Numerodepersonas;
    }// cierre de getNumerodepersonas
    public void setNumerodepersonas(String Numerodepersonas){
      Numerodepersonas = Numerodepersonas; 
    }// Cierre de setNumerodepersonas
     public double getPrecio(){
        System.out.println("El carro cuesta: " +Precio+ " Precio");
        return Precio;
    }// cierre de getPrecio
    public void setPrecio(double Precio){
      Precio = Precio; 
    }// Cierre de setNumerodepersonas
    
    @Override
    public String toString(){
    String aux="";
    aux="\nEl carro es de color:"+Color+"\n La marca es: \n"+Name+"\n  El carro esta: \n"+Status+"\n Las placa son: \n"+Id+"\n El carro lleva: \n"+Numerodepersonas+"\n Pasajeros \n El carro cuesta:\n"+Precio+"\n";
    if(Status){
        aux=aux+"encendido";
    }else{
        aux=aux+"apagado";
    }//cierra if-else
    return aux;
    }//cierra toString

    void setStatus(String aTrue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Numerodepersonas(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPrecio(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getColor(String amarillo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}// cierre de clase
  

