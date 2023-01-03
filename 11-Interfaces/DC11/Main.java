public class Main {
    public static void main(String[] args) {
        TV t = new TV();

        t.on();
        t.displayStatus();
        t.off();
        t.displayStatus();

        t.on();
        t.displayStatus();
        t.channelUp();
        t.setChannel(7);
        t.setChannel(142);
        t.displayStatus();
        t.off();
        t.displayStatus();

        t.on();
        t.displayStatus();
        t.setChannel(15);
        t.setVolume(7);
        t.displayStatus();
        t.off();
        t.displayStatus();
    }
}
