/*
 *
 */
package helpers;

public class Deportista extends Persona{
    
     public Deportista(){
        setNombre("D");
        setOficio("Ciclista");
        setExperiencia(1);
    }

    @Override
    public String getInformacionPersona() {
        return "Infromacion del Deportista";
    }
    
}
