package com.burakgunes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serial;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class StudentDto implements Serializable{
    @Serial
    private static final long serialVersionUID = 2995644691072222662L;

//    private static Logger log = LoggerFactory.getLogger(StudentDto.class);

    private int studentID;
    private String studentName;
    private String studentLastName;

    public static void main(String[] args) {
        log.error("Merhabalar");
        log.warn("Naber");
        log.info("İyi sen?");
        log.fatal("fatal");
        log.debug("debug");
    }

}
