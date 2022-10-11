package taskTracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import taskTracker.enums.LabelsColor;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "labels")
@Getter
@Setter
@NoArgsConstructor
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "label_gen")
    @SequenceGenerator(name = "label_gen", sequenceName = "label_seq",allocationSize = 1)
    private Long id;
    private String description;
    private LabelsColor color;
    @ManyToOne(cascade = {DETACH, REFRESH, MERGE, PERSIST})
    private Card card;
}
