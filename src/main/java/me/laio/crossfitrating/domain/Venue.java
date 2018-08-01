package me.laio.crossfitrating.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "venue")
@Getter
@Setter
public class Venue {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "soid")
    @SequenceGenerator(name = "soid", sequenceName = "soid")
    @Column(name = "venue_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "website")
    private String website;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "coach")
    private String coach;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city")
    private City city;


}
