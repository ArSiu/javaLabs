package org.arsiu.rest.service;

import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.arsiu.technique.Technique;

@Service
@ApplicationScope
public class TechiqueService {
    private AtomicInteger id = new AtomicInteger(0);

    private final Map<Integer, Technique> TECHNIQUE_MAP = new HashMap<Integer, Technique>();

    public Technique addTechnique(Technique technique) {
        Integer techniqueId = id.incrementAndGet();
        technique.setId(techniqueId);
        TECHNIQUE_MAP.put(techniqueId, technique);
        return technique;
    }

    public Technique updateTechnique(int id, Technique technique) {
        technique.setId(id);
        return TECHNIQUE_MAP.put(id, technique);
    }

    public List<Technique> getTechniques() {
        return TECHNIQUE_MAP.values().stream().collect(Collectors.toList());
    }

    public Technique getTechnique(Integer id) {
        return TECHNIQUE_MAP.get(id);
    }

    public Map<Integer, Technique> getTechniqueMap(){
        return TECHNIQUE_MAP;
    }

    public void deleteTechniqueById(Integer id){
        TECHNIQUE_MAP.remove(id);
    }
}
