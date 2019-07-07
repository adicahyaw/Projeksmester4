
package com.example.projeksmester4.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SupirModel {

    @SerializedName("id_supir")
    @Expose
    private String idSupir;

    @SerializedName("nama_supir")
    @Expose
    private String namaSupir;

    @SerializedName("kelamin_supir")
    @Expose
    private String kelaminSupir;

    @SerializedName("usia_supir")
    @Expose
    private String usiaSupir;

    @SerializedName("alamat_supir")
    @Expose
    private String alamatSupir;

    @SerializedName("hp_supir")
    @Expose
    private String hpSupir;

    public static final String id_supir = "ID_SUPIR";
    public static final String nama_supir = "ID_SUPIR";
    public static final String kelamin_supir = "ID_SUPIR";
    public static final String usia_supir = "ID_SUPIR";
    public static final String alamat_supir = "ID_SUPIR";
    public static final String hp_supir= "ID_SUPIR";

    public SupirModel(String id, String nama, String kel,String usi,String alama,String h) {
        this.idSupir = id;
        this.namaSupir = nama;
        this.kelaminSupir = kel;
        this.usiaSupir = usi;
        this.alamatSupir = alama;
        this.hpSupir = h;
    }

    /**
     *
     * @return
     *     The idSupir
     */
    public String getId() {
        return idSupir;
    }

    /**
     *
     * @param idSupir
     *     The id_supir
     */
    public void setIdSupir(String idSupir) {
        this.idSupir = idSupir;
    }

    /**
     *
     * @return
     *     The nama
     */
    public String getNama() {
        return namaSupir;
    }

    /**
     *
     * @param namaSupir
     *     The NamaSupir
     */
    public void setNama(String namaSupir) {
        this.namaSupir = namaSupir;
    }

    /**
     *
     * @return
     *     The kel
     */
    public String getKel() {
        return kelaminSupir;
    }

    /**
     *
     * @param kelaminSupir
     *     The KelaminSupir
     */
    public void setKel(String kelaminSupir) {
        this.kelaminSupir = kelaminSupir;
    }

    /**
     *
     * @return
     *     The usi
     */
    public String getUsi() {
        return usiaSupir;
    }

    /**
     *
     * @param usiaSupir
     *     The UsiaSupir
     */
    public void setUsi(String usiaSupir) {
        this.usiaSupir = usiaSupir;
    }

    /**
     *
     * @return
     *     The alama
     */
    public String getAlama() {
        return alamatSupir;
    }

    /**
     *
     * @param alamatSupir
     *     The AlamaSupir
     */
    public void setAlama(String alamatSupir) {
        this.alamatSupir = alamatSupir;
    }

    /**
     *
     * @return
     *     The h
     */
    public String getH() {
        return hpSupir;
    }

    /**
     *
     * @param hpSupir
     *     The HpSupir
     */
    public void setH(String hpSupir) {
        this.hpSupir = hpSupir;
    }

}
