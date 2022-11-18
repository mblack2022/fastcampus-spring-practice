package springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springpractice.service.SortService;
import springpractice.config.Config;

import java.io.ObjectInputFilter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[bubbleSort result] " + sortService.doSort(Arrays.asList(args)));
    }
}