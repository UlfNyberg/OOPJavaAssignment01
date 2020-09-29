/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-25
 * Time: 09:04
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */
public class Katt extends DäggDjur{

    // default-kontruktor
    public Katt (){}

    // konstruktor med 'ärvda' instansvariabler(super) plus eventuellt
    // de instansvariabler som är unika för katter
    public Katt(String namn, String färg, int ålder, boolean föddHär, double viktIKilo,
                String päls, String kull){
        super(namn, färg, ålder, föddHär, viktIKilo, päls, kull);

    }

    // instansmetod
    public void sägerHej (){
        System.out.println(namn + " jamar!");
    }

    // instansmetod
    public void vässarKlorna (){
        System.out.println(namn + " vässar sina klor!");
    }

    // Override 'mata'-uträkningsmetod, baserat på kattens vikt. Dynamisk bindning
    @Override
    public String mataDjur(){
        return (namn + " ska bli serverad " + (int)(viktIKilo*1000)/150 +" gram kattfoder");}

    // Override toString, objektinfo istället för Hash-code
    @Override
    public String toString() {
        return "Katt{" +
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
