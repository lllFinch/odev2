public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String OgrenciNo;
    private double gano;
    private final int bolumKodu=141;
    private int sirano=0;

    public Ogrenci() {
        this(null,null,"1988",2.5);
    }

    public Ogrenci(String ad, String bolum) {
        this(ad,bolum,"1919",3.2);
    }

    public Ogrenci(String ad, String bolum, String girisYili, double gano) {
        if (gano<0||gano>4){
            throw new IllegalArgumentException("GANO 0 ile 4 arasında olmalıdır!");
        }
        this.gano=gano;
        this.ad=ad;
        this.bolum=bolum;
        this.girisYili=girisYili;
    }

    public Ogrenci(Ogrenci ogrenci){
        this(ogrenci.ad, ogrenci.bolum,ogrenci.girisYili,ogrenci.gano);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrenciNo() {
        return OgrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        OgrenciNo = ogrenciNo;
    }

    public double getGano() {
        if (gano<0 || gano>4) {
            throw new IllegalArgumentException("GANO 0 ile 4 arasında olmalıdır!");

        }
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String OgrNoHesapla(){
        sirano++;
        if (sirano<10){
            OgrenciNo=""+girisYili+bolumKodu+"00"+sirano;
        }
        else if(sirano<100){
            OgrenciNo=""+girisYili+bolumKodu+"0"+sirano;
        }
        else
            OgrenciNo=OgrenciNo=""+girisYili+bolumKodu+sirano;
        return OgrenciNo;
    }
    public double HarcHesap(int derssayisi){
        return derssayisi*120;
    }
    public double HarcHesaap(int dersSayisi,int uzatilanYil){
        return dersSayisi*120*uzatilanYil;
    }



}