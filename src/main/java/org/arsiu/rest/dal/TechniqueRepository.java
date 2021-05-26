package org.arsiu.rest.dal;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.arsiu.rest.models.technique.Technique;

@Repository
public interface TechniqueRepository extends JpaRepository<Technique,Integer> {

}
