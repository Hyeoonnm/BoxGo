package kr.ac.kopo.service;

import kr.ac.kopo.dao.DetailDao;
import kr.ac.kopo.dao.ProductDao;
import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Detail;
import kr.ac.kopo.vo.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    private final DetailDao detailDao;

    @Override
    public List<Product> list(Pager pager) {
        int total = productDao.total();

        pager.setTotal(total);

        return productDao.list(pager);
    }

    @Transactional
    @Override
    public void add(Product product) {

        productDao.add(product);

        Detail detail = product.getProductDetail();
        detail.setDetailProductId(product.getProductId());

        detailDao.add(detail);
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
