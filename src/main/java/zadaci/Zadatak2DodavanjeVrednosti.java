package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Brod;
import model.Kontejner;

import java.io.IOException;

/**
 * Created by androiddevelopment on 20.1.17..
 */
public class Zadatak2DodavanjeVrednosti {

    static Dao<Brod, Integer> brodDao;
    static Dao<Kontejner, Integer> kontejnerDao;

    public static void main(String[] args) {
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:brodKontejner.db");

            brodDao = DaoManager.createDao(connectionSource, Brod.class);
            kontejnerDao = DaoManager.createDao(connectionSource, Kontejner.class);

            Brod a1 = new Brod("Brod1", "Transporter1");
            Brod a2 = new Brod("Brod2", "Transporter2");

            brodDao.create(a1);
            brodDao.create(a2);

            Kontejner r1 = new Kontejner("KP1", "Namestaj", 100, 0.1, 0.4, 0.05);
            r1.setBrod(a1);
            Kontejner r2 = new Kontejner("KP2", "Banane", 1000.5, 0.01, 2.4, 0.5);
            r2.setBrod(a1);
            Kontejner r3 = new Kontejner("KP3", "Morski proizvodi", 200.7, 0.1, 0.4, 0.05);
            r3.setBrod(a1);
            Kontejner r4 = new Kontejner("KP4", "Mercedes", 500.4, 0.1, 3, 2.3);
            r4.setBrod(a2);
            Kontejner r5 = new Kontejner("KP5", "Klavir", 100, 1.2, 0.8, 0.5);
            r5.setBrod(a2);

            kontejnerDao.create(r1);
            kontejnerDao.create(r2);
            kontejnerDao.create(r3);
            kontejnerDao.create(r4);
            kontejnerDao.create(r5);

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connectionSource != null) {
                try {
                    connectionSource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
