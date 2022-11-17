package kr.ac.kopo.service;

import kr.ac.kopo.dao.ProductDao;
import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductDao productDao;

    @Override
    public List<Product> list(Pager pager) {
        int total = productDao.total();

        pager.setTotal(total);

        return productDao.list(pager);
    }

    @Override
    public void add(Product product) {
productDao.add(product);
    }

    @Override
    public void delete(int productId) {
productDao.delete(productId);
    }

    @Override
    public Product item(int productId) {
        return productDao.item(productId);
    }

    @Override
    public void update(Product product) {
productDao.update(product);
    }
}
