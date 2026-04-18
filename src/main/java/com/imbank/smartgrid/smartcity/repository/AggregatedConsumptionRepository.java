package com.imbank.smartgrid.smartcity.repository;

import com.imbank.smartgrid.smartcity.entity.AggregatedConsumption;
import com.imbank.smartgrid.smartcity.entity.ProviderName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface AggregatedConsumptionRepository extends JpaRepository<AggregatedConsumption, Long> {
    Page<AggregatedConsumption> findByProviderName(ProviderName providerName, Pageable pageable);
    Page<AggregatedConsumption>findByCityName(String cityName, Pageable pageable);
    Page<AggregatedConsumption>findByAggregationDate(LocalDate aggregationDate, Pageable pageable);
    Page<AggregatedConsumption>findByCityNameAndAggregationDate(String cityName, LocalDate aggregationDate, Pageable pageable);
    Page<AggregatedConsumption>findByProviderNameAndAggregationDate(ProviderName providerName, LocalDate aggregationDate, Pageable pageable);
}
