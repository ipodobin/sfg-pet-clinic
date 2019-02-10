package org.vsoft.vspetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class TestBootstrap implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        List<String> list = new ArrayList<>();
        list.add("Ala");
        list.add("ma");
        list.add(null);
        list.add("kota");

        String result = "";
        List<String> list2 = list.stream()
                .filter(Objects::nonNull)
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList());
//                .collect(Collectors.joining(Collectors.joining(",")));

        System.out.println(result);
    }
}
