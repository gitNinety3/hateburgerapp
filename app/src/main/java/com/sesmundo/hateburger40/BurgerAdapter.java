package com.sesmundo.hateburger40;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sesmundo.hateburger40.model.HateBurgerFood;

import java.util.ArrayList;

public class BurgerAdapter extends ArrayAdapter<HateBurgerFood> {

    public BurgerAdapter(Activity context, ArrayList<HateBurgerFood> burgerList) {
        super(context, 0, burgerList);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        //TASK 1: GET THE CONTACT OBJECT LOCATED AT THE PROVIDED POSITION IN THE LIST.
        HateBurgerFood currentHateBurgerFood = getItem(position);

        //TASK 2: CHECK IF THE EXISTING VIEW (convertView) IS BEING REUSED: ALREADY IN THE SCRAP PILE - (NOT NULL)
        // OTHERWISE INFLATE THE VIEW.
        View myBurgerItems = convertView;
        if (myBurgerItems == null) {
            myBurgerItems = LayoutInflater.from(getContext()).inflate(R.layout.food_row_item, parent, false);
        }

        //TASK 3: FIND THE TEXTVIEWS AND PHOTO IN THE contact_item LAYOUT.
        //        REFERENCE EACH OF THESE VIEWS IN THE CONTACT ITEM
        TextView name_text = (TextView) myBurgerItems.findViewById(R.id.textViewName);
        TextView price_text = (TextView) myBurgerItems.findViewById(R.id.textViewPrice);
        TextView description_text = (TextView) myBurgerItems.findViewById(R.id.textViewDesciption);
        ImageView photo_image = (ImageView) myBurgerItems.findViewById(R.id.food_image);

        //        ADD CONTENT TO THE CONTACT ITEM
        name_text.setText(currentHateBurgerFood.getName());
        price_text.setText(currentHateBurgerFood.getPrice());
        description_text.setText(currentHateBurgerFood.getDescription());
        photo_image.setImageResource(currentHateBurgerFood.getImageID());

        //TASK 4: RETURN THE CONTACT ITEM POPULATED WITH DATA
        return myBurgerItems;
    }
}
