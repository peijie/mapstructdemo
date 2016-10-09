package com.mountainwind.example.spring;

import java.util.List;
import java.util.Set;

/**
 * Created by peijie on 10/9/2016.
 */
public class CompanyProduct {


    private String companyId;
    private String companyName;
    List<ProductInfo> products;


    public List<ProductInfo> getProducts() {
        return products;
    }

    public void setProducts(List<ProductInfo> products) {
        this.products = products;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
