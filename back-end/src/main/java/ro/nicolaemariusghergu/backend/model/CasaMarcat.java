package ro.nicolaemariusghergu.backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;
import ro.nicolaemariusghergu.backend.model.enums.TypeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@javax.persistence.Entity
@ToString
@Table(name = "case_marcat")
public class CasaMarcat extends Entity implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numar_casa_marcat")
    private Integer number;

    @Column(name = "bani_locali_casa_marcat")
    private Double localMoney;

    @ToString.Exclude
    @JoinColumn(name = "type_pay_id", nullable = false)
    @ManyToOne
    private TypePay typePay;

    @ToString.Exclude
    @JoinColumn(name = "type_status_id", nullable = false)
    @ManyToOne
    private TypeStatus typeStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CasaMarcat that = (CasaMarcat) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
