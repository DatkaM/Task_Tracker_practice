package taskTracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "attachments")
@Getter
@Setter
@NoArgsConstructor
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attachment_gen")
    @SequenceGenerator(name = "attachment_gen", sequenceName = "attachment_seq",allocationSize = 1)
    private Long id;
    private String documentLink;
    private LocalDateTime attachedDate;
}
