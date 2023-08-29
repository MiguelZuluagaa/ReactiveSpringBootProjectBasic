package com.reactivespringbootproject.utils;

import com.reactivespringbootproject.dto.ProductDto;
import com.reactivespringbootproject.entity.ProductEntity;
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
