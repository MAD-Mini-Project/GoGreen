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

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.MyAdapter>{

    ArrayList<Item> requestList;
    Context context;

    public RequestAdapter(Context context,ArrayList<Item> list){
        this.requestList=list;
        this.context=context;
    }

    @NonNull
    @Override
    public RequestAdapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //getting the RecycleView layout we crated & send the view to the MyAdapter class
        View v = LayoutInflater.from(context).inflate(R.layout.newrequestlayout,parent,false);
        return new MyAdapter(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestAdapter.MyAdapter holder, int position) {
        Item item=requestList.get(position);

        //setting taken values on the fields of recyclerView
        holder.item.setText(item.item);
        holder.price.setText(String.valueOf(item.price));
        holder.bank.setText(item.bank);
        holder.account.setText(String.valueOf(item.account));
        holder.address.setText(item.address);
        holder.email.setText(item.email);
        holder.mobile.setText(String.valueOf(item.mobile));
        holder.weight.setText(String.valueOf(item.weight));
        holder.status.setText(String.valueOf(item.status));
        holder.total.setText(String.valueOf(item.total));
    }

    @Override
    public int getItemCount() {
        return requestList.size();
    }

    public static class MyAdapter extends RecyclerView.ViewHolder{

        TextView item,price,bank,account,address,email,mobile,weight,status,total;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);

            //getting the reference of the textViews of recycleView
            item=itemView.findViewById(R.id.RecyItem);
            price=itemView.findViewById(R.id.RecyPrice);
            bank=itemView.findViewById(R.id.RecyBank);
            account=itemView.findViewById(R.id.RecyAccount);
            address=itemView.findViewById(R.id.RecyAddress);
            email=itemView.findViewById(R.id.RecyEmail);
            mobile=itemView.findViewById(R.id.RecyMobile);
            weight=itemView.findViewById(R.id.RecyWeight);
            status=itemView.findViewById(R.id.RecyStatus);
            total=itemView.findViewById(R.id.RecyTotal);
        }
    }
}