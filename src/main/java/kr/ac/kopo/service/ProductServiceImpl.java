package kr.ac.kopo.service;

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

    }

    @Override
    public void delete(int productId) {

    }

    @Override
    public Product item(int productId) {
        return null;
    }

    @Override
    public void update(Product product) {

    }
}
