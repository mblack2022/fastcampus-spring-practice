package springpractice.service;

import springpractice.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest{
    private SortService sut = new SortService(new BubbleSort<>());

    @Test
    void test(){
        //Given

        // When
        List<String> actual = sut.doSort(List.of("3","4","1","2"));

        // Then
        assertEquals(List.of("1","2","3","4"), actual);

    }

}