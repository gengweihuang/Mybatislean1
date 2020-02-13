package cn.suiyuan.mapper;

import cn.suiyuan.pojo.Task;
import cn.suiyuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TaskMapperTest {
    @Test
    public void getTask(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
        Task task = mapper.getTask(1);
        System.out.println(task);
        sqlSession.close();
    }
}
