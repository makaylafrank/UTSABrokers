package edu.utsa.cs3443.rlm243_lab3.model;
/**
 * abstract class for property that contains id, location, and price
 * @author Makayla Frank rlm243
 */
public class Property
{
    private String id;
    private String location;
    private int price;

    public Property(String id, String location, int price)
    {
        this.id = id;
        this.location = location;
        this.price = price;
    }
    public String getID()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    @Override
    public String toString()
    {
        return id + " - " + location + " - $" + price;
    }
}
