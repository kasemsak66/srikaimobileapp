// MainActivity.java
package com.example.srikaimobileapp; // เปลี่ยน package ตามโครงสร้างโปรเจ็กต์ของคุณ

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.srikaimobileapp.model.Phone;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Phone> phones = Arrays.asList(
                new Phone("Xiaomi", 9999, "https://static-jaymart.com/ecom/public/2OxFi68xNwBhepdJjkqOXSfngQA.jpg"),
                new Phone("Iphone", 9999, "https://static-jaymart.com/ecom/public/2VNQRjOQYazEYnVqVCyEmtDBVrs.jpg"),
                new Phone("Oppo", 9999, "https://static-jaymart.com/ecom/public/2fwnCGWKjf0REWMPp2WcC0MIDU2.jpg"),
                new Phone("Samsung", 9999, "https://static-jaymart.com/ecom/public/2dOaQDAvvxaYJHgAEA7tvXk5hko.jpg"),
                new Phone("Huawei", 9999, "https://static-jaymart.com/ecom/public/2flSMZp8jQtCUl1yR5CsWn2kyCH.jpg")
        );

        PhoneAdapter adapter = new PhoneAdapter(this, phones);
        recyclerView.setAdapter(adapter);
    }
}
