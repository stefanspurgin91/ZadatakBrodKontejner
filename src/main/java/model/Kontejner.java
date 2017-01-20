package model;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by androiddevelopment on 20.1.17..
 */
public class Kontejner {

    public static final String POLJE_OZNAKA = "oznaka";
    public static final String POLJE_OPIS = "opis";
    public static final String POLJE_TEZINA = "tezina";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_OZNAKA, canBeNull = false)
    private String oznaka;

    @DatabaseField(columnName = POLJE_OPIS, canBeNull = false)
    private String opis;

    @DatabaseField(columnName = POLJE_TEZINA, canBeNull = false)
    private double tezina;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = true)
    private Brod brod;


    public Kontejner() {

    }

    public Kontejner(String naziv, String opis, double tezina,) {
        this.oznaka = naziv;
        this.opis = opis;
        this.tezina = tezina;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brod getBrod() {
        return brod;
    }

    public void setBrod(Brod brod) {
        this.brod = brod;
    }

    public String toString() {
        return "Kontejner{" +
                "id=" + id +
                ", oznaka='" + oznaka + '\'' +
                ", opis='" + opis + '\'' +
                ", tezina=" + tezina +
                '}';
    }
}
