package taskTracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import taskTracker.enums.LabelsColor;

import javax.persistence.*;

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
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    private Card card;
}
