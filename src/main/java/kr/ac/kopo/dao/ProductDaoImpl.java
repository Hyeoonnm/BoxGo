package kr.ac.kopo.dao;

import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Product;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao {

    private final SqlSession sql;

    @Override
    public int total() {
        return sql.selectOne("product.total");
    }

    @Override
    public List<Product> list(Pager pager) {
        return sql.selectList("product.list", pager);
    }

    @Override
    public void update(Product product) {
        sql.update("product.update", product);
    }

    @Override
    public Product item(int productId) {
        return sql.selectOne("product.item", productId);
    }

    @Override
    public void delete(int productId) {
        sql.delete("product.delete", productId);
    }

    @Override
    public void add(Product product) {
        sql.insert("product.add", product);
    }
}
