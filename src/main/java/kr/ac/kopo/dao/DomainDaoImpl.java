package kr.ac.kopo.dao;

import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Domain;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DomainDaoImpl implements DomainDao {

    private final SqlSession sql;

    @Override
    public List<Domain> list(Pager pager) {
        return sql.selectList("domain.list", pager);
    }

    @Override
    public void add(Domain domain) {
        sql.insert("domain.add", domain);
    }

    @Override
    public void delete(int domainId) {
        sql.delete("domain.delete", domainId);
    }

    @Override
    public Domain item(int domainId) {
        return sql.selectOne("domain.item", domainId);
    }

    @Override
    public void update(Domain domain) {
        sql.update("domain.update", domain);
    }

    @Override
    public int total(Pager pager) {
        return sql.selectOne("domain.total", pager);
    }
}
