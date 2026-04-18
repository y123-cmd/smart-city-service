package com.imbank.smartgrid.smartcity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "aggregated_consumption")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregatedConsumption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aggregated_id")
    private Long aggregationId;
    @Column(name = "city_name",nullable = false,length = 50)
    private String cityName;
    @Enumerated(EnumType.STRING)
    @Column(name = "provider_name",nullable = false,length = 20)
    private ProviderName providerName;

    @Column(name = "total_consumption_kwh", nullable = false, precision = 15, scale = 2)
    private BigDecimal totalConsumptionKwh;

    @Column(name = "total_readings", nullable = false)
    private Integer totalReadings;

    @Column(name = "average_consumption", nullable = false, precision = 10, scale = 2)
    private BigDecimal averageConsumption;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal cityTotalConsumptionKwh;

    @Column(name = "aggregation_date", nullable = false)
    private LocalDate aggregationDate;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}

