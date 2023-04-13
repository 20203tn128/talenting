package mx.edu.utez.talenting.model;

import jakarta.persistence.Entity;
import mx.edu.utez.talenting.model.base.CatalogEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE payment_frecuency SET deleted = true WHERE id = ?")
public class PaymentFrecuency extends CatalogEntity {
}
