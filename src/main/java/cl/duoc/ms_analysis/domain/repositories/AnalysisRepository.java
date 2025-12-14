package cl.duoc.ms_analysis.domain.repositories;

import cl.duoc.ms_analysis.domain.entities.AnalysisEntity;
import org.springframework.data.repository.CrudRepository;

public interface AnalysisRepository extends CrudRepository<AnalysisEntity,Long> {
}
