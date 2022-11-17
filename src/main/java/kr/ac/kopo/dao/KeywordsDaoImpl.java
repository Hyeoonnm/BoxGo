package kr.ac.kopo.dao;

import kr.ac.kopo.pager.KeywordsPager;
import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Keywords;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class KeywordsDaoImpl implements KeywordsDao{
    private final SqlSession sql;

    @Override
    public List<Keywords> list(KeywordsPager pager) {

        return sql.selectList("keywords.list", pager);
    }

    @Override
    public void update(Keywords keywords) {
        sql.update("keywords.update", keywords);
    }

    @Override
    public Keywords item(Keywords keywords) {
        return sql.selectOne("keywords.item", keywords);
    }

    @Override
    public void delete(Keywords keywords) {
sql.delete("keywords.delete", keywords);
    }

    @Override
    public void add(Keywords keywords) {
sql.insert("keywords.add", keywords);
    }

    @Override
    public int total(KeywordsPager pager) {

        return sql.selectOne("keywords.total", pager);
    }
}
