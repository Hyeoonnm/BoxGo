package kr.ac.kopo.dao;

import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.vo.Domain;

import java.util.List;

public interface DomainDao {
    List<Domain> list(Pager pager);

    void add(Domain domain);

    void delete(int domainId);

    Domain item(int domainId);

    void update(Domain domain);

    int total(Pager pager);
}
