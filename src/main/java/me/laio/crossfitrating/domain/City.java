package me.laio.crossfitrating.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "city")
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "soid")
    @SequenceGenerator(name = "soid", sequenceName = "soid")
    @Column(name = "city_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state")
    private State state;


}
