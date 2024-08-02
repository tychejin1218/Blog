package com.example.modelmapper.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Destination1Dto {

  private String name;
  private int age;
  private String hpNo;
  private boolean isTrue;
  private LocalDateTime regDt;
  private boolean isYn;
  private LittleDepartDto departDto;
  private LittleD1DepartDto d1DepartDto;
}