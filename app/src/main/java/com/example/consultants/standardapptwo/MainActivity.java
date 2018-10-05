package com.example.consultants.standardapptwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button launch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launch = findViewById(R.id.launhBTN);
        launch.setOnClickListener(this);
    }

    @Override
    public void onClick(View itemView) {
        switch (itemView.getId()){
            case R.id.launhBTN:
                //here we process  action relevant to id
                processIntToBeSent();
                break;
        }
    }

    private void processIntToBeSent() {
        Intent sendInt = getPackageManager().getLaunchIntentForPackage("com.example.consultants.singletopapp");
        if (sendInt != null) {
            startActivity(sendInt);
        }
    }
}
