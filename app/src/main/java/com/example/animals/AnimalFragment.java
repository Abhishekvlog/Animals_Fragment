package com.example.animals;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class AnimalFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        buildList();
        setRecyclerView();
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recyclerview);
    }
    private void buildList(){
        for (int i =0;i<10;i++){
            Animal animal = new Animal("Ricky",R.drawable.profile);
            animalList.add(animal);
        }
    }
    private void setRecyclerView(){
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        GridLayoutManager grid = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(grid);
        recyclerView.setAdapter(animalAdapter);
    }
}