package Kodlama.io.Devs.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name="languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SoftwareLanguage {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Id
	private int id;

	@Column(name = "language_name")
	private String languageName;

	@OneToMany(mappedBy = "softwareLanguage")
	private List<Technology> technologies;


}
