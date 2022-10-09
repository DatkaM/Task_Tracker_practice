package taskTracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boards")
@Getter
@Setter
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_gen")
    @SequenceGenerator(name = "board_gen", sequenceName = "board_seq", allocationSize = 1)
    private Long id;
    private String title;
    private boolean isFavorite = false;
    private String photoLink;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "board")
    private List<Column> columns;
//    @ManyToMany(cascade = {
//            CascadeType.DETACH,
//            CascadeType.REFRESH,
//            CascadeType.MERGE,
//            CascadeType.PERSIST})
//    private List<User> admins;
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
            CascadeType.PERSIST},
            mappedBy = "boards")
    private List<User> members;
    @OneToMany(cascade = {CascadeType.ALL},
            mappedBy = "board")
    private List<Card> allIssues;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    private Workspace workspace;

}
