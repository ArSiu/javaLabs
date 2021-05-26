package org.arsiu.rest.service;

import org.arsiu.rest.dal.TechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.stereotype.Service;
import java.util.List;
import org.arsiu.rest.models.technique.Technique;

@Service
@ApplicationScope
public class TechniqueService {

    @Autowired
    private TechniqueRepository techniqueRepository;

    public Technique addTechnique(final Technique technique) {
        return techniqueRepository.save(technique);
    }

    public Technique updateTechnique(final Technique technique) {
        return techniqueRepository.save(technique);
    }

    public List<Technique> getTechniques() {
        return techniqueRepository.findAll();
    }

    public Technique getTechniqueById(final Integer id) {
        return techniqueRepository.findById(id).orElse(null);
    }

    public void deleteTechniqueById(final Integer id) {
        techniqueRepository.deleteById(id);
    }
}
