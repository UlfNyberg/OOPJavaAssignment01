import org.w3c.dom.ls.LSOutput;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-25
 * Time: 09:04
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */
public class Hund extends DäggDjur{

    // instansvariablerna är deklarerade som protected(inkapslade) för variabler
    // som ärvs av subklasser och private(inkapslade) för variabler som
    // endast används inom en klass.
    private String stamtavla;

    // default-kontruktor
    public Hund (){}

    // konstruktor med 'ärvda' instansvariabler(super) plus de
    // som är unika för hundar
    public Hund(String namn, String färg, int ålder, boolean föddHär, double viktIKilo,
                String päls, String kull, String stamtavla){
        super(namn, färg, ålder, föddHär, viktIKilo, päls, kull);
        this.stamtavla = stamtavla;
    }

    public String getStamtavla() {
        return stamtavla;
    }

    public void setStamtavla(String stamtavla) {
        this.stamtavla = stamtavla;
    }

    //instansmetod
    public void sägerHej (){
        System.out.println(namn + " skäller!");
    }

    //instansmetod
    public void viftarSvans (){
        System.out.println(namn + " viftar på svansen!");
    }

    // Override 'mata'-uträkningsmetod, baserat på hundens vikt. Dynamisk bindning
    @Override
    public String mataDjur(){
    return (namn + " ska bli serverad " + (int)(viktIKilo*1000)/100 +" gram hundfoder");}

    //Override toString, objektinfo istället för Hash-code
    @Override
    public String toString() {
        return "Hund{" +
                "stamtavla='" + stamtavla + '\'' +
                ", päls=" + päls +
                ", kull='" + kull + '\'' +
                ", namn='" + namn + '\'' +
                ", färg='" + färg + '\'' +
                ", ålder=" + ålder +
                ", föddHär=" + föddHär +
                ", vikt=" + viktIKilo +
                '}';
    }
}
