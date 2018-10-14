/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.injectionstrategy.jsr330.field;

import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.ap.test.injectionstrategy.shared.Gender;
import org.mapstruct.ap.test.injectionstrategy.shared.GenderDto;

/**
 * @author Kevin Grüneberg
 */
@Mapper(config = FieldJsr330Config.class)
public interface GenderJsr330FieldMapper {

    @ValueMapping(source = "MALE", target = "M")
    @ValueMapping(source = "FEMALE", target = "F")
    GenderDto mapToDto(Gender gender);
}
