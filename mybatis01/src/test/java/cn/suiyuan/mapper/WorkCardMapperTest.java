package cn.suiyuan.mapper;

import cn.suiyuan.pojo.WorkCard;
import cn.suiyuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class WorkCardMapperTest {
    @Test
    public void getWorkCard(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        WorkCardMapper mapper = sqlSession.getMapper(WorkCardMapper.class);
        WorkCard WORK_CARD = mapper.getWorkCard(1);
        System.out.println(WORK_CARD);
        sqlSession.close();
    }
}
