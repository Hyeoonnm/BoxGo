package kr.ac.kopo.dao;

import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Product;

import java.util.List;

public interface ProductDao {
    int total();

    List<Product> list(Pager pager);

    void update(Product product);

    Product item(int productId);

    void delete(int productId);

    void add(Product product);
}
