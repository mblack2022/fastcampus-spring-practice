package fastcampus;

import fastcampus.logic.BubbleSort;
import fastcampus.logic.JavaSort;
import fastcampus.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[bubbleSort result] " + sort.sort(Arrays.asList(args)));
    }
}