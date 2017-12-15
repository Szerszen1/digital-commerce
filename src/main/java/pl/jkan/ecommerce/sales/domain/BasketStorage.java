package pl.jkan.ecommerce.sales.domain;

import pl.jkan.ecommerce.canonicalmodel.Identifier;

public interface BasketStorage {
    public Basket loadForCustomer(Identifier id);

    public void store(Identifier id, Basket basket);
}
