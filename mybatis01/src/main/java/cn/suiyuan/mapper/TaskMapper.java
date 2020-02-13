package cn.suiyuan.mapper;

import cn.suiyuan.pojo.Task;

public interface TaskMapper {
    // 通过id 查任务
    Task getTask(int id);
}
