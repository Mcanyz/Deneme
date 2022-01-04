/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otelotomasyon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author memo6
 */
public class Musteribilgi {

    Scanner scan = new Scanner(System.in);
    ArrayList<String> kayitListesi = new ArrayList<String>();
    ArrayList<String> tarihListesi = new ArrayList<String>();
    private String musteriAdSoyad = null, ebeveynSayisi = null, cocukSayisi = null, gidisTarihi = null, gelisTarihi = null, musteriTc = null;

    public Musteribilgi(String musteriAdSoyad, String ebeveynSayisi, String cocukSayisi, String gidisTarihi, String gelisTarihi, String musteriTc) {
        this.musteriAdSoyad = musteriAdSoyad;
        this.musteriTc = musteriTc;
        this.ebeveynSayisi = ebeveynSayisi;
        this.cocukSayisi = cocukSayisi;
        this.gidisTarihi = gidisTarihi;
        this.gelisTarihi = gelisTarihi;
    }

    Musteribilgi() {

    }

    public boolean rezervasyonIptal() {
        String tcKimlik;

        System.out.println("Tc kimlik numranızı giriniz.");
        tcKimlik = scan.next();
        boolean rezervasyonIptal = false;
        for (int i = 0; i < kayitListesi.size(); i++) {
            if (kayitListesi.contains(tcKimlik)) {
                System.out.println("Kaydınız bulunmuştur. İptal işlemleri başlatılıyor.");
                kayitListesi.remove(tcKimlik);
                rezervasyonIptal = true;
                break;
            } else if (!kayitListesi.contains(tcKimlik)) {
                System.out.println("Kayıt bulunamamıştır.");
                rezervasyonIptal = false;
            }
        }

        if (rezervasyonIptal == true) {
            return true;
        } else {
            return false;
        }
    }

    public void calisMusteri() {
        Oda oda = new Oda();
        System.out.println("Lütfen adınızı ve soyadınızı giriniz.");
        this.musteriAdSoyad = scan.next();
        scan.nextLine();

        System.out.println("Lütfen TC numaranızı giriniz.");
        this.musteriTc = scan.next();
        kayitListesi.add(this.musteriTc);

        System.out.println("ebeveyn sayısını giriniz.");
        this.ebeveynSayisi = scan.next();

        System.out.println("Çocuk sayısını giriniz.");
        this.cocukSayisi = scan.next();


    }

    public ArrayList<String> getTarihListesi() {
        return tarihListesi;
    }

    public void setTarihListesi(ArrayList<String> tarihListesi) {
        this.tarihListesi = tarihListesi;
    }

    public String getMusteriAdSoyad() {
        return musteriAdSoyad;
    }

    public void setMusteriAd(String musteriAdSoyad) {
        this.musteriAdSoyad = musteriAdSoyad;
    }

    public String getEbeveynSayisi() {
        return ebeveynSayisi;
    }

    public void setEbeveynSayisi(String ebeveynSayisi) {
        this.ebeveynSayisi = ebeveynSayisi;
    }

    public String getCocukSayisi() {
        return cocukSayisi;
    }

    public void setCocukSayisi(String cocukSayisi) {
        this.cocukSayisi = cocukSayisi;
    }

    public String getGidisTarihi() {
        return gidisTarihi;
    }

    public void setGidisTarihi(String gidisTarihi) {
        this.gidisTarihi = gidisTarihi;
    }

    public String getGelisTarihi() {
        return gelisTarihi;
    }

    public void setGelisTarihi(String gelisTarihi) {
        this.gelisTarihi = gelisTarihi;
    }

}
