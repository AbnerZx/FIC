class Bomba {
    public static void main(String[] args) throws InterruptedException {
        int tempo = 10;
        for (int c = tempo; c >= 0; c = c - 1) {
            System.out.println("Bomba em " + c + " segundos");
            if (c == 0) {
                System.out.println("BOOOMMM!!!!!");
            } else {
                Thread.sleep(1000);
            }
        }
    }
}
