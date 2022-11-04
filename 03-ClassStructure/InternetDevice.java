public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices;

    public InternetDevice(String name){
        this.name = name;
    }

    public void connect() {
        if (!connected) {
           connected = true;
           connectedDevices +=1 ;
        }

    }

    public void disconnect() {
        if (connected){
            connected = false;
            connectedDevices -=1;
        }
    }

    public boolean isConnected() {
        return connected;
    }

    public void displayStatus() {
        System.out.print("Device name: "+ name +" | ");
        System.out.println("Connection status: "+ connected + " | ");
    }

    static void displayConnections() {
        System.out.println("Connected devices: " + connectedDevices);
    }

    public static void main (String[] args){
        InternetDevice d1 = new InternetDevice("PC");
        InternetDevice d2 = new InternetDevice("Laptop");
        InternetDevice d3 = new InternetDevice("Tablet}");
        InternetDevice d4 = new InternetDevice("Smartphone");
        InternetDevice d5 = new InternetDevice("TV");

        d1.connect();
        d2.connect();
        d3.connect();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();

        InternetDevice.displayConnections();
    }
}
