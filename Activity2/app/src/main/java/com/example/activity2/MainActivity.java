package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText txta,txtb;
    Button btnketqua;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txta=(EditText) findViewById(R.id.txta);
        txtb=(EditText) findViewById(R.id.txtb);
        btnketqua=(Button) findViewById(R.id.btnkq);
        btnketqua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Tạo Intent để mở ResultActivity
                Intent myIntent=new Intent(MainActivity.this, ResultActivity.class);
                //Khai báo Bundle
                Bundle bundle=new Bundle();
                int a=Integer.parseInt(txta.getText().toString());
                int b=Integer.parseInt(txtb.getText().toString());
                //đưa dữ liệu riêng lẻ vào Bundle
                bundle.putInt("soa", a);
                bundle.putInt("sob", b);
                //Đưa Bundle vào Intent
                myIntent.putExtra("MyPackage", bundle);
                //Mở Activity ResultActivity
                startActivity(myIntent);
            }
        });
    }
}