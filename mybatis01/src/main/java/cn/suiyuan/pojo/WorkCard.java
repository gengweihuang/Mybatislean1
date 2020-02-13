package cn.suiyuan.pojo;

import lombok.Data;

// 这是一个工牌实体类
@Data
public class WorkCard {
    private int id;
    private int empId; //  这里的id指的就是员工id
    private String realName;
    private String mobile;
    private String position;
    private String note;
}
