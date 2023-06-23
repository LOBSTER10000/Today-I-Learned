package org.example;


import camp.nextstep.edu.missionutils.test.NsTest;
import org.assertj.core.api.AbstractThrowableAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomUniqueNumbersInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.*;
class ApplicationTest extends NsTest {
    private static final String Error_Message = "[ERROR]";

    @Test
    void 예외_테스트(){
        assertSimpleTest(()->{runException("1000j");
         assertThat(output().contains(Error_Message));}
        );
    }
    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

    @Test
    @DisplayName("금액이 1000단위로 나누어 떨어지지 않을 경우 예외처리")
    void moneyException(){
        //given
        Application application = new Application();
        int money = 2500;

        //when
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, ()->application.exceptions(money));
        //then
        assertThat(exception.getMessage()).isEqualTo("올바른 금액이 아닙니다");

    }
}