public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    public Room(int number) {
        this.number = number;
        beds = 2;
    }

    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    public void checkIn(String guestName) {
        occupied = true;
    }

    public void checkOut() {
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void displayStatus() {
        System.out.print("Room: " + number + " | ");
        System.out.print("Beds: " + beds + " | ");
        System.out.println("Guest: " + guestName);
    }
}
