package com.sparta.schedule.dto;


import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String title;
    private String contents;
    private String manager;
    private Long password;
}
