package dev.shalastra.petclinic.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PetType extends BaseEntity {

    private String name;
}
