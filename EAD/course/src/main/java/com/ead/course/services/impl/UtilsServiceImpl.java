package com.ead.course.services.impl;

import com.ead.course.services.UtilsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtilsServiceImpl implements UtilsService {

    @Override
    public String createUrlGetAllUsersByCourse(UUID courseId, Pageable pageable) {
        return "/users?courseId=" + courseId + StringUtils.EMPTY
            .concat("&page=" + pageable.getPageNumber())
            .concat("&size=" + pageable.getPageSize())
            .concat("&sort=" + pageable.getSort().toString().replaceAll(": ", ","));
    }
}
