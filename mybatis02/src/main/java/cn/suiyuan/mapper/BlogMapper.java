package cn.suiyuan.mapper;

import cn.suiyuan.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 添加数据
    int insertBlog(Blog blog);

    //  通过动态sql进行查询
    List<Blog> queryBlogIf(Map<String,Object> map);
    //  通过<choose>
    List<Blog> queryBlogChoose(Map<String,Object> map);
    // 使用<where>
    List<Blog> queryBlogWhere(Map<String,Object> map);
    // 使用<foreach>遍历闯入的字段集合
    List<Blog> queryBlogForeach(Map<String,Object> map);
}
