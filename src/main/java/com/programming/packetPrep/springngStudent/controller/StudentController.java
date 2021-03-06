package com.programming.packetPrep.springngStudent.controller;



import com.programming.packetPrep.springngStudent.dto.StudentDto;
import com.programming.packetPrep.springngStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity createStudent(@RequestBody StudentDto studentDto) {
        studentService.createStudent(studentDto);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity updateStudent(@RequestBody StudentDto studentDto) {
        studentService.updateStudent(studentDto);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<StudentDto>> showAllStudent() {
        return new ResponseEntity<>(studentService.showAllStudent(), HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<StudentDto> getSingleStudent(@PathVariable @RequestBody Long id) {
        return new ResponseEntity<>(studentService.readSingleStudent(id), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteStudent(@PathVariable @RequestBody Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
