package com.codinglife.eground.service.product;

import com.codinglife.eground.dto.ProductDto;
import com.codinglife.eground.model.Product;
import com.codinglife.eground.request.AddProductRequest;
import com.codinglife.eground.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(ProductUpdateRequest request, Long id);

    List<Product> getAllProducts();

    List<Product> getProductByCategory(String category);

    List<Product> getProductByBrand(String brand);

    List<Product> getProductsCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String category, String name);

    Long countProductsByBrandAndName(String brand, String name);

    ProductDto convertToDto(Product product);
}
