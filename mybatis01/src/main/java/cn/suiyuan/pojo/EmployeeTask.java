package cn.suiyuan.pojo;

import lombok.Data;
//  这是一个员工任务实体类
@Data
public class EmployeeTask {
    private int id;
    private int empId;//  这里的id指的就是员工id
//    private int taskId;
    private Task task;
    private String taskName;
    private String note;
}
