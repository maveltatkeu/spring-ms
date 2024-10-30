package se.magnus.microservices.core.product.services;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import se.magnus.api.core.product.Product;
import se.magnus.microservices.core.product.persistence.ProductEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-30T00:31:50+0000",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product entityToApi(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( entity.getProductId() );
        product.setName( entity.getName() );
        product.setWeight( entity.getWeight() );

        return product;
    }

    @Override
    public ProductEntity apiToEntity(Product api) {
        if ( api == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductId( api.getProductId() );
        productEntity.setName( api.getName() );
        productEntity.setWeight( api.getWeight() );

        return productEntity;
    }
}
