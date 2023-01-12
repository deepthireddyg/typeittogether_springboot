package rocks.zipcode.typeittogether_springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.typeittogether_springboot.entities.Document;
import rocks.zipcode.typeittogether_springboot.repos.DocumentSubmissionRepository;

@RestController
@RequestMapping("/docsubmission")
public class DocumentSubmissionController {

    @Autowired
    DocumentSubmissionRepository repository;

    @CrossOrigin
    @GetMapping
    public Iterable<Document> getDocuments(){
        return repository.findAll();
    }

    @CrossOrigin
    @PostMapping
    public Document create(@RequestBody Document docsub){
        return repository.save(docsub);
    }

}
