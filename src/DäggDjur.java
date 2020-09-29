/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-25
 * Time: 09:07
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */

/**
 * Abstrakt klass för att ingen ska göra
 * objekt av sjävaste Däggdjur utan av de
 * icke-abstrakta subklasser som ärver
 */
abstract class DäggDjur extends Djur{

    // instansvariablerna är deklarerade som protected (inkapslade) för variabler
    // som ärvs av subklasser och private (inkapslade) för variabler som
    // endast används inom en klass.
    protected String päls;
    protected String kull;

    // default-kontruktor
    public DäggDjur (){}

    // konstruktor med 'ärvda' instansvariabler(super) plus de
    // som är unika för däggdjur
    public DäggDjur(String namn, String färg, int ålder, boolean föddHär, double viktIKilo,
                    String päls, String kull){
        super(namn, färg, ålder, föddHär, viktIKilo);
        this.päls = päls;
        this.kull = kull;
    }

    public String getPäls() {
        return päls;
    }

    public void setPäls(String päls) {
        this.päls = päls;
    }

    public String getKull() {
        return kull;
    }

    public void setKull(String kull) {
        this.kull = kull;
    }
}
