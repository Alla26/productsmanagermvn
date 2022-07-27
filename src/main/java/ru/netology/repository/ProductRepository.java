package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {

    private Product[] products = new Product[0];

    public Product[] getProducts() {
        return products;
    }

    public void save(Product product) {                      //сохраняет продукт
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {                          //возвращает все продукты
        Product[] all = getProducts();
        Product[] list = new Product[all.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = all[i];
        }
        return list;
    }

    public Product[] removeById(int id) {                    //удаляет продукты по ID
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tmp;
        return tmp;
    }

}
