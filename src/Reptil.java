/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-25
 * Time: 09:07
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */

/**
 * Abstrakt klass för att ingen ska göra
 * objekt av sjävaste Reptil utan av de
 * icke-abstrakta subklasser som ärver
 */
abstract class Reptil extends Djur{

    // instansvariablerna är deklarerade som protected(inkapslade) för variabler
    // som ärvs av subklasser och private(inkapslade) för variabler som
    // endast används inom en klass.
    protected boolean utrotningshotad;
    protected boolean exotisk;

    // default-kontruktor
    public Reptil (){}

    // konstruktor med 'ärvda' instansvariabler(super) plus de
    // som är unika för reptiler
    public Reptil(String namn, String färg, int ålder, boolean föddHär, double viktIKilo,
                  boolean utrotningshotad, boolean exotisk){
        super(namn, färg, ålder, föddHär, viktIKilo);
        this.utrotningshotad = utrotningshotad;
        this.exotisk = exotisk;
    }

    public boolean isUtrotningshotad() {
        return utrotningshotad;
    }

    public void setUtrotningshotad(boolean utrotningshotad) {
        this.utrotningshotad = utrotningshotad;
    }

    public boolean isExotisk() {
        return exotisk;
    }

    public void setExotisk(boolean exotisk) {
        this.exotisk = exotisk;
    }
}
