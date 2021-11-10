import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Poids {
    public void calculerPoids() throws SQLException {
        Modele mod = new Modele();

        String req = "SELECT * FROM `affretement` ";
        ResultSet result = mod.traiterRequete(req);

        System.out.println("\n\nVoici les id d'affretement veuillez en choisir un: ");
        while(result.next()) {
            int id = result.getInt(1);
            System.out.println(id);

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        int nombre = scanner.nextInt();

        req = "SELECT poids FROM `lot` WHERE idAff='" + nombre +"'" ;
        result = mod.traiterRequete(req);

        double sum = 0;
        int poids=0;

        while(result.next()){
            poids = result.getInt(1);
            sum =sum + poids;
        }
        System.out.println("La somme du poids de l'affretement " + nombre + " est de " + sum + " Kg");
    }
}
