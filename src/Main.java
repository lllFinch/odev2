public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1= new Ogrenci();
        Ogrenci ogrenci2= new Ogrenci("Gökhan","Bilgisayar");
        Ogrenci ogrenci3= new Ogrenci("Ayşe","Makine","2017",2.5);
        System.out.println("Ogrenciler");
        System.out.println("OGR-1 " + ogrenci1.getAd()+ " "+ ogrenci1.getBolum() + " " + ogrenci1.getGano()+ " " + ogrenci1.getGirisYili());
        System.out.println("OGR-2 " + ogrenci2.getAd()+ " "+ ogrenci2.getBolum() + " " + ogrenci2.getGano()+ " " + ogrenci2.getGirisYili());
        System.out.println("OGR-3 " + ogrenci3.getAd()+ " "+ ogrenci3.getBolum() + " " + ogrenci3.getGano()+ " " + ogrenci3.getGirisYili());
        System.out.println("OGR-1 ogrNo "+ogrenci1.OgrNoHesapla());
        System.out.println("OGR-3 ogrNo "+ogrenci3.OgrNoHesapla());

        System.out.println("OGR-1 Harc "+ogrenci1.HarcHesap(4));
        System.out.println("OGR-2 Harc "+ogrenci2.HarcHesaap(4,3));
    }

}