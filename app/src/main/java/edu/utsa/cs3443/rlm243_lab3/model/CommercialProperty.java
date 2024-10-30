package edu.utsa.cs3443.rlm243_lab3.model;
/**
 * extends property class to create commercial property, contains zone, number of units, and number of parking spaces
 * @author Makayla Frank rlm243
 */
public class CommercialProperty extends Property {
    private String zone;
    private int numUnits;
    private int numParking;

    public CommercialProperty(String id, String location, int price, String zone, int numUnits, int numParking) {
        super(id, location, price);
        this.zone = zone;
        this.numUnits = numUnits;
        this.numParking = numParking;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public int getNumUnits() {
        return numUnits;
    }

    public void setNumUnits(int numUnits) {
        this.numUnits = numUnits;
    }
    public int getNumParking() {
        return numParking;
    }
    public void setNumParking(int numParking) {
        this.numParking = numParking;
    }
    @Override
    public String toString() {
        return super.toString() + " - " + zone + " - " + numUnits + " - " + numParking;
    }
}

