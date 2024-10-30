package edu.utsa.cs3443.rlm243_lab3;
/**
 * launches when application is run, implements onclick listener for buttons
 * @author Makayla Frank rlm243
 */
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.rlm243_lab3.model.Listing;
import edu.utsa.cs3443.rlm243_lab3.model.Property;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Listing listing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listing = new Listing();
        listing.loadProperties(this);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        String loc = b.getText().toString();
        Property property = listing.getProperty(loc);
        if (property != null) {
            Toast.makeText(this, "$" + property.getPrice(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Property not found!", Toast.LENGTH_SHORT).show();
        }
    }
}
