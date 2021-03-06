package io.axway.iron.core.model.validation;

import io.axway.iron.description.Entity;
import io.axway.iron.description.Unique;

@Entity
interface InvalidNonPublicEntity {

    @Unique
    String id();
}
