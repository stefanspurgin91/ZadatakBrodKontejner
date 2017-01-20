package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Brod;

import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Created by androiddevelopment on 20.1.17..
 */
public class BrodNit extends Thread {

    private Brod brod;

    static Dao<Brod, Integer> brodDao;

    public static int brojPristiglihBrodova = 0;

    public BrodNit(Brod brod) {
        this.brod = brod;
    }

    public void run() {

        }

