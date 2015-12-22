package com.github.jungletian.plaid_network_error;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.github.jungletian.plaidnonet.Plaidnonet;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.restart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Plaidnonet) findViewById(R.id.stub_no_connection)).start();
            }
        });
    }
}
