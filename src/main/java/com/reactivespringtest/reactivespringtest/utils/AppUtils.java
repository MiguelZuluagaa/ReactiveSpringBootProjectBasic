package com.reactivespringtest.reactivespringtest.utils;

import com.reactivespringtest.reactivespringtest.dto.ProductDto;
import com.reactivespringtest.reactivespringtest.entity.ProductEntity;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ProductDto entityToDto(ProductEntity productEntity){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productEntity,productDto);
        return productDto;
    }

    public static ProductEntity dtoToEntity(ProductDto productDto){
        ProductEntity productEntity = new ProductEntity();
        BeanUtils.copyProperties(productDto,productEntity);
        return productEntity;
    }
}
