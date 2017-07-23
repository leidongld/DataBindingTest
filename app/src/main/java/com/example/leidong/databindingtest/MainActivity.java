package com.example.leidong.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.leidong.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private StudentBean sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        sb = new StudentBean();
        sb.setName("张三");
        sb.setAge("25");
        sb.setScore(100);
        binding.setStudent(sb);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.setName("李四");
                sb.setAge("24");
                sb.setScore(101);
            }
        });
    }
}
