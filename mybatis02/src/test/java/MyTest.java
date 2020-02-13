import cn.suiyuan.mapper.BlogMapper;
import cn.suiyuan.pojo.Blog;
import cn.suiyuan.utils.IdUtils;
import cn.suiyuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    // 添加数据测试
    @Test
    public void insertBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setAuthor("随缘");
        blog.setTitle("测试标题1");
        blog.setCreateTime(new Date());
        blog.setViews(5000);
        mapper.insertBlog(blog);
        blog.setId(IdUtils.getId());
        blog.setTitle("测试标题2");
        blog.setViews(2000);
        mapper.insertBlog(blog);
        blog.setId(IdUtils.getId());
        blog.setTitle("测试标题3");
        blog.setViews(8000);
        mapper.insertBlog(blog);
        // 在获取sqlSession对象的参数设置自动提交
//        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("title","测试标题1");
        map.put("views",5000);
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog:blogs
             ) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("title","测试标题1");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog:blogs
        ) {
            System.out.println(blog);
        }
        sqlSession.close();
    }


    @Test
    public void queryBlogWhere(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("title","测试标题1");
        List<Blog> blogs = mapper.queryBlogWhere(map);
        for (Blog blog:blogs
        ) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List titles = new ArrayList();
        titles.add(0,"测试标题1");
        titles.add(1,"测试标题2");
        titles.add(2,"测试标题3");
        HashMap map = new HashMap();
        map.put("titleL",titles);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog:blogs
        ) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
