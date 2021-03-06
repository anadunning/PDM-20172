package com.example.toronto.ifpb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMessage = (TextView)findViewById(R.id.tvMainMessage);
        this.btnOk = (Button)findViewById(R.id.btnMainOk);

            this.btnOk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    MainActivity.this.tvMessage.setText("IFPB");
                }

            });

        this.btnOk.setOnClickListener(new OnClickBotao());
    }

    private class OnClickBotao implements View.OnClickListener{
        @Override
        public void onClick(View view){
            MainActivity.this.tvMessage.setText("IFPB");
        }
    }
}
