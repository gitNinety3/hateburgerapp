package com.sesmundo.hateburger40.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sesmundo.hateburger40.R;
import com.sesmundo.hateburger40.model.HateBurgerFood;

import java.util.List;


public class HateBurgerFoodAdapter extends RecyclerView.Adapter<HateBurgerFoodAdapter.PopularFoodViewHolder> {

    Context context;
    List<HateBurgerFood> hateBurgerFoodList;

    public HateBurgerFoodAdapter(Context context, List<HateBurgerFood> hateBurgerFoodList) {
        this.context = context;
        this.hateBurgerFoodList = hateBurgerFoodList;
    }

    @NonNull
    @Override
    public PopularFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.food_row_item, parent, false);
        return new PopularFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(hateBurgerFoodList.get(position).getImageID());
        holder.name.setText(hateBurgerFoodList.get(position).getName());
        holder.price.setText(hateBurgerFoodList.get(position).getPrice());
        holder.description.setText(hateBurgerFoodList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return hateBurgerFoodList.size();
    }

    public static final class PopularFoodViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView name, price, description;

        public PopularFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            name = itemView.findViewById(R.id.textViewName);
            price = itemView.findViewById(R.id.textViewPrice);
            description = itemView.findViewById(R.id.textViewDesciption);
        }
    }

}
