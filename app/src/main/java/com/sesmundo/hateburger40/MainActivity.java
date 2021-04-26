package com.sesmundo.hateburger40;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sesmundo.hateburger40.adapter.HateBurgerFoodAdapter;
import com.sesmundo.hateburger40.model.HateBurgerFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /////////////////////////////////////////////////////////////////////////////////////////
    ///                          RECYCLER VIEWS AND FOOD ADAPTERS                         ///
    /////////////////////////////////////////////////////////////////////////////////////////
    RecyclerView popularRecycler1, popularRecycler2, popularRecycler3, popularRecycler4, popularRecycler5;
    HateBurgerFoodAdapter hateBurgerFoodAdapter1, hateBurgerFoodAdapter2, hateBurgerFoodAdapter3, hateBurgerFoodAdapter4, hateBurgerFoodAdapter5;

    /////////////////////////////////////////////////////////////////////////////////////////
    ///                          BUTTONS AND TEXT-VIEW FOR DISPLAY                        ///
    /////////////////////////////////////////////////////////////////////////////////////////

    // BUTTONS FOR INCREMENTING/DECREMENTING THE ITEMS
    Button inc, dec;

    // COUNTER FOR INCREMENTING/DECREMENTING THE ITEMS
    TextView textViewQty;

    // COUNT
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        ///////////////////////////////////////////////////////////////
        //                   INITIATE THEM BUTTONS                   //
        ///////////////////////////////////////////////////////////////
        // INCREASING BUTTON
        inc = findViewById(R.id.increment);
        // INCREASING BUTTON
        dec = findViewById(R.id.decrement);
        // DISPLAYING BURGER QUANTITY
        textViewQty = findViewById(R.id.textViewQty);

        // INCREMENT BUTTON
        inc.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                count++;
                textViewQty.setText("" + count);
            }
        });

        // DECREMENT BUTTON
        dec.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                count--;
                if (count<0) {
                    count = 0;
                }
                textViewQty.setText("" + count);
            }
        });

         */






        /////////////////////////////////////////////////////////////////////////////////////////
        ///                          ARRAY LIST OF EACH ITEM CATEGORY                         ///
        /////////////////////////////////////////////////////////////////////////////////////////
        List<HateBurgerFood> hateBurgerFoodList = new ArrayList<>();
        List<HateBurgerFood> sideFoodList = new ArrayList<>();
        List<HateBurgerFood> drinkFoodList = new ArrayList<>();
        List<HateBurgerFood> sauceFoodList = new ArrayList<>();
        List<HateBurgerFood> extraFoodList = new ArrayList<>();

        //////////////////////////////////////////////////
        ///                   BURGERS                  ///
        //////////////////////////////////////////////////
        hateBurgerFoodList.add(new HateBurgerFood("Regular Cheeseburger", "9", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Regular Hamburger", "8", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Spicy Cheeseburger", "13", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Spicy Hamburger", "12", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Vegan Cheeseburger", "9", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Vegan Hamburger", "8", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Spicy Vegan Cheeseburger", "13", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Spicy Vegan Hamburger", "12", "-", R.drawable.burger));
        hateBurgerFoodList.add(new HateBurgerFood("Regular Chicken Burger", "10", "-", R.drawable.chicken));
        hateBurgerFoodList.add(new HateBurgerFood("Spicy Chicken Burger", "10", "-", R.drawable.chicken));
        hateBurgerFoodList.add(new HateBurgerFood("Honey Chicken Burger", "10", "-", R.drawable.chicken));
        hateBurgerFoodList.add(new HateBurgerFood("Extra Patty", "3", "-", R.drawable.extra_patty));

        //////////////////////////////////////////////////
        ///                   SIDES                    ///
        //////////////////////////////////////////////////
        sideFoodList.add(new HateBurgerFood("Large Fries", "4", "-", R.drawable.fries));
        sideFoodList.add(new HateBurgerFood("Regular Hamburger", "4", "-", R.drawable.salad));

        //////////////////////////////////////////////////
        ///                   DRINKS                   ///
        //////////////////////////////////////////////////
        drinkFoodList.add(new HateBurgerFood("Coke", "3", "-", R.drawable.coke));
        drinkFoodList.add(new HateBurgerFood("Cherry Coke", "3", "-", R.drawable.cherry_coke));
        drinkFoodList.add(new HateBurgerFood("Diet Coke", "3", "-", R.drawable.diet_coke));
        drinkFoodList.add(new HateBurgerFood("Dr Pepper", "3", "-", R.drawable.dr_pepper));
        drinkFoodList.add(new HateBurgerFood("Fanta", "3", "-", R.drawable.fanta));
        drinkFoodList.add(new HateBurgerFood("Sweet Tea", "3", "-", R.drawable.sweet_tea));
        drinkFoodList.add(new HateBurgerFood("Un-Sweet Tea", "3", "-", R.drawable.unsweet_tea));
        drinkFoodList.add(new HateBurgerFood("Raspberry Tea", "3", "-", R.drawable.raspberry_tea));
        drinkFoodList.add(new HateBurgerFood("Lemonade Tea", "3", "-", R.drawable.lemonade));

        //////////////////////////////////////////////////
        ///                   SAUCES                   ///
        //////////////////////////////////////////////////
        sauceFoodList.add(new HateBurgerFood("Ketchup", "Free", "-", R.drawable.ketchup));
        sauceFoodList.add(new HateBurgerFood("Mustard", "Free", "-", R.drawable.mustard));
        sauceFoodList.add(new HateBurgerFood("BBQ", "Free", "-", R.drawable.bbq));
        sauceFoodList.add(new HateBurgerFood("Hate Sauce", "1", "-", R.drawable.hate_sauce));
        sauceFoodList.add(new HateBurgerFood("Burger Sauce", "1", "-", R.drawable.burger_sauce));
        sauceFoodList.add(new HateBurgerFood("Ranch Sauce", "1", "-", R.drawable.ranch));

        //////////////////////////////////////////////////
        ///                   EXTRAS                   ///
        //////////////////////////////////////////////////
        extraFoodList.add(new HateBurgerFood("SM T-SHIRT", "10", "-", R.drawable.shirt));
        extraFoodList.add(new HateBurgerFood("M  T-SHIRT", "10", "-", R.drawable.shirt));
        extraFoodList.add(new HateBurgerFood("LG T-SHIRT", "10", "-", R.drawable.shirt));
        extraFoodList.add(new HateBurgerFood("XL T-SHIRT", "10", "-", R.drawable.shirt));


        setPopularRecycler1(hateBurgerFoodList);
        setPopularRecycler2(sideFoodList);
        setPopularRecycler3(drinkFoodList);
        setPopularRecycler4(sauceFoodList);
        setPopularRecycler5(extraFoodList);

    }

    //////////////////////////////////////////////////
    ///                   BURGERS                  ///
    //////////////////////////////////////////////////
    private void setPopularRecycler1(List<HateBurgerFood> hateBurgerFoodList) {

        popularRecycler1 = findViewById(R.id.popular_recycler1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler1.setLayoutManager(layoutManager);
        hateBurgerFoodAdapter1 = new HateBurgerFoodAdapter(this, hateBurgerFoodList);
        popularRecycler1.setAdapter(hateBurgerFoodAdapter1);

    }

    //////////////////////////////////////////////////
    ///                   SIDES                    ///
    //////////////////////////////////////////////////
    private void setPopularRecycler2(List<HateBurgerFood> sideFoodList) {

        popularRecycler2 = findViewById(R.id.popular_recycler2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler2.setLayoutManager(layoutManager);
        hateBurgerFoodAdapter2 = new HateBurgerFoodAdapter(this, sideFoodList);
        popularRecycler2.setAdapter(hateBurgerFoodAdapter2);

    }

    //////////////////////////////////////////////////
    ///                   DRINKS                   ///
    //////////////////////////////////////////////////
    private void setPopularRecycler3(List<HateBurgerFood> drinkFoodList) {

        popularRecycler3 = findViewById(R.id.popular_recycler3);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler3.setLayoutManager(layoutManager);
        hateBurgerFoodAdapter3 = new HateBurgerFoodAdapter(this, drinkFoodList);
        popularRecycler3.setAdapter(hateBurgerFoodAdapter3);

    }

    //////////////////////////////////////////////////
    ///                   SAUCES                   ///
    //////////////////////////////////////////////////
    private void setPopularRecycler4(List<HateBurgerFood> sauceFoodList) {

        popularRecycler4 = findViewById(R.id.popular_recycler4);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler4.setLayoutManager(layoutManager);
        hateBurgerFoodAdapter4 = new HateBurgerFoodAdapter(this, sauceFoodList);
        popularRecycler4.setAdapter(hateBurgerFoodAdapter4);

    }

    //////////////////////////////////////////////////
    ///                   EXTRAS                   ///
    //////////////////////////////////////////////////
    private void setPopularRecycler5(List<HateBurgerFood> extraFoodList) {

        popularRecycler5 = findViewById(R.id.popular_recycler5);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler5.setLayoutManager(layoutManager);
        hateBurgerFoodAdapter5 = new HateBurgerFoodAdapter(this, extraFoodList);
        popularRecycler5.setAdapter(hateBurgerFoodAdapter5);

    }

}