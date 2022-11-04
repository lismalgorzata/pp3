public class TestRoom {
    public static void main(String... args) {
        Room[] rooms = new Room[6]; //tablica pokoi z samymi nullami

        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);

        /*for (Room room : rooms) {
            room.displayRoomStatus();
        }*/

        displayRoomsReport(rooms); //zamiast for
        System.out.println("--");
        displayRoomsReport(rooms, 3);
        System.out.println("--");
        rooms[1].checkIn("Daro");
        displayAvailableRoomsNumber(rooms);
        displayRoomsReport(rooms);
        System.out.println("--");
        displayVacantBedsNumber(rooms);
    }

    public static void displayRoomsReport(Room[] rooms) { //nie można zawołać z metody statycznej niestatyczną o_O
        for (Room room : rooms) {
            System.out.println(room); //woła toString()
        }
    }

    public static void displayRoomsReport(Room[] rooms, int beds) {
        for (Room room : rooms) {
            if (room.beds == beds) {
                room.displayRoomStatus();
            }
        }
    }

    public static void displayAvailableRoomsNumber(Room[] rooms) {
        int sumVacant = 0;
        int sumOccupied = 0;
        for (Room room : rooms) {
            if (room.isOccupied()){
                sumOccupied = sumOccupied+1;
            } else {
                sumVacant = sumVacant+1;
            }
        }
        System.out.println("Sum of vacant rooms: " + sumVacant);
        System.out.println("Sum of occupied rooms: " + sumOccupied);
    }

    public static void displayVacantBedsNumber(Room[] rooms) {
        int sumVacant = 0;
        for (Room room : rooms) {
            if (!room.isOccupied()){
                sumVacant = sumVacant + room.beds;
            }
        }
        System.out.println("Sum of vacant beds: " + sumVacant);
    }

}
