package otelotomasyon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author memo6
 */
public class Test {

    private static Otel newOtel = new Otel();
    private static Scanner scan = new Scanner(System.in);
    private static Oda newOda = new Oda();
    private static Login kayit = new Login();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musteribilgi musteri = new Musteribilgi();
        Otel otel1 = new Otel("Grand Hotel", "İstanbul", "grandist@gmail.com", "8503243434", 5, "1) Ücretsiz Otopark. 2) Ücretsiz WiFi. 3) Yüzme Havuzu.", "Tam Pansiyon");
        Otel otel2 = new Otel("Master Hotel", "Antalya", "antmas@gmail.com", "8503070707", 5, "1) Ücretsiz Otopark. 2) Ücretsiz WiFi. 3) Yüzme Havuzu.", "Tam Pansiyon");
        Otel otel3 = new Otel("Ultra Hotel", "Trabzon", "trault@gmail.com", "8503616161", 5, "1) Ücretsiz Otopark. 2) Ücretsiz WiFi. 3) Yüzme Havuzu.", "Tam Pansiyon");
        newOtel.otelListesineEkle(otel1);
        newOtel.otelListesineEkle(otel2);
        newOtel.otelListesineEkle(otel3);
        Oda oda1 = new Oda("Suit", "2 kişilik lüx yatak, Klima, Televizyon, Minibar", 3401, "Boş", "");
        Oda oda2 = new Oda("Suit", "2 kişilik lüx yatak, Klima, Televizyon, Minibar", 701, "Boş", "");
        Oda oda3 = new Oda("Suit", "2 kişilik lüx yatak, Klima, Televizyon, Minibar", 6101, "Boş", "");
        Oda oda4 = new Oda("Couple", "2 kişilik yatak, Klima, Televizyon, Minibar", 3402, "Boş", "");
        Oda oda5 = new Oda("Couple", "2 kişilik yatak, Klima, Televizyon, Minibar", 702, "Boş", "");
        Oda oda6 = new Oda("Couple", "2 kişilik yatak, Klima, Televizyon, Minibar", 6102, "Boş", "");
        Oda oda7 = new Oda("Single", "Tek kişilik yatak, Klima, Televizyon, Minibar", 3403, "Boş", "");
        Oda oda8 = new Oda("Single", "Tek kişilik yatak, Klima, Televizyon, Minibar", 703, "Boş", "");
        Oda oda9 = new Oda("Single", "Tek kişilik yatak, Klima, Televizyon, Minibar", 6103, "Boş", "");
        newOda.odaEkle(oda1);
        newOda.odaEkle(oda2);
        newOda.odaEkle(oda3);
        newOda.odaEkle(oda4);
        newOda.odaEkle(oda5);
        newOda.odaEkle(oda6);
        newOda.odaEkle(oda7);
        newOda.odaEkle(oda8);
        newOda.odaEkle(oda9);
        otel1.odaEkle(oda1);
        otel1.odaEkle(oda4);
        otel1.odaEkle(oda7);
        otel2.odaEkle(oda2);
        otel2.odaEkle(oda5);
        otel2.odaEkle(oda8);
        otel3.odaEkle(oda3);
        otel3.odaEkle(oda6);
        otel3.odaEkle(oda9);

