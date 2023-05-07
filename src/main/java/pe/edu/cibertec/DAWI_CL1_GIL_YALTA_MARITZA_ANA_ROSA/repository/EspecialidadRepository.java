package pe.edu.cibertec.DAWI_CL1_GIL_YALTA_MARITZA_ANA_ROSA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.DAWI_CL1_GIL_YALTA_MARITZA_ANA_ROSA.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, String>{
	
}
