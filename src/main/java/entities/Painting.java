package entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries
({@NamedQuery(name = "Painting.findAll", query = "select p from Painting as p")})
@Table(name = "PAINTING")
@Getter @Setter
public class Painting implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 100)
    @Column(name = "NAME")
    private String name;

    @Column(name = "EXPOSITION_NUMBER")
    private Integer expositionNumber;

    @ManyToOne
    @JoinColumn(name="AUTHOR_ID")
    private Author author;

    @ManyToMany
    @JoinTable(
            name = "subjects_for_paintings",
            joinColumns = @JoinColumn(name = "painting_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> subjects = new ArrayList<>();

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer version;

    public Painting() { }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Painting painting = (Painting) o;
        return Objects.equals(id, painting.id) &&
                Objects.equals(name, painting.name);
    }

    @Override
    public int hashCode() { return Objects.hash(id, name);
    }
}
