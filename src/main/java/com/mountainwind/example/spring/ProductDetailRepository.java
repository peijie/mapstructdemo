package com.mountainwind.example.spring;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by peijie on 10/1/2016.
 */
public interface ProductDetailRepository extends CrudRepository<ProductDetail, String>{
    List<ProductDetail> findByCompany(CompanyEntity companyEntity);
}
