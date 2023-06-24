package com.example.hanifa_maimaitijiang_java2_hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText editText = findViewById(R.id.et1);
        EditText editText2 = findViewById(R.id.et2);
        Button button = findViewById(R.id.button_one);
        TextView textView1 = findViewById(R.id.tv_1);
        TextView textView2 = findViewById(R.id.tv_2);
        TextView textView3 = findViewById(R.id.tv_3);
        TextView textView4 = findViewById(R.id.tv_4);



        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey2));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText.getText().toString().equals("")) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey2));
                } else button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));



            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey2));

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText.getText().toString().equals("")) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey2));
                } else button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("admin@gmail.com") && editText2.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_SHORT).show();
                    editText.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);
                    textView4.setVisibility(View.GONE);
                } else Toast.makeText(MainActivity.this,"Неправильный логин и пароль",Toast.LENGTH_SHORT).show();



            }
        });








    }
}