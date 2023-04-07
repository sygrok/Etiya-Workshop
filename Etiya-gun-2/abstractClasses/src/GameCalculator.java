public abstract class GameCalculator {
    public abstract void hesapla(); // inherit edenler override etmek zorunda

    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }
}
