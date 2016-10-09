package com.mountainwind.example.spring;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by peijie on 10/9/2016.
 */

@Mapper
public interface CompanyProductMapper {
    CompanyProductMapper Instance = Mappers.getMapper(CompanyProductMapper.class);

    ProductInfo ProductDetailToProductInfo(ProductDetail detail);



    CompanyProduct CompanyEntityToCompanyProduct(CompanyEntity companyEntity, List<ProductDetail> products);
}
