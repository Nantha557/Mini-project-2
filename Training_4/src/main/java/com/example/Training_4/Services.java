package com.example.Training_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
    private Repository repository;
    public Model create(Model model){
        return repository.save(model);
    }
    public List<Model> getdetails(){
        return repository.findAll();
    }
    public Model update(Model model){
        return repository.save(model);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
}
