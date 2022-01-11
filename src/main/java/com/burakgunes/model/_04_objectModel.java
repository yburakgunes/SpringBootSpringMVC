package com.burakgunes.model;

import com.burakgunes.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _04_objectModel {


    @GetMapping("/studentjsp")
    public String getObject(Model model) {
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentID(427);
        studentDto.setStudentName("Burak");
        studentDto.setStudentLastName("Gunes");
        //key-value şeklinde çalışıyor
        model.addAttribute("student_key",studentDto);

        return "object";
    }


}
