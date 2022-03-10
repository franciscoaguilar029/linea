/*
 *
 */
package tareagrupal;

import helpers.Doctor;
import helpers.Deportista;

public class TareaGrupal {

    public static void main(String[] args) {
        Doctor DC = new Doctor();
        Deportista DT = new Deportista();
        
       System.out.println(DC.getInformacionPersona());
       DC.getInformacion();
       System.out.println("\n"+DT.getInformacionPersona());
       DT.getInformacion();
    }
    
}
