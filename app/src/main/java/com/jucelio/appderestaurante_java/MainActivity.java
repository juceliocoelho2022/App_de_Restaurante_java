package com.jucelio.appderestaurante_java;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jucelio.appderestaurante_java.adapter.FoodAdapter;
import com.jucelio.appderestaurante_java.databinding.ActivityMainBinding;
import com.jucelio.appderestaurante_java.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Food> foodList = new ArrayList<>();
    private FoodAdapter foodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();
    }

    private void getFood(){
        Food food1 = new Food(
                R.drawable.food1,
                "Food 1",
                "Batatata Frita com frango grelhado",
                "R$50.00"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "Food 2",
                "Sashimi. O prato traz tiras finas de peixe cru, geralmente salmão, atum e outros peixes. ...",
                "R$80.00"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "Food 3",
                "Pure com Frango Grelhado ",
                "R$70.00"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "Food 4",
                "Prato feito com Frango e Batatas Fritas",
                "R$45.00"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "Food 5",
                "Macarrão ao molho",
                "R$49.00"
        );
        foodList.add(food5);
    }

}