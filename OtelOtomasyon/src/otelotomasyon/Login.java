/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otelotomasyon;

import java.util.Scanner;

/**
 *
 * @author memo6
 */
public class Login {
    
    public boolean login(Yonetici yonetici) {
        Scanner scan = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.print("Kullanıcı Adı : ");
        kullaniciAdi = scan.next();
        System.out.print("Parola : ");
        parola = scan.next();

        if (yonetici.getKullaniciAd().equals(kullaniciAdi)&& yonetici.getSıfre().equals(parola)) {
            return true;            
        } else {
            return false;           
        }
    }
}
