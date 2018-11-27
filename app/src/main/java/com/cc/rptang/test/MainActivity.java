package com.cc.rptang.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.billy.cc.core.component.CC;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    List<String> stringList = new ArrayList<>();

    private TextView btn_jump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        btn_jump = (TextView) findViewById(R.id.btn_jump);
        btn_jump.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                CC.obtainBuilder("ComponentA")
                        .setActionName("showMainActivity")
                        .build().call();
            }
        });
    }
}
