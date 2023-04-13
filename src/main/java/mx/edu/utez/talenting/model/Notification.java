package mx.edu.utez.talenting.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import mx.edu.utez.talenting.model.base.UuidEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE notification SET deleted = true WHERE id = ?")
public class Notification extends UuidEntity {
    @Column(nullable = false, length = 31)
    private String title;
    @Column(nullable = false, length = 63)
    private String description;
    @ManyToOne(optional = false)
    private User user;
    @Column(nullable = false, length = 255)
    private String url;
    @Column(nullable = false)
    private boolean read = false;
}
