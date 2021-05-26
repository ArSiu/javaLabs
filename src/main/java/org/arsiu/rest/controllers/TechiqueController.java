package org.arsiu.rest.controllers;

import org.arsiu.technique.Technique;
import org.arsiu.rest.service.TechiqueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/technique")

public class TechiqueController {
    @Autowired
    private TechiqueService techniqueService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Technique> getTechique(@PathVariable(name = "id") Integer id) {
        if(techniqueService.getTechnique(id) != null) {
            return new ResponseEntity<Technique>(techniqueService.getTechnique(id), HttpStatus.OK);
        }
        return new ResponseEntity<Technique>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public List<Technique> getTechniques() {
        return techniqueService.getTechniques();
    }

    @PostMapping
    public Technique createTechnique(@RequestBody @Valid  Technique technique) {
        return techniqueService.addTechnique(technique);
    }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Technique> updateTechnique(@Valid @PathVariable("id") int id, @RequestBody Technique items) {
        if (techniqueService.getTechnique(id) != null) {
            return new ResponseEntity<Technique>(techniqueService.updateTechnique(id, items), HttpStatus.OK);
        } else {
            return new ResponseEntity<Technique>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTechniqueById(@PathVariable("id") Integer id) {
        techniqueService.deleteTechniqueById(id);
    }
}
