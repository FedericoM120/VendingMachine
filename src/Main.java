public class Main {
    public static void main(String[] args) {
        ComboLock CurrentLock = new ComboLock(36, 24, 36);
        /*CurrentLock.turnRight(23);
        CurrentLock.turnLeft(18);
        CurrentLock.turnRight(9);
        System.out.println(CurrentLock.open());*/
        //CurrentLock.reset();
        CurrentLock.turnRight(36);
        CurrentLock.turnLeft(24);
        CurrentLock.turnRight(36);
        System.out.println(CurrentLock.open());

    }
}
