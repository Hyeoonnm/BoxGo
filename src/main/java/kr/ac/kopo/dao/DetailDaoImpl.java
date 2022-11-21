package kr.ac.kopo.dao;

import kr.ac.kopo.vo.Detail;
import kr.ac.kopo.vo.MobileDetail;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DetailDaoImpl implements DetailDao {
    private final SqlSession sql;

    @Override
    public void add(Detail detail) {
        if (detail instanceof MobileDetail)
            sql.insert("detail.add_mobile", detail);
        else
            sql.insert("detail.add",detail);
    }
}
