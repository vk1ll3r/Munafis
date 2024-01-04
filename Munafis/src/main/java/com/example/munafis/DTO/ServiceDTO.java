package com.example.munafis.DTO;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ServiceDTO {


    private Integer provider_id;


    @NotNull(message = "service name cannot be null")
    private String serviceName;

    @NotNull(message = "service type cannot be null")
    private String serviceType;

    @NotNull(message = "service details cannot be null")
    private String serviceDetails;

    @NotNull(message = "price cannot be null")
    private double price;


}
