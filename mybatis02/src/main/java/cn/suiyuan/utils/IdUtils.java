package cn.suiyuan.utils;

import org.junit.Test;

import java.util.UUID;

public class IdUtils {
    public static String getId(){
        String id = UUID.randomUUID().toString().replace("-", "");
        return id;
    }

    @Test
    public void test(){
        System.out.println(IdUtils.getId());
        // d691503849534720a0d371e3e0fef027 随机字符串
    }
}
