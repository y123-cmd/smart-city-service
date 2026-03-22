package com.imbank.smartgrid.smartcity.dto.request;

import com.imbank.smartgrid.smartcity.entity.ProviderName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregationRequest {

    @NotBlank(message = "City name is required")
    @Size(min = 2, max = 50, message = "City name must be between 2 and 50 characters")
    private String cityName;

    @NotNull(message = "Provider name is required")
    private ProviderName providerName;

    @NotNull(message = "Aggregation date is required")
    private LocalDate aggregationDate;
}
