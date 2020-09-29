/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-25
 * Time: 17:56
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */
/**
 * Abstrakt klass för att ingen ska göra
 * objekt av sjävaste Djur utan av de
 * icke-abstrakta subklasser som ärver
 */
abstract class Djur implements ISkötsel{


    //dessa instansvariabler kommer att gälla för alla djur som skapas
    //de är inkapslade men alla är protected så subklasserna kommer åt dom.
    protected String namn;
    protected String färg;
    protected int ålder;
    protected boolean föddHär;
    protected double viktIKilo;

    //default-kontruktor
    public Djur (){}

    //konstruktor
    public Djur (String namn, String färg, int ålder, boolean föddHär, double viktIKilo){
        this.namn = namn;
        this.färg = färg;
        this.ålder = ålder;
        this.föddHär = föddHär;
        this.viktIKilo = viktIKilo;

    }


    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public boolean isFöddHär() {
        return föddHär;
    }

    public void setFöddHär(boolean föddHär) {
        this.föddHär = föddHär;
    }

    public double getviktIKilo() {
        return viktIKilo;
    }

    public void setviktIKilo(double viktIKilo) {
        this.viktIKilo = viktIKilo;
    }

    //abstrakt metod från ISkötsel som måste ärvas
    //av subklasser, ligger här som en påminnelse
    public String mataDjur(){
        return ("Djuret behöver mat");}

    //instansmetod
    public void sägerHej (){
        System.out.println("Vilket djur rör det sig om?");
    }

    //instansmetod
    public void bajsa(){  //BAJSA
        System.out.println(namn + " bajsade");
    }

    //instansmetod
    public void sova (){  //SOVA  override?
        System.out.println(namn + " sover");
    }


}

