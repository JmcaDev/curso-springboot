package com.devtalles.my_portfolio_backend.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
  private Long id;
  private String degree;
  private String institution;
  private LocalDate starDate;
  private LocalDate endDate;
  private String description;
  private Long personalInfoId;
}
