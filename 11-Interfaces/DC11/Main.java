public class Main {
    public static void main(String[] args) {
        TV t = new TV();

        /*t.on();
        t.displayStatus();
        t.off();
        t.displayStatus();*/

        t.on();
        t.displayStatus();
        t.displayPrograms();
        t.channelUp();
        t.setChannel(7);
        t.displayStatus();
        t.displayPrograms();
        t.setChannel(14);
        t.displayStatus();
        t.off();
        t.displayStatus();

        /*t.on();
        t.displayStatus();
        t.setChannel(15);
        t.setVolume(7);
        t.displayStatus();
        t.off();
        t.displayStatus();
        */


    }
}
