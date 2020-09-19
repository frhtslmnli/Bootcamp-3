package org.kodluyoruz.bootcamp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountTests {

    WordCount sut = new WordCount();

    @BeforeEach
    public void cleanSut(){
        sut.myString="";
    }

    @Test
    public void it_should_throw_illegal_argument_exception_when_string_is_empty(){
        //Arrange

        //Act
        Throwable throwable = catchThrowable(() -> WordCount.countUniques(sut.myString));


        //Assert
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    public void it_should_return_1(){
        //Arrange

        sut.myString="This";

        //Act
        int result = WordCount.countUniques(sut.myString);


        //Assert
        assertEquals(result,1);

    }

    @Test
    public void it_should_return_4(){
        //Arrange

        sut.myString="this is a test";

        //Act
        int result = WordCount.countUniques(sut.myString);


        //Assert
        assertEquals(result,4);

    }
    @Test
    public void it_should_return_6(){
        //Arrange

        sut.myString="this is a test and a good test";

        //Act
        int result = WordCount.countUniques(sut.myString);


        //Assert
        assertEquals(result,6);

    }
    @Test
    public void it_should_ignore_dots_and_commas_and_return_6(){
        //Arrange

        sut.myString="th.is is a te,s.t an.d a go,od te.st";

        //Act
        int result = WordCount.countUniques(sut.myString);


        //Assert
        assertEquals(result,6);
    }
    @Test
    public void it_should_ignore_capitalization_and_return_4(){
        //Arrange

        sut.myString="tHiS Is A TeSt";

        //Act
        int result = WordCount.countUniques(sut.myString);


        //Assert
        assertEquals(result,4);
    }

}
