package com.imbank.smartgrid.smartcity.dto.response;

import com.imbank.smartgrid.smartcity.entity.ProviderName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregatedConsumptionResponse {
    private Long aggregationId;
    private String cityName;
    private ProviderName providerName;
    private BigDecimal totalConsumptionKwh;
    private Integer totalReadings;
    private BigDecimal averageConsumption;
    private BigDecimal cityTotalConsumptionKwh;
    private LocalDate aggregationDate;
    private LocalDateTime createdAt;

}
