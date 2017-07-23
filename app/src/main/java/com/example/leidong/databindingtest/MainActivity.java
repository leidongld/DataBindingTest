package com.example.leidong.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.leidong.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private StudentBean sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        sb = new StudentBean();
        sb.setName("雷栋");
        sb.setAge("25");
        binding.setStudent(sb);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.setName("何依");
                sb.setAge("24");
            }
        });
    }
}
