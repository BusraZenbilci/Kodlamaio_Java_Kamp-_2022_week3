public class WomanGameCalculator extends GameCalculator{

    public void hesapla() {
        System.out.println("Puanınız : 95");
    }
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
    }
}
