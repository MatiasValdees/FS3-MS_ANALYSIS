package cl.duoc.ms_analysis.service.analysis;

import cl.duoc.ms_analysis.infrastructure.dtos.analysis.AnalysisCreateRequest;
import cl.duoc.ms_analysis.infrastructure.dtos.analysis.AnalysisResponse;
import cl.duoc.ms_analysis.infrastructure.dtos.analysis.AnalysisUpdateRequest;

import java.util.List;

public interface IAnalysisService {
    AnalysisResponse create (AnalysisCreateRequest request);
    AnalysisResponse update (AnalysisUpdateRequest request);
    List<AnalysisResponse> findAll();
    AnalysisResponse findById(Long id);
    void deleteById(Long id);
}
