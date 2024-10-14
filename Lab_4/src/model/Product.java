/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author sailokeshreddynandavarapu
 */
public class Product {
    private String name;
    private int price;
    private int id;
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
        public ArrayList<Feature> getFeatures() {
        return features;
    }
    
    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public Feature addNewFeature(String name, Object value) {
        Feature NewFeature = new Feature(this, name, value);
        features.add(NewFeature);
        return NewFeature;
    }

    @Override
    public String toString() {
        return name;
    }
}
