package taskTracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import taskTracker.enums.Role;

import javax.persistence.*;

@Entity
@Table(name = "auth_infos")
@Getter
@Setter
@NoArgsConstructor
public class AuthInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auth_gen")
    @SequenceGenerator(name = "auth_gen", sequenceName = "auth_seq",allocationSize = 1)
    private Long id;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;


}
