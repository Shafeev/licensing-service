package ru.mcs.license.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.reactive.WebFluxLinkBuilder;

@Getter
@Setter
@ToString
public class License extends RepresentationModel<License> {
    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
