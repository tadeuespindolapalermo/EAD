package com.ead.course.clients;

import com.ead.course.dtos.ResponsePageDto;
import com.ead.course.dtos.UserDto;
import com.ead.course.services.UtilsService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Log4j2
@Component
public class CourseClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UtilsService utilsService;

    private final String REQUEST_URI = "http://localhost:8087";
    private final String REQUEST_URL_AUTHUSER = StringUtils.EMPTY;

    public Page<UserDto> getAllUsersByCourse(UUID courseId, Pageable pageable){
        List<UserDto> searchResult;
        ResponseEntity<ResponsePageDto<UserDto>> result = null;
        String url = utilsService.createUrlGetAllUsersByCourse(courseId, pageable);

        log.debug("Request URL: {} ", url);
        log.info("Request URL: {} ", url);

        try{
            ParameterizedTypeReference<ResponsePageDto<UserDto>> responseType = new ParameterizedTypeReference<>() {};
            result = restTemplate.exchange(url, HttpMethod.GET, null, responseType);
            searchResult = result.getBody().getContent();
            log.debug("Response Number of Elements: {} ", searchResult.size());
        } catch (HttpStatusCodeException e){
            log.error("Error request /courses {} ", e);
        }

        log.info("Ending request /users courseId {} ", courseId);

        return result.getBody();
    }
}
