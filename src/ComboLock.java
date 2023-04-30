public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int dial = 0;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;

    }

    public void reset() {
        dial = 0;
    }

    public void turnLeft(int ticks) {
        dial = (dial - ticks + 40) % 40;
    }

    public void turnRight(int ticks) {
        dial = (dial + ticks) % 40;
        if (dial > 39) {
            reset();
        }
    }

    public boolean open() {
        if (dial == secret1){
            turnLeft(secret2);
            if (dial == secret2){
                turnRight(secret3);
                if (dial == secret3) {
                    reset();
                    return true;
                    }
                }
            }
        reset();
        return false;
        }
    }
