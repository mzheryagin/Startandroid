package ru.startandoid.p0081viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("The f**king text");

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("My butt on =)");
        myBtn.setEnabled(false);

        CheckBox myChB = (CheckBox) findViewById(R.id.myChB);
        myChB.setChecked(true);
    }
}
