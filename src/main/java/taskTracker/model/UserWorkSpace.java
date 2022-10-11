package taskTracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import taskTracker.enums.Role;

import javax.management.relation.RoleInfoNotFoundException;
import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "user_workspace_roles")
@Getter
@Setter
@NoArgsConstructor
public class UserWorkSpace {

    // who
    // which workspace
    // which role // ADMIN || USER

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_workspace_roles_gen")
    @SequenceGenerator(name = "user_workspace_roles_gen", sequenceName = "user_workspace_roles_seq",allocationSize = 1)
    private Long id;
    @OneToOne(cascade = {REFRESH, DETACH, PERSIST, MERGE})
    private User user;
    @ManyToOne(cascade = {REFRESH, DETACH, PERSIST, MERGE})
    private Workspace workspace;
    private Role role;

}
