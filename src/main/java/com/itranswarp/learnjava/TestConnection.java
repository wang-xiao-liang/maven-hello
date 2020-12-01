package com.itranswarp.learnjava;

import java.util.stream.Stream;

/**
 * @author wangxiaoliang
 * @version 1.0
 * @package com.itranswarp.learnjava
 * @date 2020/7/21 16:59
 * @description TODO
 */
public class TestConnection {


    public static void main(String[] args) {


        Integer reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce(0, (pre, next) -> pre + next);
        System.out.println(reduce);


    }
}
