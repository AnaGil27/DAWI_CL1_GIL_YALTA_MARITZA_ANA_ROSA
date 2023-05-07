package pe.edu.cibertec.DAWI_CL1_GIL_YALTA_MARITZA_ANA_ROSA.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "especialidad")
public class Especialidad {
	@Id
	private String idesp;
	@Column(name="nomesp")
	private String nomesp;
	@Column(name="costo")
	private double costo;
}
