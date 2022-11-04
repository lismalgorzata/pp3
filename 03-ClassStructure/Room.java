public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    public Room(int number) {
        this.number = number;
        this.beds = 2;
    }

    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    public void checkIn(String guestName) {
        this.guestName = guestName;
        occupied = true;
    }

    public void checkOut() {
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void displayRoomStatus() {
        System.out.print("Room: " + number + " | ");
        System.out.print("Beds: " + beds + " | ");
        System.out.print("Is Occupied: " + isOccupied() + " | "); //this.occupied
        System.out.println("Guest: " + guestName);
    }

    public String toString() {
        return "Room number: " + this.number + " | " + "Beds: " + this.beds + " | " + "Is Occupied: " + this.occupied + " | " + "Guest: " + guestName;
    }
}
