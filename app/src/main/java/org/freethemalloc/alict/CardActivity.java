package org.freethemalloc.alict;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Harshana on 7/22/2015.
 */
public class CardActivity extends AppCompatActivity {

    private ImageView personPhoto;
    private TextView  personName;
    private TextView  personAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_layout);
        personPhoto = (ImageView) findViewById(R.id.person_photo);
        personName = (TextView) findViewById(R.id.person_name);
        personAge = (TextView) findViewById(R.id.person_age);
        personPhoto.setImageResource(R.drawable.ic_action_help);
        personName.setText("Harshana Samaranayaka");
        personAge.setText("24 Years");
       }
}
