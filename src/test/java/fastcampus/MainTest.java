package fastcampus;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main(){
        //Given
        String [] args = {"5","2","4","1","3"};

        //When & Then
        Main.main(args);
    }

}