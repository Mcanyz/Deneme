package otelotomasyon;



/**
 *
 * @author memo6
 */
public class Hesap {

    private double suitOdaDeger = 400;
    private double coupleOdaDeger = 350;
    private double singleOdaDeger = 300;
    private double hizmetDeger = 200;
    private double Fiyat;
    private double kdv = 0.18;

    public void odaFiyatHesapla(Oda oda) {
        if (oda.getOdaTipi().equals("Suit")) {
            this.Fiyat = (kdv * (suitOdaDeger)) + suitOdaDeger + hizmetDeger;
            System.out.println(oda.getOdaNo() + " No'lu odanın fiyatı(kdv dahil) = " + this.Fiyat + " TL");
        } else if (oda.getOdaTipi().equals("Couple")) {
            this.Fiyat = (kdv * (coupleOdaDeger)) + coupleOdaDeger + hizmetDeger;
            System.out.println(oda.getOdaNo() + " No'lu odanın fiyatı(kdv dahil) = " + this.Fiyat + " TL");
        } else if (oda.getOdaTipi().equals("Single")) {
            this.Fiyat = (kdv * (singleOdaDeger)) + singleOdaDeger + hizmetDeger;
            System.out.println(oda.getOdaNo() + " No'lu odanın fiyatı(kdv dahil) = " + this.Fiyat + " TL");
        } else {
            System.out.println("Lütfen geçerli oda Giriniz.");
        }
    }

    public double getSuitOdaDeger() {
        return suitOdaDeger;
    }

    public void setSuitOdaDeger(double suitOdaDeger) {
        this.suitOdaDeger = suitOdaDeger;
    }

    public double getCoupleOdaDeger() {
        return coupleOdaDeger;
    }

    public void setCoupleOdaDeger(double coupleOdaDeger) {
        this.coupleOdaDeger = coupleOdaDeger;
    }

    public double getSingleOdaDeger() {
        return singleOdaDeger;
    }

    public void setSingleOdaDeger(double singleOdaDeger) {
        this.singleOdaDeger = singleOdaDeger;
    }

    public double getHizmetDeger() {
        return hizmetDeger;
    }

    public void setHizmetDeger(double hizmetDeger) {
        this.hizmetDeger = hizmetDeger;
    }

    public double getFiyat() {
        return Fiyat;
    }

    public void setFiyat(double Fiyat) {
        this.Fiyat = Fiyat;
    }

    public double getKdv() {
        return kdv;
    }

    public void setKdv(double kdv) {
        this.kdv = kdv;
    }

}
