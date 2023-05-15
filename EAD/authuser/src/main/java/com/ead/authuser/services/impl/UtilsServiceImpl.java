package com.ead.authuser.services.impl;

import com.ead.authuser.services.UtilsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtilsServiceImpl implements UtilsService {

    @Override
    public String createUrlGetAllCoursesByUser(UUID userId, Pageable pageable) {
        return "/courses?userId=" + userId + StringUtils.EMPTY
            .concat("&page=" + pageable.getPageNumber())
            .concat("&size=" + pageable.getPageSize())
            .concat("&sort=" + pageable.getSort().toString().replaceAll(": ", ","));
    }
}
