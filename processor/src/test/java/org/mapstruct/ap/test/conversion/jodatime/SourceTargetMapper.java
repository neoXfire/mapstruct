/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.conversion.jodatime;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceTargetMapper {

    String DATE_TIME_FORMAT = "dd.MM.yyyy HH:mm z";

    String LOCAL_DATE_TIME_FORMAT = "dd.MM.yyyy HH:mm";

    String LOCAL_DATE_FORMAT = "dd.MM.yyyy";

    String LOCAL_TIME_FORMAT = "HH:mm";

    SourceTargetMapper INSTANCE = Mappers.getMapper( SourceTargetMapper.class );

    @Mapping(target = "dateTime", dateFormat = DATE_TIME_FORMAT)
    @Mapping(target = "localDateTime", dateFormat = LOCAL_DATE_TIME_FORMAT)
    @Mapping(target = "localDate", dateFormat = LOCAL_DATE_FORMAT)
    @Mapping(target = "localTime", dateFormat = LOCAL_TIME_FORMAT)
    Target sourceToTarget(Source source);

    Target sourceToTargetDefaultMapping(Source source);

    @Mapping(target = "dateTime", dateFormat = DATE_TIME_FORMAT)
    Target sourceToTargetDateTimeMapped(Source source);

    @Mapping(target = "localDateTime", dateFormat = LOCAL_DATE_TIME_FORMAT)
    Target sourceToTargetLocalDateTimeMapped(Source source);

    @Mapping(target = "localDate", dateFormat = LOCAL_DATE_FORMAT)
    Target sourceToTargetLocalDateMapped(Source source);

    @Mapping(target = "localTime", dateFormat = LOCAL_TIME_FORMAT)
    Target sourceToTargetLocalTimeMapped(Source source);

    @Mapping(target = "dateTime", dateFormat = DATE_TIME_FORMAT)
    @Mapping(target = "localDateTime", dateFormat = LOCAL_DATE_TIME_FORMAT)
    @Mapping(target = "localDate", dateFormat = LOCAL_DATE_FORMAT)
    @Mapping(target = "localTime", dateFormat = LOCAL_TIME_FORMAT)
    Source targetToSource(Target target);

    @Mapping(target = "dateTime", dateFormat = DATE_TIME_FORMAT)
    Source targetToSourceDateTimeMapped(Target target);

    @Mapping(target = "localDateTime", dateFormat = LOCAL_DATE_TIME_FORMAT)
    Source targetToSourceLocalDateTimeMapped(Target target);

    @Mapping(target = "localDate", dateFormat = LOCAL_DATE_FORMAT)
    Source targetToSourceLocalDateMapped(Target target);

    @Mapping(target = "localTime", dateFormat = LOCAL_TIME_FORMAT)
    Source targetToSourceLocalTimeMapped(Target target);

    Source targetToSourceDefaultMapping(Target target);
}