        while (true) {
            System.out.println("*********************************");
            String islemler = "1. Rezervasyon işlemleri\n"
                    + "2. Rezervasyon iptal işlemleri.\n"
                    + "3. Yonetici işlemleri.\n"
                    + "Çıkış için q'ya basın";
            System.out.println(islemler);
            System.out.println("**********************************");
            System.out.println("Lütfen işlem seçiniz.");
            String islem = scan.next();
            scan.nextLine();

            if (islem.equals("q")) {
                System.out.println("İşlemden çıkılıyor.");
                break;

            } else if (islem.equals("1")) {
                String tarih;
                musteri.calisMusteri(); // kullanıcı bilgileri alır.
                newOtel.otelleriGoster();
                String otelSecim, odaSecim;
                System.out.println("Hangi otelde kalmak istiyorsunuz.");
                otelSecim = scan.next();

                if (otelSecim.equals("Grand")) {
                    
                    otel1.otelOdalarınıGoster();
                    System.out.println("Lütfen seçtiğiniz odanın numarasını giriniz.");
                    odaSecim = scan.next();
                    switch (odaSecim) {
                        case "3401":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda1.getOdaDurum().equals("Dolu")&&oda1.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda1.odaDurumKontrol();
                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda1.odaFiyatHesapla(oda1);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda1.setOdaDurum("Dolu");
                                    oda1.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");

                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        case "3402":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda4.getOdaDurum().equals("Dolu")&&oda4.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda4.odaDurumKontrol();
                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda4.odaFiyatHesapla(oda4);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda4.setOdaDurum("Dolu");
                                    oda4.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        case "3403":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda7.getOdaDurum().equals("Dolu")&&oda4.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda7.odaDurumKontrol();
                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda7.odaFiyatHesapla(oda7);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda7.setOdaDurum("Dolu");
                                    oda7.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        default:
                            System.out.println("Lütfen geçerli oda numarasını giriniz");
                            break;
                    }
                } else if (otelSecim.equals("Master")) {
                    otel2.otelOdalarınıGoster();
                    System.out.println("Lütfen seçtiğiniz odanın nuamrasını giriniz.");
                    odaSecim = scan.next();
                    switch (odaSecim) {
                        case "701":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda2.getOdaDurum().equals("Dolu")&&oda2.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda2.odaDurumKontrol();

                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda2.odaFiyatHesapla(oda2);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda2.setOdaDurum("Dolu");
                                    oda2.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        case "702":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda5.getOdaDurum().equals("Dolu")&&oda5.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda5.odaDurumKontrol();

                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda5.odaFiyatHesapla(oda5);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda5.setOdaDurum("Dolu");
                                    oda5.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        case "703":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda8.getOdaDurum().equals("Dolu")&&oda8.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda8.odaDurumKontrol();

                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda8.odaFiyatHesapla(oda8);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda8.setOdaDurum("Dolu");
                                    oda8.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        default:
                            System.out.println("Lütfen geçerli oda numarasını giriniz");
                            break;
                    }
                } else if (otelSecim.equals("Ultra")) {
                    otel3.otelOdalarınıGoster();
                    System.out.println("Lütfen seçtiğiniz odanın nuamrasını giriniz.");
                    odaSecim = scan.next();
                    switch (odaSecim) {
                        case "6101":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda3.getOdaDurum().equals("Dolu")&&oda3.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda3.odaDurumKontrol();

                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda3.odaFiyatHesapla(oda3);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda3.setOdaDurum("Dolu");
                                    oda3.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        case "6102":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda6.getOdaDurum().equals("Dolu")&&oda6.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda6.odaDurumKontrol();

                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda6.odaFiyatHesapla(oda6);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda6.setOdaDurum("Dolu");
                                    oda6.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        case "6103":
                            System.out.println("Gidiş geliş tarihinizi giriniz.(gg.aa.yyyy-gg.aa.yyyy)");
                            tarih = scan.next();
                            if (oda9.getOdaDurum().equals("Dolu")&&oda9.getOdaTarih().equals(tarih)) {
                                System.out.println("Bu oda zaten rezerve edilmiş. Lütfen Başka bir oda veya tarih seçiniz.");
                                break;
                            } else {
                                System.out.println("İşleminiz alınmışıtır.");
                                oda9.odaDurumKontrol();

                                System.out.println("------------------");
                                System.out.println("Ücret hesaplanıyor...");
                                System.out.println("------------------");
                                oda9.odaFiyatHesapla(oda9);
                                System.out.println("------------------");
                                System.out.println("işlemi onaylıyor musunuz?");
                                String onay = scan.next();
                                if (onay.equals("Evet")) {
                                    System.out.println("Ucret alınmıştır. Teşekkürler");
                                    oda9.setOdaDurum("Dolu");
                                    oda9.setOdaTarih(tarih);
                                } else {
                                    System.out.println("işlem iptal edilmiştir.");
                                    break;
                                }
                                System.out.println("------------------");
                                System.out.println("Rezervasyon tamamlanmıştır.");
                                System.out.println("------------------");
                                break;
                            }
                        default:
                            System.out.println("Lütfen geçerli oda numarasını giriniz");
                            break;
                    }
                } else {
                    System.out.println("Lütfen geçerli bir otel adı giriniz");
                }

            } else if (islem.equals("2")) {
                System.out.println("Rezervasyon iptal işlemleri başlatılıyor.");
                if (musteri.rezervasyonIptal() == true) {
                    System.out.println("Oda numarasını giriniz.");
                    int odanosu = scan.nextInt();
                    switch (odanosu) {
                        case 3401:
                            if(oda1.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }                            
                            oda1.setOdaDurum("Boş");
                            oda1.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 3402:
                            if(oda4.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda4.setOdaDurum("Boş");
                            oda4.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 3403:
                            if(oda7.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda7.setOdaDurum("Boş");
                            oda7.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 701:
                            if(oda2.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda2.setOdaDurum("Boş");
                            oda2.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 702:
                            if(oda5.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda5.setOdaDurum("Boş");
                            oda5.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 703:
                            if(oda8.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda8.setOdaDurum("Boş");
                            oda8.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 6101:
                            if(oda3.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda3.setOdaDurum("Boş");
                            oda3.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 6102:
                            if(oda6.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda6.setOdaDurum("Boş");
                            oda6.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        case 6103:
                            if(oda9.getOdaDurum().equals("Boş")){
                                System.out.println("Hatalı işlem. Bu odayı rezerve etmemişsiniz.");
                                break;
                            }  
                            oda9.setOdaDurum("Boş");
                            oda9.setOdaTarih(null);
                            System.out.println("Rezervasyonunuz iptal edilmiştir. Ucret iadesi işlemleri başlatılıyor.");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir Oda numarasını giriniz.");
                            break;                            
                    }                  
                } else {
                    System.out.println("Hatalı işlem");
                }
            } else if (islem.equals("3")) {
                Yonetici yonet = new Yonetici("Mehmet", "Yıldız", "Müdür", "12345", "admin");
                System.out.println("bilgileri giriniz lütfen.");
                int giris_hakki = 3;
                while (true) {
                    if (kayit.login(yonet)) {
                        System.out.println("Giriş Başarılı...");
                        break;
                    } else {
                        System.out.println("Giriş Başarısız...");
                        giris_hakki -= 1;
                        System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
                    }
                    if (giris_hakki == 0) {
                        System.out.println("Giriş Hakkınız Bitti...");
                        return;
                    }
                }
                String yoneticiIslemler = "1.Otel sil\n"
                        + "2. Otel ekle\n"
                        + "3. Oda güncelle\n"
                        + "Çıkış için q'ya basın";
                while (true) {
                    String otelAd;
                    System.out.println("**********************************");
                    System.out.println(yoneticiIslemler);
                    System.out.println("**********************************");
                    System.out.println("Lütfen işlem seçiniz.");
                    String yoneticiIslem = scan.next();
                    scan.nextLine();
                    if (yoneticiIslem.equals("q")) {
                        System.out.println("İşlemden çıkılıyor.");
                        break;
                    } else if (yoneticiIslem.equals("1")) {
                        newOtel.otelleriGoster();
                        newOtel.otelSil();

                    } else if (yoneticiIslem.equals("2")) {
                        newOtel.otelOlustur();
                        newOtel.otelleriGoster();

                    } else if (yoneticiIslem.equals("3")) {
                        String odaIslem;
                        String secenek = "1-Oda Tipi"
                                + "2- Oda numarası"
                                + "3-Oda ozellikleri"
                                + "4-Oda durumu";
                        System.out.println("Kaç numaralı odanın bilgilerini güncellemek istiyorsunuz.");
                        int numara = scan.nextInt();
                        switch (numara) {
                            case 3401:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda1.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda1.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda1.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda1.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 3402:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda4.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda4.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda4.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda4.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 3403:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda7.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda7.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda7.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda7.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 701:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda2.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda2.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda2.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda2.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 702:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda5.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda5.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda5.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda5.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 703:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda8.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda8.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda8.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda8.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 6101:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda3.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda3.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda3.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda3.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 6102:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda6.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda6.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda6.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda6.setOdaDurum(yeniDurum);
                                }
                                break;
                            case 6103:
                                System.out.println(secenek);
                                System.out.println("_____________________");
                                System.out.println("Odanın hangi bilgisini güncellemek istiyorsunuz.(1-2...)");
                                odaIslem = scan.next();
                                if (odaIslem.equals("1")) {
                                    System.out.println("Yeni tipi giriniz.");
                                    String yeniTip = scan.next();
                                    oda9.setOdaTipi(yeniTip);
                                } else if (odaIslem.equals("2")) {
                                    System.out.println("Yeni oda numrasını giriniz.");
                                    int yeniNo = scan.nextInt();
                                    oda9.setOdaNo(yeniNo);
                                } else if (odaIslem.equals("3")) {
                                    System.out.println("Yeni oda ozelliklerini giriniz.");
                                    String yeniOzellikler = scan.next();
                                    oda9.setOdaOzellikleri(yeniOzellikler);
                                } else if (odaIslem.equals("4")) {
                                    System.out.println("Yeni durumunu giriniz.");
                                    String yeniDurum = scan.next();
                                    oda9.setOdaDurum(yeniDurum);
                                }
                                break;
                            default:
                                System.out.println("Geçerli oda numrası giriniz.");
                        }
                    }
                }
            }
        }
    }
}
