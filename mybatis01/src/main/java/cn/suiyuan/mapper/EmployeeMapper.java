package cn.suiyuan.mapper;

import cn.suiyuan.pojo.Employee;
import cn.suiyuan.pojo.EmployeeTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    Employee getEmployee(int id);

    // 查询某个员工的所有任务信息
    List<Employee> getAllTask(@Param("empId") int id);
}
