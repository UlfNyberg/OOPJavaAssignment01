import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-25
 * Time: 09:05
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */
public class TestDemo {

    TestDemo(){

        Hund sixten = new Hund ("Sixten", "vit/svart",6,false,5,
                "korthår", "okänt", "Joakim von Pluto");
        //Hunden Dogge satt som typen Djur, inte Hund
        Djur dogge = new Hund ("Dogge", "brun",2,false,10,
                "korthår", "okänt", "okänt");
        Katt venus = new Katt("Venus","grå/brunspräcklig", 2, false, 5,
                "korthår", "Evas tredje kull från Uppsala");
        //Katten Ove satt som typen Djur, inte Katt
        Djur ove = new Katt("Ove","vit", 2, true, 3,
                "långhår", "Jockes litter");
        Orm hypno = new Orm ("Hypno","grön", 23, false, 1, true,
                true, 2.32);

        

//        venus.vässarKlorna();
//        System.out.println(dogge.mataDjur());
//        //dogge.viftarSvans();      //Polymorfism-exempel, funkar inte för att Dogge är skapad som Djur, inte Hund
//        sixten.viftarSvans();       //Polymorfism-exempel, funkar för att Dogge är skapad som Hund
//        sixten.sägerHej();          //Polymorfism-exempel, Samma anrop men pga objekets typ blir resultat olika (i detta fall.
//        ove.sägerHej();             //Polymorfism-exempel, Samma anrop men pga objekets typ blir resultat olika (i detta fall.
//        sixten.sova();              //instansmetod ärvd av Djur
//        System.out.println(sixten); //Override toString, objektinfo istället för Hash-code
//        System.out.println(DjurMedMatVikt.DOGGE.matVikt); //Enum-parametervärde

/*
        //Meddelandefält till användaren
        String n = JOptionPane.showInputDialog("Vilket djur ska matas?");

        if (n == null)
            JOptionPane.showMessageDialog(null,("Tack och hej!"));
        else if (n.equals("sixten") || n.equals("Sixten"))
            JOptionPane.showMessageDialog(null,sixten.mataDjur());
        else if (n.equals("dogge") || n.equals("Dogge"))
            JOptionPane.showMessageDialog(null,dogge.mataDjur());
        else if (n.equals("venus") || n.equals("Venus"))
            JOptionPane.showMessageDialog(null,venus.mataDjur());
        //Enum-exempel för katten Ove
        else if (n.equals("ove") || n.equals("Ove")){
            DjurMedMatVikt b = DjurMedMatVikt.OVE;
            //alt. DjurMedMatVikt b = Enum.valueOf(DjurMedMatVikt.class, n.toUpperCase())
            JOptionPane.showMessageDialog(null,
                    ("Ove ska bli serverad " + b.matVikt + " gram kattfoder"));}
        else if (n.equals("hypno") || n.equals("Hypno"))
            JOptionPane.showMessageDialog(null,hypno.mataDjur());
        else
            JOptionPane.showMessageDialog(null,
                    "Detta djur huserar inte på hotellet.");
            System.exit(0);

 */

    }

    public static void main(String[] args) {
        TestDemo test1 = new TestDemo();


    }

}
