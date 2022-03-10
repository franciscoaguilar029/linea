/*
 *
 */
package helpers;

public class Doctor extends Persona{
    
    public Doctor(){
        setNombre("D");
        setOficio("Neurocirujano");
        setExperiencia(1);
    }

    @Override
    public String getInformacionPersona() {
        return "Informacion del Doctor";
    }
    
}
