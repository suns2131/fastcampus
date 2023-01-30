package com.priactice.fastcampus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 음식점에서 음식 주문하는 과정 구현
 * 요구사항
 * 1. 도메인 구성 객체 고민
 *  - 손님, 메뉴판, 요리사, 메뉴1, 메뉴2, 메뉴3..
 * 2. 객체들 간의 관계고민
 *  - 손님  -- 메뉴판
 *  - 손님  -- 요리사
 *  - 요리사 -- 요리
 * 3.동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링
 *  - 손님 -- 손님타입
 *  - 요리 -- 요리타입
 *  - 메뉴판 --메뉴판 타입
 *  - 메뉴 -- 메뉴타입
 *  4. 협력 설계
 *  5. 객체를 포괄하는 타입의 적절한 책임 할당
 */
@DisplayName("사용자 테스트")
public class customerTest {
    @DisplayName("테스트 지정")
    @Test
    void name() {
    }
}
