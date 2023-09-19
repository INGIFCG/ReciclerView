package com.example.reciclerview;

import android.telephony.ims.ImsMmTelManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<Item> itemList;

    public ItemClickListener clickListener;
    public void setClickListener(ItemClickListener myListener) {
        this.clickListener=myListener;
    }
    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //create new view Holder for your items // responsable de crear un nuevo viewHolder para sus artículos
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//binds the data from your dataset to the view within the view holder
// vincula los datos de su conjunto de datos a la vista dentro del titular de la vista
        Item item = itemList.get(position);

        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDescription());
        holder.imageView.setImageResource(item.getItemImage());
    }

    @Override
    public int getItemCount() {
        // Returns the total number of items in your dataset
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        ImageView imageView;
        TextView title;
        TextView description;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.title_txt);
            description = itemView.findViewById(R.id.description_txt);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            if (clickListener != null){
                clickListener.onCLick(v,getAdapterPosition());
            }
        }
    }

}
