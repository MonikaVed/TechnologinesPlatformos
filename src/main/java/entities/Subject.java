package entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries
        ({@NamedQuery(name = "Subject.findAll", query = "select s from Subject as s")})
@Table(name = "SUBJECT")
@Getter @Setter
public class Subject implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 100)
    @Column(name = "NAME")
    private String name;

    @ManyToMany(mappedBy = "subjects")
    private List<Painting> paintings = new ArrayList<>();

    public Subject() {}


}
