package ru.startandroid.develop.listener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView tvOut;
  Button btnOk;
  Button btnCnl;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tvOut = (TextView) findViewById(R.id.tvOut);
    btnOk = (Button) findViewById(R.id.btnOk);
    btnCnl = (Button) findViewById(R.id.btnCnl);



    View.OnClickListener btnListener = new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        switch (view.getId()) {
          case R.id.btnOk:
            tvOut.setText("Button OK pressed");
            break;
          case R.id.btnCnl:
            tvOut.setText("Button Cancel pressed");
            break;
        }
      }
    };

    btnOk.setOnClickListener(btnListener);
    btnCnl.setOnClickListener(btnListener);
  }
}
