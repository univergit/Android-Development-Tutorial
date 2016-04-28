/*
*
* UNIVER.CITY ÜBUNGSAPP
* http://www.univer.city/
*
* Copyright 2016, Lars Kleinschmidt
*
* Licensed under MIT
*
* Released on: April 28, 2016
*/

package city.univer.blindjerobine.meineapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Du hast mich geklickt!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
