package com.teltheCall.bones.controller;


import com.teltheCall.bones.model.TestTable;
import com.teltheCall.bones.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class HelloWorld {

    private TestTableService testTableService;

    @Autowired
    public HelloWorld(TestTableService testTableService) {
        this.testTableService = testTableService;
    }

    @GetMapping("/hello")
    public String helloMethod(){

        return "Service is up";
    }

    @GetMapping("/testTable/{testTableId}")
    public ResponseEntity<TestTable> getTestTableById(@PathVariable long testTableId){

        TestTable testTable = testTableService.findById(testTableId);
        if(testTable == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(testTable);
    }

}
