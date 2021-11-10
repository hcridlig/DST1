import java.sql.ResultSet;
import java.sql.SQLException;

public class Date {
    public void cherhcerDate() throws SQLException {
        Modele mod = new Modele();

        String req = "SELECT id FROM `affretement` WHERE date not like '%/03/21'  ";
        ResultSet result = mod.traiterRequete(req);

        while(result.next()){
            System.out.println(result.getInt(1));
        }
    }
}
