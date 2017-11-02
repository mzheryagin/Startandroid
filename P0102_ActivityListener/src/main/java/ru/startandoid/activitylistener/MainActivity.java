package ru.startandoid.activitylistener;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  TextView tvOut;
  Button btnOk;
  Button btnCnl;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tvOut = (TextView) findViewById(R.id.tvOut);
    btnOk = (Button) findViewById(R.id.btnOk);
    btnCnl = (Button) findViewById(R.id.btnCancel) ;

    btnOk.setOnClickListener(this);
    btnCnl.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btnOk:
        tvOut.setText("OK pressed");
        break;
      case R.id.btnCancel:
        tvOut.setText("Cancel pressed");
        break;
    }
  }

}
