package com.example.jair.fin.dto;

import java.security.PrivateKey;

/**
 * Created by Jair on 2/9/2017.
 */

public class Category {

    private long cat_id;
    private String cat_name;
    private String cat_description;
    private String budget_name;
    private double budget;
    private User user;

    public Category(){

    }

    public Category(long cat_id, String cat_name, String cat_description, String budget_name, double budget, User user) {
        this.cat_id = cat_id;
        this.cat_name = cat_name;
        this.cat_description = cat_description;
        this.budget_name = budget_name;
        this.budget = budget;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBudget_name() {
        return budget_name;
    }

    public void setBudget_name(String budget_name) {
        this.budget_name = budget_name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public long getCat_id() {
        return cat_id;
    }

    public void setCat_id(long cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getCat_description() {
        return cat_description;
    }

    public void setCat_description(String cat_description) {
        this.cat_description = cat_description;
    }
}
