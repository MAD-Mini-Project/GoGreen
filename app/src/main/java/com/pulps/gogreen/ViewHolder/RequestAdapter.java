package com.pulps.gogreen.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pulps.gogreen.Model.Item;
import com.pulps.gogreen.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.MyAdaper>{

    ArrayList<Item> requestList;
    Context context;

    public static class MyAdaper extends RecyclerView.ViewHolder{

        TextView item,price,bank,account,address,email,mobile;

        public MyAdaper(@NonNull View itemView) {
            super(itemView);

            item=itemView.findViewById(R.id.RecyItem);
            price=itemView.findViewById(R.id.RecyPrice);
            bank=itemView.findViewById(R.id.RecyBank);
            account=itemView.findViewById(R.id.RecyAccount);
            address=itemView.findViewById(R.id.RecyAddress);
            email=itemView.findViewById(R.id.RecyEmail);
            mobile=itemView.findViewById(R.id.RecyMobile);
        }
    }

    public RequestAdapter(ArrayList<Item> list,Context con){
        context=con;
        requestList=list;
    }

    @NonNull
    @Override
    public MyAdaper onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.newrequestlayout,parent,false);
        return new MyAdaper(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaper holder, int position) {

        Item item = requestList.get(position);

        holder.item.setText(item.getItem());
        holder.price.setText((int) item.getPrice());
        holder.bank.setText(item.getBank());
        holder.account.setText(item.getAccount());
        holder.address.setText(item.getAddress());
        holder.email.setText(item.getEmail());
        holder.mobile.setText(item.getMobile());
    }

    @Override
    public int getItemCount() {
        return requestList.size();
    }

}