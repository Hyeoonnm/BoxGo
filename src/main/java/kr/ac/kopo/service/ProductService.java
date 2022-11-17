package kr.ac.kopo.service;

import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Product;

import java.util.List;

public interface ProductService {
    List<Product> list(Pager pager);

    void add(Product product);

    void delete(int productId);

    Product item(int productId);

    void update(Product product);
}
