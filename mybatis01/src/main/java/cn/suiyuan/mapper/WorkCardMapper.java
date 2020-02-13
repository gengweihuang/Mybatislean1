package cn.suiyuan.mapper;

import cn.suiyuan.pojo.WorkCard;

public interface WorkCardMapper {
    // 通过员工编号查工牌
    WorkCard getWorkCard(int empId);

}
