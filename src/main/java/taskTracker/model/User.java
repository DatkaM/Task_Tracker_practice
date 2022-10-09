package taskTracker.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq",allocationSize = 1)
    private Long id;
    private String name;
    private String surname;
    private String photoLink;
    @OneToOne(cascade = CascadeType.ALL)
    private AuthInfo authInfo;
    @ManyToMany(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST},
            mappedBy = "users")
    private List<Notification> notifications;
    @ManyToMany(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    private List<Workspace> workspaces;
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Board> boards;


}
