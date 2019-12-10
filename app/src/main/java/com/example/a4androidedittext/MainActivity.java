package com.example.a4androidedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button butTon1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butTon1 = findViewById(R.id.butTon1);
        editText2 = findViewById(R.id.editText2);
        butTon1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String aaa = editText2.getText().toString();
                Toast.makeText(MainActivity.this, "Bạn Nhập Là: " + aaa, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
