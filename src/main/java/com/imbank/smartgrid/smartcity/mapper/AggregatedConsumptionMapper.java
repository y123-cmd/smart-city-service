package com.imbank.smartgrid.smartcity.mapper;

import com.imbank.smartgrid.smartcity.dto.request.AggregationRequest;
import com.imbank.smartgrid.smartcity.dto.response.AggregatedConsumptionResponse;
import com.imbank.smartgrid.smartcity.entity.AggregatedConsumption;
import org.springframework.stereotype.Component;

@Component
public class AggregatedConsumptionMapper {
    public AggregatedConsumption toEntity(AggregationRequest request) {
        AggregatedConsumption entity = new AggregatedConsumption();
        entity.setCityName(request.getCityName());
        entity.setProviderName(request.getProviderName());
        entity.setAggregationDate(request.getAggregationDate());
        return entity;

    }
    public AggregatedConsumptionResponse toResponse(AggregatedConsumption entity) {
        AggregatedConsumptionResponse response = new AggregatedConsumptionResponse();
        response.setAggregationId(entity.getAggregationId());
        response.setCityName(entity.getCityName());
        response.setProviderName(entity.getProviderName());
        response.setAggregationDate(entity.getAggregationDate());
        response.setTotalConsumptionKwh(entity.getTotalConsumptionKwh());
        response.setTotalReadings(entity.getTotalReadings());
        response.setAverageConsumption(entity.getAverageConsumption());
        response.setCityTotalConsumptionKwh(entity.getCityTotalConsumptionKwh());
        response.setCreatedAt(entity.getCreatedAt());
        return response;
    }
}
