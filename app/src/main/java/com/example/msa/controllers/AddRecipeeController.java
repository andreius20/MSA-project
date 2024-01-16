package com.example.msa.controllers;

import com.example.msa.Classes.Lista;
import com.example.msa.Classes.Reteta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;



@RestController
@RequestMapping("/login")

public class AddRecipeeController {

    @GetMapping
    public ArrayList<Reteta> getListData() {
        Lista a = new Lista();
        return a.getList();
    }

    @PostMapping
    public void AddRecipeeToList(Reteta r) {
        Lista a = new Lista();
        a.AddRecipe(r);
    }

    @PutMapping
    public void showList(Lista a) {
        System.out.println(a);
    }
}
