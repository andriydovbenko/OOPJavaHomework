public class WhichCountInstances {
    private static int COUNTER = 0;

    WhichCountInstances() {
        COUNTER++;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }
}
