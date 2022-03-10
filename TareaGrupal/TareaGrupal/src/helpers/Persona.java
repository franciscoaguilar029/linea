/*
 *
 */
package helpers;

public abstract class Persona {
    
    private String nombre;
    private String oficio;
    private int experiencia;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
     public String getNombre(){
        return this.nombre;
    }
     
     public void setOficio(String oficio){
        this.oficio=oficio;
    }
    
     public String getOficio(){
        return this.oficio;
    }
     
     public void setExperiencia(int experiencia){
        this.experiencia=experiencia;
    }
    
     public int setExperiencia(){
        return this.experiencia;
    }
     
     public void getInformacion(){
         System.out.println("Nombre "+nombre);
         System.out.println("Oficio: "+oficio);
         System.out.println("Experiencia "+experiencia);
     }
     
     abstract String getInformacionPersona();
     
}
