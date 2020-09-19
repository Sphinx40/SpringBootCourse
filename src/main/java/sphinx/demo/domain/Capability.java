package sphinx.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Capability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String techStack;
    private Integer numOfDeveloper;
    private Integer numOfAvailableDevelopers;

    public Capability(String techStack, Integer numOfDeveloper, Integer numOfAvailableDevelopers) {
        this.techStack = techStack;
        this.numOfDeveloper = numOfDeveloper;
        this.numOfAvailableDevelopers = numOfAvailableDevelopers;
    }
}
