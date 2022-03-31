package com.megastores.webstore.converter;

import com.megastores.webstore.dataEntities.CartDataEntity;
import com.megastores.webstore.dataEntities.LineItemDataEntity;
import com.megastores.webstore.dataEntities.ProductDataEntity;
import com.megastores.webstore.repo.CartRepository;
import com.megastores.webstore.repo.LineItemRepository;
import com.megastores.webstore.repo.ProductRepository;
import com.webstore.domain.entity.Cart;
import com.webstore.domain.entity.LineItem;
import com.webstore.domain.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Converter<DOMAIN, DATA> {
    DOMAIN toDomainModel(DATA data);

    DATA toDataModel(DOMAIN p);
}

@AllArgsConstructor
@Component
public class CartConverter implements Converter<Cart, CartDataEntity> {
    final LineItemConverter lineItemConverter;
    final CartRepository cartRepository;


    @Override
    public Cart toDomainModel(CartDataEntity cartDataEntity) {
        List<LineItem> lineItems = cartDataEntity
                .getItems()
                .stream()
                .map(l -> lineItemConverter.toDomainModel(l))
                .collect(Collectors.toList());
        return new Cart(cartDataEntity.getId(), new ArrayList<>(lineItems));
    }

    @Override
    public CartDataEntity toDataModel(Cart cart) {
        List<LineItemDataEntity> items = cart.getItems().stream().map(lineItem -> lineItemConverter.toDataModel(lineItem)).collect(Collectors.toList());
        CartDataEntity cartDataEntity = new CartDataEntity(cart.getId(), items);
        cartRepository.save(cartDataEntity);
        return cartDataEntity;
    }
}

@AllArgsConstructor
@Component
class LineItemConverter implements Converter<LineItem, LineItemDataEntity> {
    final ProductConverter productConverter;
    final LineItemRepository lineItemRepository;

    @Override
    public LineItem toDomainModel(LineItemDataEntity l) {
        Product product = productConverter.toDomainModel(l.getProduct());
        return new LineItem(l.getId(), product, l.getQuantity());
    }

    @Override
    public LineItemDataEntity toDataModel(LineItem l) {
        ProductDataEntity product = productConverter.toDataModel(l.getProduct());
        LineItemDataEntity lineItemDataEntity = new LineItemDataEntity(product, l.getId(), l.getQuantity());
        lineItemRepository.save(lineItemDataEntity);
        return lineItemDataEntity;
    }
}

@AllArgsConstructor
@Component
class ProductConverter implements Converter<Product, ProductDataEntity> {
    final ProductRepository productRepository;

    @Override
    public Product toDomainModel(ProductDataEntity p) {
        return new Product(p.getSkuNumber(), p.getName(), p.getDesc(), p.getPrice(), p.getAvailableQuantity(), p.getSeason());
    }

    @Override
    public ProductDataEntity toDataModel(Product p) {
        ProductDataEntity productDataEntity = new ProductDataEntity(p.getSkuNumber(), p.getName(), p.getDesc(), p.getPrice(), p.getAvailableQuantity(), p.getSeason());
        productRepository.save(productDataEntity);
        return productDataEntity;
    }
}