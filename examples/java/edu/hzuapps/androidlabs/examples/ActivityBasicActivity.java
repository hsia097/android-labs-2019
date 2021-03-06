package edu.hzuapps.androidlabs.examples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.hzuapps.androidlabs.BackActivity;
import edu.hzuapps.androidlabs.R;

public class ActivityBasicActivity extends BackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_basic);

        final Activity thisActivity = this;

        Button btnOpen = (Button) findViewById(R.id.button_open);

        View view = findViewById(R.id.button_open);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thisActivity, ActivityBasic2Activity.class);
                thisActivity.startActivity(intent);
                //thisActivity.startActivityForResult(intent, 2016);
            }
        });

    }
}
