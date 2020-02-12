package com.kiseok.springboot.web.web.dto;

import com.kiseok.springboot.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // Given
        String name = "test";
        int amount = 1000;

        // When
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        // Then
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getAmount()).isEqualTo(amount);
    }
}
