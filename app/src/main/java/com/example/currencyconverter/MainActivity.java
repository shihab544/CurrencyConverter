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



        String[] from = {"USD","Canadian Dollar","New Zealand Dollar","Singapore Dollar","Euro","Kuwaiti Dinar","Australian Dollar"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spFrom.setAdapter(ad);


        String[] to = {"India Rupee", "Bangladeshi Taka","Pakistani Rupee","Sri Lankan Rupee","Nepalese Rupee","Maldivian Rufiyaa","Malaysian Ringgit"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spTo.setAdapter(ad1);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());
                    if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "India Rupee") {
                        tot = amount * 70.0;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                        tot = amount * 84.78;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                        tot = amount * 167.60;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount * 185.75;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount * 119.25;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                        tot = amount * 15.40;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "USD" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount * 4.25;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Canadian Dollar


                    else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "India Rupee") {
                        tot = amount * 55.79;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                        tot = amount * 63.21;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                        tot = amount * 125.36;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount * 138.50;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount * 84.49;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                        tot = amount * 11.49;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount * 3.18;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //New Zealand Dollar

                    else if (spFrom.getSelectedItem().toString() == "New Zealand Dollar" && spTo.getSelectedItem().toString() == "India Rupee") {
                        tot = amount * 49.63;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "New Zealand Dollar" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                        tot = amount * 56.28;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "New Zealand Dollar" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                        tot = amount * 111.59;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "New Zealand Dollar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount * 123.29;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "New Zealand Dollar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount * 79.44;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "New Zealand Dollar" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                        tot = amount * 10.23;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "New Zealand Dollar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount * 2.83;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Singapore Dollar

                    else if (spFrom.getSelectedItem().toString() == "Singapore Dollar" && spTo.getSelectedItem().toString() == "India Rupee") {
                        tot = amount * 54.04;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Singapore Dollar" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                        tot = amount * 61.29;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Singapore Dollar" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                        tot = amount * 121.12;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Singapore Dollar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount * 134.21;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Singapore Dollar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount * 86.50;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Singapore Dollar" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                        tot = amount * 11.13;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Singapore Dollar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount * 3.08;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Euro
                    else if (spFrom.getSelectedItem().toString() == "Euro" && spTo.getSelectedItem().toString() == "India Rupee") {
                        tot = amount * 86.89;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Euro" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                        tot = amount * 98.59;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Euro" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                        tot = amount * 194.89;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Euro" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount * 215.96;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Euro" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount * 139.19;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Euro" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                        tot = amount * 17.91;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Euro" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount * 4.95;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Kuwaiti Dinar
                    else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "India Rupee") {
                        tot = amount * 243.59;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                        tot = amount * 276.26;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                        tot = amount * 546.76;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount * 605.86;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount * 390.49;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                        tot = amount * 50.25;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount * 13.90;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Australian Dollar
                    else if (spFrom.getSelectedItem().toString() == "Australian Dollar" && spTo.getSelectedItem().toString() == "India Rupee") {
                        tot = amount * 59.63;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Australian Dollar" && spTo.getSelectedItem().toString() == "Bangladeshi Taka") {
                        tot = amount * 60.28;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Australian Dollar" && spTo.getSelectedItem().toString() == "Pakistani Rupee") {
                        tot = amount * 119.59;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Australian Dollar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount * 127.29;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Australian Dollar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount * 70.44;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Australian Dollar" && spTo.getSelectedItem().toString() == "Maldivian Rufiyaa") {
                        tot = amount * 11.23;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (spFrom.getSelectedItem().toString() == "Australian Dollar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount * 2.83;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Please Enter Input First!", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }


    public void me_reset(View view) {
        ed1.setText(" ");
    }
}
