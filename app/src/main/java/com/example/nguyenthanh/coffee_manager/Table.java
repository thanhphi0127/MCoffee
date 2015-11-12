package com.example.nguyenthanh.coffee_manager;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by NguyenThanh on 12/11/2015.
 */
public class Table {
    String TableName;
    int Number;
    Set<Product> products;

    public Table(String tableName, int number) {
        TableName = tableName;
        Number = number;
        this.products = new HashSet<Product>();
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public Set<Product> getPubs() {
        return products;
    }
    public void setProd(Set<Product> prod) {
        this.products = prod;
    }
    //// Viết phương thức addPub(Publication author) để thêm các Publication cho một Author

    public boolean addProd(Product prod) {
        return this.products.add(prod);
    }

}
