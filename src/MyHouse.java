/*
Ryan Chien
Period 4
Class Design
MyHouse
 */

public class MyHouse {
    // initiate variables
    private int bedrooms;
    private double baths;
    private boolean condo;
    private String city;

    // zero-argument constructor
    public MyHouse() {
        bedrooms = 2;
        baths = 1.5;
        condo = true;
        city = "San Clemente";
    }

    // multi-argument constructor
    public MyHouse(int bedrooms, double baths, boolean condo, String city) {
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.condo = condo;
        this.city = city;
    }

    // toString method
    public String toString() {
        String condoString;
        if (condo) {
            condoString = "be";
        } else {
            condoString = "not be";
        }
        String output;
        output = String.format("My home will have %s bedrooms and %s bathrooms.\n\tIt will %s a condo in the city of %s", bedrooms, baths, condoString, city);
        return output;
    }
}
