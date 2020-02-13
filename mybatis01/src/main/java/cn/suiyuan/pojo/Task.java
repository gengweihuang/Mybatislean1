package cn.suiyuan.pojo;

import lombok.Data;

// 任务
@Data
public class Task {
    private int id;
    private String title;
    private String content;
    private String note;
}
