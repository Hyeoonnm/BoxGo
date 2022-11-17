package kr.ac.kopo.service;

import kr.ac.kopo.dao.DomainDao;
import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Domain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DomainServiceImpl implements DomainService {
    private final DomainDao domainDao;

    @Override
    public List<Domain> list(Pager pager) {
        int total = domainDao.total(pager);

        pager.setTotal(total);

        return domainDao.list(pager);
    }

    @Override
    public void add(Domain domain) {
        domainDao.add(domain);
    }

    @Override
    public void delete(int domainId) {
        domainDao.delete(domainId);
    }

    @Override
    public Domain item(int domainId) {
        return domainDao.item(domainId);
    }

    @Override
    public void update(Domain domain) {
        domainDao.update(domain);
    }
}
