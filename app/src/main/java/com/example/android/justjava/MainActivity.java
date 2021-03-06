/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity= 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Calculates the price of the order.
     *
     */
    private int calculatePrice() {
        return quantity * 5;

    }
    private String createOrderSummary (int price){
    String priceMessage= "Name: John Do";
    priceMessage +="\nQuantity: "+ quantity;
    priceMessage += "\nTotal: $"+ calculatePrice();
    priceMessage += "\nThank You!";
    return priceMessage;
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price= calculatePrice();
        displayMessage(createOrderSummary(price));
    }

    public void plus(View view) {

        quantity= quantity+1;
        displayQuantity(quantity);
}

public void minus(View view) {
        quantity= quantity-1;
        displayQuantity(quantity);
}
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);



    }



}




