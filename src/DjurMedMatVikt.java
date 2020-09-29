/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-26
 * Time: 17:29
 * Project: OOPJava Inlämningsuppgift01
 * Copyright: MIT
 */
public enum DjurMedMatVikt {

        // Enum som alternativ till en override-metod via Interface
        // med varje djurs namn som konstant och djurets utäknade mathantering
        // baserad på djurets vikt i parametern till konstanten

        SIXTEN(5*1000/100), DOGGE(10*1000/100),
        VENUS(5*1000/150), OVE(3*1000/150), HYPNO(20);


        // instansvariabel
        public final int matVikt;

        // konstruktor
        DjurMedMatVikt (int m) { matVikt = m;}


}
