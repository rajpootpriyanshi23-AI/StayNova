import java.util.*;

class Room {
    int roomNo;
    boolean booked;

    Room(int roomNo) {
        this.roomNo = roomNo;
        this.booked = false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
                new Room(101),
                new Room(102),
                new Room(103)
        };

        while (true) {
            System.out.println("\n1. Book");
            System.out.println("2. Cancel");
            System.out.println("3. View");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter room number: ");
                    int room = sc.nextInt();

                    for (Room r : rooms) {
                        if (r.roomNo == room && !r.booked) {
                            r.booked = true;
                            System.out.println("Room Booked.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter room number: ");
                    room = sc.nextInt();

                    for (Room r : rooms) {
                        if (r.roomNo == room && r.booked) {
                            r.booked = false;
                            System.out.println("Booking Cancelled.");
                        }
                    }
                    break;

                case 3:
                    for (Room r : rooms) {
                        System.out.println(
                                "Room " + r.roomNo +
                                        (r.booked ? " Booked" : " Available")
                        );
                    }
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}