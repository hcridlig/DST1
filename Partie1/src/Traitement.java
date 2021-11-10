import java.sql.SQLException;
import java.util.Scanner;

public class Traitement {
    public static void main (String[] args) throws SQLException {

        Ca ca = new Ca();
        System.out.println("Chiffre d'affaire pour l'id 459629");
        ca.calculerCa(459629);


        Date da = new Date();
        System.out.println("\n\nId d'affretement qui n'a pas été enregistré pour mars 2021:");
        da.cherhcerDate();

        Poids pds = new Poids();
        pds.calculerPoids();




    }
}
