package org.arsiu.manager;

import java.util.List;
import java.util.Optional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.arsiu.technique.Technique;

@Getter
@NoArgsConstructor
public final class TechniqueManager {
    private List<Technique> tech;

    public TechniqueManager(final List<Technique> techniques) {
        tech = techniques;
    }

    public void addTechnique(final Technique technique) {
        tech.add(technique);
    }

    public List<Technique> sortByName(final boolean reverse) {
        if (reverse) {
            tech.sort((Technique t1, Technique t2) ->
                    t2.getName().compareTo(t1.getName()));
        } else {
            tech.sort((Technique t1, Technique t2) ->
                    t1.getName().compareTo(t2.getName()));
        }
        return tech;
    }

    public List<Technique> sortByPrice(final boolean reverse) {
        if (reverse) {
            tech.sort((Technique t1, Technique t2) ->
                    Float.compare(t2.getPrice(), t1.getPrice()));
        } else {
            tech.sort((Technique t1, Technique t2) ->
                    Float.compare(t1.getPrice(), t2.getPrice()));
        }
        return tech;
    }

    public Optional<Technique> searchBar(final String search) {
        return tech.stream().filter(t -> t.getName().equals(search)).findAny();
    }

    public void show(final boolean reverse, final List<Technique> techniques) {
        techniques.forEach(System.out::println);
    }
}
