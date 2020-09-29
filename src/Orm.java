/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-25
 * Time: 09:05
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */
public class Orm extends Reptil{

    // instansvariablerna är deklarerade som protected (inkapslade) för variabler
    // som ärvs av subklasser och private (inkapslade) för variabler som
    // endast används inom en klass.
    private double längd;

    // default-kontruktor
    public Orm (){}

    // konstruktor med 'ärvda' instansvariabler(super) plus de
    // som är unika för ormar
    public Orm(String namn, String färg, int ålder, boolean föddHär, double viktIKilo,
                  boolean utrotningshotad, boolean exotisk, double längd){
        super(namn, färg, ålder, föddHär, viktIKilo, utrotningshotad, exotisk);
        this.längd = längd;
    }

    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }

    // instansmetod
    public void sägerHej (){
        System.out.println(namn + " väser!");
    }

    // Override 'mata'-uträkningsmetod, unikt för ormen med result oberoende av vikt.
    // Dynamisk bindning
    @Override
    public String mataDjur(){
        return (namn + " ska bli serverad 20 gram ormpellets");}

    // Override toString, objektinfo istället för Hash-code
    @Override
    public String toString() {
        return "Orm{" +
                "längd=" + längd +
                ", utrotningshotad=" + utrotningshotad +
                ", exotisk=" + exotisk +
                ", namn='" + namn + '\'' +
                ", färg='" + färg + '\'' +
                ", ålder=" + ålder +
                ", föddHär=" + föddHär +
                ", vikt=" + viktIKilo +
                '}';
    }
}
