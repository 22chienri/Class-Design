/*
Ryan Chien
Period 4
Class Design
MyHouseDriver
 */

public class MyHouseDriver {
    public static void main(String[] args) {
        // create song objects
        MyHouse myHouse1 = new MyHouse();
        MyHouse dreamHouse = new MyHouse(20, 12.5, false, "Los Angeles");

        // put both songs into an array
        MyHouse[] houses = {myHouse1, dreamHouse};

        // print out each song in the array
        for (MyHouse house: houses) {
            System.out.println(house);
        }
    }
}
