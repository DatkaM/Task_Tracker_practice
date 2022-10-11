package taskTracker.model;

import lombok.*;
import taskTracker.enums.Role;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

import static javax.persistence.CascadeType.*;

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
    private String email;
    private String password;
    @OneToMany(cascade = {ALL}, mappedBy = "user")
    private List<Notification> notifications;
    @ManyToMany(cascade = {DETACH, REFRESH, MERGE, PERSIST})
    private List<Workspace> workspaces;
    @ManyToMany(cascade = {ALL})
    private List<Board> boards;
    @Enumerated(EnumType.STRING)
    private Role role;


}
