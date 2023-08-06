package com.fastboard.fastboardproject.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

@DisplayName("비즈니스 로직 - 페이지네이션")
@SpringBootTest
class PaginationServiceTest {

    @Autowired
    private PaginationService sut;

    @DisplayName("Given current page number and total pages, return pagination bar numbers")
    @MethodSource("givenCurrentPageNumberAndTotalPages_when_thenReturnPaginationBarNumbers")
    @ParameterizedTest
    void givenCurrentPageNumberAndTotalPages_when_thenReturnPaginationBarNumbers(int currentPageNumber, int totalPages, List<Integer> expected){
        //given

        //when
        List<Integer> actual = sut.getPaginationBarNumbers(currentPageNumber,totalPages);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> givenCurrentPageNumberAndTotalPages_when_thenReturnPaginationBarNumbers(){
        return Stream.of(
                arguments(0, 13, List.of(0, 1, 2, 3, 4)),
                arguments(1, 13, List.of(0, 1, 2, 3, 4)),
                arguments(2, 13, List.of(0, 1, 2, 3, 4)),
                arguments(3, 13, List.of(1, 2, 3, 4, 5)),
                arguments(4, 13, List.of(2, 3, 4, 5, 6)),
                arguments(5, 13, List.of(3, 4, 5, 6, 7)),
                arguments(6, 13, List.of(4, 5, 6, 7, 8)),
                arguments(10, 13, List.of(8, 9, 10, 11, 12)),
                arguments(11, 13, List.of(9, 10, 11, 12)),
                arguments(12, 13, List.of(10, 11, 12))
        );
    }

    @DisplayName("현재 페이지네이션의 바의 길이를 알려준다")
    @Test
    void given_when_then(){

        int barLength = sut.currentBarLength();

        assertThat(barLength).isEqualTo(5);
    }
}
