public class Day2GitGitHub {
    /*
    1-) git init--> Local repo olusturmak icin; yani  .git  ile klasorumuzun icindeki dosyalari
    iliskilendirmek icin kullanilir.
    2-) git add --> Working Space`den (Yani yerelden) dosyalarimi staging area`ya (yani commitlemek icin beklenen yer) gonderir.
    3-) git status --> Working Space1deki ve staging areadaki durumu gosterir.
    4-) git commit -m"Mesaj"  --> Stageing Area`dan commit store dosyalarimi gondermek icin kullanilir.
       (Commit yani versiyon yani sirim olusturmus olurum)
    5-) git push  --> Uzak Repo`ya (yani remote - Github) gondermek icin kullandigimiz kod.
        Yalniz, git push komutunu direkt kullanmak istersen 1 kez
                git remote add origin -adress-
                git push -u origin master
        Not: Bu iki komutu tek seferde kullandiktan sonra ikinci commitlerim icin sadece git push kullaniriz.
        Not: git log --oneline  -->  commitlerimdeki (yani versiyonlarimdaki) durumu gosterirgit pull
    6-) git pull  -->  Remote (yani uzak repo) dosyalarimizi guncellemek icin kullanilir.
     */

    public static void main(String[] args) {
        System.out.println("Github`i Ogrendik");
    }
}
