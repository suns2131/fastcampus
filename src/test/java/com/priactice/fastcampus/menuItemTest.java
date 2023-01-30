package com.priactice.fastcampus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class menuItemTest {
    @DisplayName("메뉴항목을 생성한다.")
    @Test
    void createMenuItem() {
        assertThatCode(() -> new MenuItem("만두",5000)).doesNotThrowAnyException();
    }
}
