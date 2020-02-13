package cn.suiyuan.mapper;

import cn.suiyuan.pojo.Employee;
import cn.suiyuan.pojo.EmployeeTask;
import cn.suiyuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmployeeMapperTest {
    @Test
    public void getWorkCard(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.getEmployee(1001);
        System.out.println(employee);
        sqlSession.close();
    }

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employee = mapper.getAllTask(1001);
        for(Employee e:employee){
            System.out.println(e);
        }
        sqlSession.close();
    }
}
