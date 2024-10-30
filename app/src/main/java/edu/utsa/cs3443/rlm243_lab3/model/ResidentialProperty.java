package edu.utsa.cs3443.rlm243_lab3.model;
/**
 * extends property class to create residential property, contains hoa fees, number of bedrooms, and number of bathrooms
 * @author Makayla Frank rlm243
 */
public class ResidentialProperty extends Property
{
    private int hoaFees;
    private int numBedrooms;
    private double numBathrooms;

    public ResidentialProperty(String id, String location, int price, int hoaFees, int numBedrooms, double numBathrooms)
    {
        super(id, location, price);
        this.hoaFees = hoaFees;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }
    public int getHoaFees()
    {
        return hoaFees;
    }
    public void setHoaFees(int hoaFees)
    {
        this.hoaFees=hoaFees;
    }
    public int getNumBedrooms()
    {
        return numBedrooms;
    }
    public void setNumBedrooms(int numBedrooms)
    {
        this.numBedrooms=numBedrooms;
    }
    public double getNumBathrooms()
    {
        return numBathrooms;
    }
    public void setNumBathrooms(double numBathrooms)
    {
        this.numBathrooms=numBathrooms;
    }
    @Override
    public String toString()
    {
        return super.toString() + " - " + hoaFees + " - " + numBedrooms + " - " + numBathrooms;
    }
}
