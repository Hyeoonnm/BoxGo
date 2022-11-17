package kr.ac.kopo.service;

import kr.ac.kopo.pager.KeywordsPager;
import kr.ac.kopo.vo.Keywords;

import java.util.List;

public interface KeywordsService {
    List<Keywords> list(KeywordsPager pager);

    void add(Keywords keywords);

    void delete(Keywords keywords);

    Keywords item(Keywords keywords);

    void update(Keywords keywords);
}
