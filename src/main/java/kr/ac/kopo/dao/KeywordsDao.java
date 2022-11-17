package kr.ac.kopo.dao;

import kr.ac.kopo.pager.KeywordsPager;
import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Keywords;

import java.util.List;

public interface KeywordsDao {
    List<Keywords> list(KeywordsPager pager);

    void update(Keywords keywords);

    Keywords item(Keywords keywords);

    void delete(Keywords keywords);

    void add(Keywords keywords);

    int total(KeywordsPager pager);
}
