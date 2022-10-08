package taskTracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card_gen")
    @SequenceGenerator(name = "card_gen", sequenceName = "card_seq", allocationSize = 1)
    private Long id;
    private String title;
    private String description;
    private boolean isFavorite = false;
    private LocalDate created;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    private User creator;
    @ManyToMany(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    private List<User> members;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Checklist> checklists;
    @OneToOne(cascade = {CascadeType.ALL})
    private Estimation estimation;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    private Column column;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Label> labels;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Comment> comments;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Attachment> attachments;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    private Board board;

}