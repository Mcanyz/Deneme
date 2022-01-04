/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otelotomasyon;

/**
 *
 * @author memo6
 */
public class Yonetici {
    private String ad,soyad,unvan,sıfre,kullaniciAd;

    public Yonetici(String ad, String soyad, String unvan, String sıfre, String kullaniciAd) {
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.sıfre = sıfre;
        this.kullaniciAd =kullaniciAd;
    }

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getSıfre() {
        return sıfre;
    }

    public void setSıfre(String sıfre) {
        this.sıfre = sıfre;
    }

   

    
    
}
