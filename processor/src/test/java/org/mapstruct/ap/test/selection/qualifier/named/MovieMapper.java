/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.selection.qualifier.named;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ap.test.selection.qualifier.bean.GermanRelease;
import org.mapstruct.ap.test.selection.qualifier.bean.OriginalRelease;
import org.mapstruct.ap.test.selection.qualifier.handwritten.SomeOtherMapper;
import org.mapstruct.ap.test.selection.qualifier.handwritten.Titles;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Sjaak Derksen
 */
@Mapper( uses = { Titles.class, SomeOtherMapper.class, KeyWordMapper.class, FactMapper.class } )
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper( MovieMapper.class );

    @Mapping( target = "title", qualifiedByName = { "TitleTranslator", "EnglishToGerman" } )
    GermanRelease toGerman( OriginalRelease movies );

}
