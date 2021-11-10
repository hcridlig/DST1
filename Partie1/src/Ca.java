import java.sql.ResultSet;
import java.sql.SQLException;

public class Ca {
    public void calculerCa(int id) throws SQLException {
        Modele mod = new Modele();

        String req = "SELECT poids, idTran FROM `lot` where idAff='"+ id + "'";
        ResultSet result = mod.traiterRequete(req);
        int id12 = 250;
        int id13 = 843;
        double sum1=0, sum2=0, ca=0;
        while(result.next()){
            int poids = result.getInt(1);
            int idTran = result.getInt(2);

            if(idTran == 12){
                sum1 = poids*id12;
            }
            else if (idTran == 13){
                sum2 = poids*id13;
            }
           ca = sum1+sum2;
        }
        System.out.println(ca);


    }
}
