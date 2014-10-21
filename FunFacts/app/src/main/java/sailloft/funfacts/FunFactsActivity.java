package sailloft.funfacts;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.graphics.Color.*;


public class FunFactsActivity extends Activity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private factBook mFactBook = new factBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables and assign them the views
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFact = (Button) findViewById(R.id.showFact);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                //Update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFact.setTextColor(color);
            }
        };
        showFact.setOnClickListener(listener);
        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "we arelogging");

    }



}
