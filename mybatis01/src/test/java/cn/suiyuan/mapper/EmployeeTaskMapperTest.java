package cn.suiyuan.mapper;

import cn.suiyuan.pojo.EmployeeTask;
import cn.suiyuan.pojo.WorkCard;
import cn.suiyuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmployeeTaskMapperTest {
    @Test
    public void getWorkCard(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmployeeTaskMapper mapper = sqlSession.getMapper(EmployeeTaskMapper.class);
        EmployeeTask employeeTask = mapper.getEmployeeTask(1001);
        System.out.println(employeeTask);
        sqlSession.close();
    }

}
