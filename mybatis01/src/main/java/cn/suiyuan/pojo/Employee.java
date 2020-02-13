package cn.suiyuan.pojo;

import lombok.Data;

import java.util.List;

/***
*
*
* @author suiyuan
* @date 2020/2/10 22:12
*  这是一个员工实体类
 *  利用lombok进行简写
 *
*/
@Data
public class Employee {
    private int id; //  这里的id指的就是员工id
    private String realName;
    private int sex;
    private String mobile;
    private String position;
    private String note;
    private WorkCard workCard;
    private List<EmployeeTask> employeeTaskList;
}
