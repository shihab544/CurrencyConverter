package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spFrom, spTo;
    EditText ed1;
    Button btnConvert, btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.ed1);
        spFrom = (Spinner) findViewById(R.id.spFrom);
        spTo = (Spinner) findViewById(R.id.spTo);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnReset = (Button) findViewById(R.id.btnReset);



        String[] from = {"USD"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spFrom.setAdapter(ad);


        String[] to = {"India Rupee", "Bangladeshi Taka","Pakistani Rupee","Sri Lankan Rupee","Nepalese Rupee","Maldivian Rufiyaa","Malaysian Ringgit","Indonesian Rupiah","Kuwaiti Dinar","Qatari Rial"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spTo.setAdapter(ad1);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot ;
                Double amount = Double.parseDouble(ed1.getText().toString());
                if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "India Rupee") {
                    tot = amount * 70.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                    tot = amount * 84.78;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                    tot = amount * 167.60;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                    tot = amount * 185.75;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                    tot = amount * 119.25;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                    tot = amount * 15.40;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                    tot = amount * 4.25;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                    tot = amount * 14653.25;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                    tot = amount * 0.31;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                    tot = amount *3.64;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Select First!",Toast.LENGTH_SHORT).show();
                }




            }

        });
    }

    public void me_reset(View view) {
        ed1.setText("");
    }
}