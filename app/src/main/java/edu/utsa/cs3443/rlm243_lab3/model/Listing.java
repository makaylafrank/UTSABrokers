package edu.utsa.cs3443.rlm243_lab3.model;
/**
 * extends property class, contains arraylist of properties, and loads properties from csv file
 * @author Makayla Frank rlm243
 */
import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Listing {
    private ArrayList<Property> properties;
    public Listing() {
        properties = new ArrayList<>();
    }

    public void loadProperties(Context context) {
        try {

            InputStream is = context.getAssets().open("listings.csv");
            Scanner scanner = new Scanner(is);
            
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                String id = tokens[0].trim();
                String location = tokens[1].trim();
                int price = Integer.parseInt(tokens[2].trim());
                //residential properties
                if (id.startsWith("rp")) {
                    int hoaFees = Integer.parseInt(tokens[3].trim());
                    int numBedrooms = Integer.parseInt(tokens[4].trim());
                    double numBathrooms = Double.parseDouble(tokens[5].trim());
                    properties.add(new ResidentialProperty(id, location, price, hoaFees, numBedrooms, numBathrooms));
                    //commercial properties
                } else if (id.startsWith("cp")) {
                    String zone = tokens[3].trim();
                    int numUnits = Integer.parseInt(tokens[4].trim());
                    int numParking = Integer.parseInt(tokens[5].trim());
                    properties.add(new CommercialProperty(id, location, price, zone, numUnits, numParking));
                }
            }
            scanner.close();
        } catch (IOException ignored) {
        }
    }

    public Property getProperty(String location) {
        return properties.stream().filter(property -> property.getLocation().equals(location)).findFirst().orElse(null);
    }
}
