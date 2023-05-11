package com.ead.authuser.services.impl;

import com.ead.authuser.services.UtilsService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtilsServiceImpl implements UtilsService {

    private final String REQUEST_URI = "http://localhost:8082";

    @Override
    public String createUrlGetAllCoursesByUser(UUID userId, Pageable pageable) {
        return REQUEST_URI
            .concat("/courses?userId=" + userId)
            .concat("&page=" + pageable.getPageNumber())
            .concat("&size=" + pageable.getPageSize())
            .concat("&sort=" + pageable.getSort().toString().replaceAll(": ", ","));
    }
}
