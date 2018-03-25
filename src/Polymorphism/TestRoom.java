package Polymorphism;

public class TestRoom {
    public static void main(String[] args) {
        FirstRoom firstRoom = new FirstRoom();
        System.out.println(firstRoom.bulb(2));
        System.out.println(firstRoom.bulb(3,2));
        System.out.println(firstRoom.bulb(2,4,1));

        SecondRoom secondRoom = new SecondRoom();
        System.out.println(secondRoom.bulb(2,4,1));

    }
}
