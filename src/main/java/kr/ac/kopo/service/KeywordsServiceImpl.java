package kr.ac.kopo.service;

import kr.ac.kopo.dao.KeywordsDao;
import kr.ac.kopo.pager.KeywordsPager;
import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Keywords;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KeywordsServiceImpl implements KeywordsService {
    private final KeywordsDao keywordsDao;

    @Override
    public List<Keywords> list(KeywordsPager pager) {

        int total = keywordsDao.total(pager);
        pager.setTotal(total);

        return keywordsDao.list(pager);
    }

    @Override
    public void add(Keywords keywords) {
        keywordsDao.add(keywords);
    }

    @Override
    public void delete(Keywords keywords) {
        keywordsDao.delete(keywords);
    }

    @Override
    public Keywords item(Keywords keywords) {
        return keywordsDao.item(keywords);
    }

    @Override
    public void update(Keywords keywords) {
        keywordsDao.update(keywords);
    }

    @Override
    public List<Keywords> list(int keywordsDomainId) {

        KeywordsPager pager = new KeywordsPager();
        pager.setKeywordsDomainId(keywordsDomainId);
        pager.setPerPage(0);

        return keywordsDao.list(pager);
    }
}
