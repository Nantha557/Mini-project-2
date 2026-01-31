package com.example.Training_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/Details")
public class Controller {
    @Autowired
    public Services services;
    @GetMapping()
    ResponseEntity<List<Model>> show(){
        try {
            List<Model> showing=services.getdetails();
            return new ResponseEntity<List<Model>>(showing, HttpStatus.OK);
        }
        catch (RuntimeException exception){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/create")
    ResponseEntity<Model> create(@RequestBody Model model){
        Model creating = services.create(model);
        return new ResponseEntity<>(creating,HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    ResponseEntity<Model> update(@PathVariable Long id, @RequestBody Model model) {
        model.setId(id);
        Model updating = services.update(model);
        return new ResponseEntity<>(updating, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/{id}")
    void deleting(@PathVariable Long id){
        services.delete(id);
    }

}
