package otelotomasyon;
//Otel Adı, Adres, E-posta, Telefon, Yıldız, Tesis Özellikleri, Pansiyon tipleri

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author memo6
 */
public class Otel extends Oda {

    private static Scanner scan = new Scanner(System.in);
    ArrayList<Otel> otelListesi = new ArrayList<Otel>();
    private String otelAdi;
    private String otelAdres;
    private String otelEposta;
    private String otelTelefon;
    private int otelYıldız;
    private String tesisOzellikleri; //"1) Ücretsiz Otopark.\n" + "2) Ücretsiz WiFi.\n" + "3) Yüzme Havuzu.\n" + "4) Fitness Center.\n" + "5) Hotel Concierge.\n" + "6) SPA.\n" + "7) 7/24 Oda Servisi.
    private String pansiyonTipleri; //"1) Ultra Herşey Dahil\n" + "2) Herşey Dahil\n" + "3) Oda Kahvaltı\n" + "4) Tam Pansiyon\n" + "5) Yarım Pansiyon\n" + "6) Sadece Yatak\n" + "7) Alkol Hariç Full credit\n

    public Otel(String otelAdi, String otelAdres, String otelEposta, String otelTelefon, int otelYıldız, String tesisOzellikleri, String pansiyonTipleri) {
        this.otelAdi = otelAdi;
        this.otelAdres = otelAdres;
        this.otelEposta = otelEposta;
        this.otelTelefon = otelTelefon;
        this.otelYıldız = otelYıldız;
        this.tesisOzellikleri = tesisOzellikleri;
        this.pansiyonTipleri = pansiyonTipleri;
    }

    public Otel() {
    }

    public void otelListesineEkle(Otel otel) {
        otelListesi.add(otel);
    }

    
    public  void otelSil(Otel otel) {

        otelListesi.remove(otel);
       
    }

    public  void otelSil() {

        System.out.println("Silmek istediğiniz Otel pozisyonu (1,2,3....)");         
        int pozisyon = scan.nextInt();
        otelListesi.remove(pozisyon-1);
        System.out.println("işlem tamamlandı.");
    }

    public void otelOlustur() {

        String otelAdi, otelAdres, otelEposta, otelTelefon, tesisOzellikleri, pansiyonTipleri;
        int otelYıldız;
        System.out.println("Otel bilgilerini giriniz");
        System.out.println("Otelin adını giriniz.");
        otelAdi = scan.next();
        System.out.println("Otelin hangi şehirde olduğunu giriniz.");
        otelAdres = scan.next();
        System.out.println("Otelin e-posta adresini giriniz.");
        otelEposta = scan.next();
        System.out.println("Otelin telefon numarasını giriniz.");
        otelTelefon = scan.next();

        System.out.println("Otelin kaç yıldız olduğunu giriniz.");
        otelYıldız = scan.nextInt();
        System.out.println("Otelin tesis Ozelliklerini giriniz.");
        tesisOzellikleri = scan.next();
        System.out.println("Otelin pansiyon tiplerini giriniz.");
        pansiyonTipleri = scan.next();
        Otel otel = new Otel(otelAdi, otelAdres, otelEposta, otelTelefon, otelYıldız, tesisOzellikleri, pansiyonTipleri);
        otelListesi.add(otel);
    }

    
    public void otelleriGoster() {
        System.out.println("---------------------------");
        for (int i = 0; i < otelListesi.size(); i++) {
            System.out.println(otelListesi.get(i));
        }
        System.out.println("---------------------------");
    }

    public void otelOzellikleriniGoster() {
        System.out.print("pansiyon tipleri: ");
        System.out.println(pansiyonTipleri);
        System.out.println("----------------------------------------------------");
        System.out.print("Tesis Özellikleri: ");
        System.out.println(tesisOzellikleri);
        System.out.println("----------------------------------------------------");

    }

    public String getTesisOzellikleri() {
        return tesisOzellikleri;
    }

    public void setTesisOzellikleri(String tesisOzellikleri) {
        this.tesisOzellikleri = tesisOzellikleri;
    }

    public String getPansiyonTipleri() {
        return pansiyonTipleri;
    }

    public void setPansiyonTipleri(String PansiyonTipleri) {
        this.pansiyonTipleri = PansiyonTipleri;
    }

    public String getOtelAdi() {
        return otelAdi;
    }

    public void setOtelAdi(String otelAdi) {
        this.otelAdi = otelAdi;
    }

    public String getOtelAdres() {
        return otelAdres;
    }

    public void setOtelAdres(String otelAdres) {
        this.otelAdres = otelAdres;
    }

    public String getOtelEposta() {
        return otelEposta;
    }

    public void setOtelEposta(String otelEposta) {
        this.otelEposta = otelEposta;
    }

    public String getOtelTelefon() {
        return otelTelefon;
    }

    public void setOtelTelefon(String otelTelefon) {
        this.otelTelefon = otelTelefon;
    }

    public int getOtelYıldız() {
        return otelYıldız;
    }

    public void setOtelYıldız(int otelYıldız) {
        this.otelYıldız = otelYıldız;
    }

    @Override
    public String toString() {
        return otelAdres + "'da  " + otelAdi;
    }

    public ArrayList<Otel> getOtelListesi() {
        return otelListesi;
    }

    public void setOtelListesi(ArrayList<Otel> otelListesi) {
        this.otelListesi = otelListesi;
    }

    void otelGüncelle(int i, String guncellenecekOtel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
