package otelotomasyon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author memo6
 */
public class Oda extends Hesap {

    private static Scanner scan = new Scanner(System.in);
    ArrayList<Oda> odaListesi = new ArrayList<>();
    private String odaTipi = null; // single, double, suit.
    private String odaOzellikleri = null; // yatak sayısı, televizyon, minibar, klima.
    private int odaNo = 0;
    private String odaDurum = null;
    private String odaTarih = null;

    public Oda(String odaTipi, String odaOzellikleri, int odaNo, String odaDurum, String odaTarih) {
        this.odaNo = odaNo;
        this.odaTipi = odaTipi;
        this.odaOzellikleri = odaOzellikleri;
        this.odaDurum = odaDurum;        
        this.odaTarih = odaTarih;
        
    }

    public Oda() {
    }

    public String getOdaTarih() {
        return odaTarih;
    }

    public void setOdaTarih(String odaTarih) {
        this.odaTarih = odaTarih;
    }

    public void odalar() {
        System.out.println("____________________________________________________");
        for (int i = 0; i < odaListesi.size(); i++) {
            System.out.println(odaListesi.get(i));
        }
        System.out.println("____________________________________________________");
    }

    public void odaBastır(int odaNumarasi) {
        odaListesi.get(odaNumarasi);
    }

    public void odaTipiGuncelle(Oda oda) {
        System.out.println("Yeni tipi giriniz.");
        String yeniTip = scan.next();
        this.odaTipi = yeniTip;
    }

    public void odaOzellikGuncelle(Oda oda) {

        System.out.println("Yeni ozelliği giriniz.");
        String yeniOzellik = scan.next();
        this.odaOzellikleri = yeniOzellik;
    }

    public void odaDurumGuncelle(Oda oda) {

        System.out.println("Yeni durumu giriniz.");
        String yeniDurum = scan.next();
        this.odaDurum = yeniDurum;
    }

    public void odaNoGuncelle(Oda oda) {

        System.out.println("Yeni numarayı giriniz.");
        int yeniNo = scan.nextInt();
        this.odaNo = yeniNo;
    }

    public ArrayList<Oda> getOdaListesi() {
        return odaListesi;
    }

    public void setOdaListesi(ArrayList<Oda> odaListesi) {
        this.odaListesi = odaListesi;
    }

    public boolean odaDurumKontrol() {

        if (this.odaDurum.equals("Dolu")) {
            return true;
        } else {
            System.out.println("Bu odayı tutabilirsiniz.");
            return false;
        }
    }

    public void odaEkle(Oda oda) {
        odaListesi.add(oda);
    }

    public void odaSil(Oda oda) {
        odaListesi.remove(oda);
    }

    public void odaTipiGuncelle() {
        System.out.println("Güncel oda tipini giriniz.");
        String tip = scan.next();
        setOdaTipi(tip);
    }

    public void otelOdalarınıGoster() {
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < odaListesi.size(); i++) {
            System.out.println(odaListesi.get(i));
        }
        System.out.println("----------------------------------------------------");
    }

    @Override
    public String toString() {
        return odaNo + ". Oda: " + odaTipi + " Tip odadır." + " Oda durumu: " + odaDurum;
    }

    public String getOdaTipi() {
        return odaTipi;
    }

    public void setOdaTipi(String odaTipi) {
        this.odaTipi = odaTipi;
    }

    public String getOdaOzellikleri() {
        return odaOzellikleri;
    }

    public void setOdaOzellikleri(String odaOzellikleri) {
        this.odaOzellikleri = odaOzellikleri;
    }

    public int getOdaNo() {
        return odaNo;
    }

    public void setOdaNo(int odaNo) {
        this.odaNo = odaNo;
    }

    public String getOdaDurum() {
        return odaDurum;
    }

    public void setOdaDurum(String odaDurum) {
        this.odaDurum = odaDurum;
    }

}
