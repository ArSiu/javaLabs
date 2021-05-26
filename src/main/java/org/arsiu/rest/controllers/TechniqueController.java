package org.arsiu.rest.controllers;

import org.arsiu.rest.exception.technique.not.found.TechniqueNotFoundException;
import org.arsiu.rest.models.technique.Technique;
import org.arsiu.rest.service.TechniqueService;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
import java.util.List;
import org.slf4j.Logger;

@RestController
@RequestMapping(path = "/technique")

public class TechniqueController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TechniqueController.class);

    @Autowired
    private TechniqueService techniqueService;

    @PostMapping
    public ResponseEntity<Technique> createTechnique(@Valid @RequestBody final Technique technique) {
        LOGGER.info("Added new technique");
        return new ResponseEntity<Technique>(techniqueService.addTechnique(technique), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Technique> updateTechnique(
            @PathVariable("id") final int id,
            @Valid @RequestBody final Technique technique) {

        if (techniqueService.getTechniqueById(id) == null) {
            LOGGER.error("Can't put(updateTechnique) an technique with non-existing id: " + id);
            throw new TechniqueNotFoundException("Can't put(updateTechnique) an technique with non-existing id: " + id);
        }
        LOGGER.info("Successfully updated technique with id: " + id);
        technique.setId(id);
        return new ResponseEntity<Technique>(techniqueService.updateTechnique(technique), HttpStatus.OK);

    }


    @GetMapping
    public ResponseEntity<List<Technique>> getTechniques() {
        LOGGER.info("Gave away all Technique");
        return new ResponseEntity<List<Technique>>(techniqueService.getTechniques(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Technique> getTechnique(@PathVariable(name = "id") final Integer id) {
        if (techniqueService.getTechniqueById(id) == null) {
            LOGGER.error("Can't get(getTechnique) an technique with non-existing id: " + id);
            throw new TechniqueNotFoundException("Can't get(getTechnique) an technique with non-existing id: " + id);
        }
        LOGGER.info("Successfully get an technique with id: " + id);
        return new ResponseEntity<Technique>(techniqueService.getTechniqueById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Technique> deleteTechniqueById(@PathVariable("id") final Integer id) {
        if (techniqueService.getTechniqueById(id) == null) {
            LOGGER.error("Can't delete(deleteTechniqueById) an technique with non-existing id: " + id);
            throw new TechniqueNotFoundException("Can't delete(deleteTechniqueById) an technique with non-existing id: " + id);
        }
        LOGGER.info("Successfully deleted technique with id: " + id);
        techniqueService.deleteTechniqueById(id);
        return ResponseEntity.noContent().build();
    }

}
