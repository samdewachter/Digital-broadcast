/**
* deze klasse is een java programma
* @author Marijn Brosens
* @version 1.0
*/

package Oef3;
import java.lang.*;

public class Werknemer{

    public String voornaam;
    public String achternaam;
    public int werknemerNummer;
    protected float salaris;

    public Werknemer(String voornaam, String achternaam, int wNummer, float salaris){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.werknemerNummer = wNummer;
        this.salaris = salaris;
    }
    
    public void salarisVerhogen(int percentage){
        float verhogingsfactor = (float)percentage/100;
        salaris += salaris * verhogingsfactor;
    }
    
    public float getSalaris(){
        return this.salaris;
    }
}
