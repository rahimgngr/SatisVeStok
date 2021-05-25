/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.rah.complex.types;

/**
 *
 * @author rahimgng
 */
public class StokContractTotalComplex {
    private int id;
    private String urunAdi;
    private String personelAdi;
    private String tarih;
    private int adet;
    private int toplam;

    public int getToplam() {
        return toplam;
    }

    public void setToplam(int toplam) {
        this.toplam = toplam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public Object[] getVeriler() {
        Object[] veriler = {id, urunAdi, personelAdi, adet, toplam, tarih};

        return veriler;
    }

    @Override
    public String toString() {
        return personelAdi + " " + urunAdi;
    }
}