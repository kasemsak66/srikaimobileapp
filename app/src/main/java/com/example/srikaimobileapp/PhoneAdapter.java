// PhoneAdapter.java
package com.example.srikaimobileapp; // เปลี่ยน package ตามโครงสร้างโปรเจ็กต์ของคุณ
import com.bumptech.glide.Glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.srikaimobileapp.model.Phone;

import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder> {
    List<Phone> phoneList;
    LayoutInflater inflater;

    public PhoneAdapter(Context context, List<Phone> phoneList) {
        this.inflater = LayoutInflater.from(context);
        this.phoneList = phoneList;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.phone_item, parent, false);
        return new PhoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        Phone phone = phoneList.get(position);
        holder.bind(phone);
    }

    @Override
    public int getItemCount() {
        return phoneList.size();
    }

    static class PhoneViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView priceTextView;
        ImageView phoneImageView;
        Button buyButton;

        public PhoneViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.phone_name);
            priceTextView = itemView.findViewById(R.id.phone_price);
            phoneImageView = itemView.findViewById(R.id.phone_image);
            buyButton = itemView.findViewById(R.id.buy_button);
        }

        @SuppressLint("DefaultLocale")
        public void bind(Phone phone) {
            nameTextView.setText(phone.getName());
            priceTextView.setText(String.format("%.2f บาท", phone.getPrice()));
            Glide.with(phoneImageView.getContext())
                    .load(phone.getImageUrl())
                    .into(phoneImageView);
            buyButton.setOnClickListener(v ->
                    Toast.makeText(v.getContext(), "สั่งซื้อสำเร็จ", Toast.LENGTH_SHORT).show()
            );
        }
    }
}
