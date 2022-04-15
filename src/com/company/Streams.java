package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    static List<List<String>> list = new ArrayList<>() {{
        add(List.of("1", "1", "1"));
        add(List.of("2", "2", "2"));
        add(List.of("3", "3"));
        add(List.of("4"));
    }};

    public static void main(String[] args) {
        System.out.println(list);

        long start1 = System.currentTimeMillis();
        Integer accccc = 1000;

        for (List<String> listStr: list){
            accccc = getInteger(accccc, listStr);
        }

        System.out.println(accccc);
        System.out.println("#" + (System.currentTimeMillis() - start1));
        long start2 = System.currentTimeMillis();

        Integer reduce = list.stream()
                .flatMap(list -> list.stream())
                .map(srt -> Integer.valueOf(srt))
                .filter(i -> i % 2 == 0)
                .reduce(1000, (acc, i) -> acc - i);

        System.out.println(reduce);
        System.out.println("#" + (System.currentTimeMillis() - start2));


        Stream.generate(() -> 1)
                .limit(100)
                .forEach(System.out::println);
    }

    private static Integer getInteger(Integer accccc, List<String> listStr) {
        for (String s : listStr) {
            Integer integer = Integer.valueOf(s);

            if (integer % 2  == 0) {
                accccc -= integer;
            }
        }
        return accccc;
    }

    private static String retNull(String s) {

        Optional<String> s1 = Optional.ofNullable(s);
        s1.isEmpty();

        return s1.filter(str -> str.startsWith("1"))
                .map(str -> str.concat("***"))
                .orElse("****");
    }


}
