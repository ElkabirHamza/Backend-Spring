package com.dailycodework.sbqrcdoedemo.model.student;

import com.dailycodework.sbqrcdoedemo.utils.QRCodeGenerator;

import com.google.zxing.WriterException;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class ClientController {
	@Autowired
    private ClientService studentService;

    @GetMapping
    public ResponseEntity<List<Client>> getStudents() throws IOException, WriterException {
        List<Client> students = studentService.getStudents();
        if (students.size() != 0){
            for (Client student : students){
                QRCodeGenerator.generateQRCode(student);
            }
        }
        return ResponseEntity.ok(studentService.getStudents());
    }

    @PostMapping
    public Client addStudent(@RequestBody Client student){
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }
}
