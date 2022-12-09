package com.lh.note;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author :lh
 * @Date: 2022-12-09 11:42
 */
public class TestExample {

    @Test
    public void demo() {
        List<String> list = new ArrayList<>();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        list.add("世界加油");

        long count = list.stream().distinct().count();
        System.out.println(count);

    }

    @Test
    public void FilterStreamDemo() {
        List<String> list = Lists.newArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("王五-1");

        Stream<String> stream = list.stream().filter(x -> x.contains("王"));
        stream.forEach(System.out::println);
    }

    @Test
    public void MapStreamDemo() {
        List<String> list = Lists.newArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        Stream<Integer> stream = list.stream().map(String::length);
        stream.forEach(System.out::println);
    }

    @Test
    public void MatchStreamDemo() {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        boolean anyMatchFlag = list.stream().anyMatch(element -> element.contains("王"));
        boolean allMatchFlag = list.stream().allMatch(element -> element.length() > 1);
        boolean noneMatchFlag = list.stream().noneMatch(element -> element.endsWith("沉"));
        System.out.println(anyMatchFlag);
        System.out.println(allMatchFlag);
        System.out.println(noneMatchFlag);
    }

    @Test
    public void ReduceStreamDemo() {

    }
}
