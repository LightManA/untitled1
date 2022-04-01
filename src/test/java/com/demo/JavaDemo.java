package com.demo;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaDemo {

    @Test
    void shouldOpen () {

        // LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));  // пример ручного написания

        // Создание с помощью рефакторинга экстракт - Ctrl+Alt+V (у меня не рабоате пока)
        // LocalDate parsedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        // Postfix Completion 23
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // todo LiMa
        LocalDate localDate = LocalDate.parse("25.03.2022", formatter);

        // commit 2
        assertEquals(DayOfWeek.FRIDAY, localDate.getDayOfWeek());


    }


}
