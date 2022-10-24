public abstract class GameCalculator {
    // NOT: abstract bir class ta kesinlikle bir abstract metod olmak zorunda değil
    // sadece tamamlanmış operasyon olmak zorunda
    public abstract void hesapla();
    // benim bir metodum var fakat base class ında içeriğini belirlemek istemiyorum
    // fakat hesapla metodunu ben extends ettigim tüm metodlara zorunlu kılıyorum
    // ama bunu kullanıcı türüne göre her class override edecek

    public final void gameOver() {
        System.out.println("Oyun bitti. ");
    }
    // final anahtar kelimesi: bu metodu diğer classlar kullanırken ezemez, değiştiremez

}
