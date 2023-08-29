package com.reactivespringbootproject.controller;

import com.reactivespringbootproject.dto.ProductDto;
import com.reactivespringbootproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public Flux<ProductDto> getAll(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Mono<ProductDto> getById(@PathVariable String id){
        return productService.getProduct(id);
    }

    @GetMapping("/range")
    public Flux<ProductDto> getBetweenRange(@RequestParam("min") double min, @RequestParam("max") double max){
        return productService.getProductsInRange(min,max);
    }

    @PostMapping()
    public Mono<ProductDto> save(@RequestBody Mono<ProductDto> productDtoMono){
        return productService.saveProduct(productDtoMono);
    }

    @PutMapping("/{id}")
    public Mono<ProductDto> save(@RequestBody Mono<ProductDto> productDtoMono,
                                 @PathVariable String id){
        return productService.updateProduct(productDtoMono, id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return productService.deleteProduct(id);
    }
}
