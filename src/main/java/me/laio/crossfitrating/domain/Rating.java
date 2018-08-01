package me.laio.crossfitrating.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "rating")
@Getter
@Setter
public class Rating {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "soid")
    @SequenceGenerator(name = "soid", sequenceName = "soid")
    @Column(name = "rating_id")
    private Long id;

    @Column(name = "price_rate")
    private Integer priceRate;

    @Column(name = "material_rate")
    private Integer materialRate;

    @Column(name = "place_rate")
    private Integer placeRate;

    @Column(name = "coach_rate")
    private Integer coachRate;

    @Column(name = "comments")
    private String coach;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venue")
    private Venue venue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private User author;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", locale = "pt-BR", timezone = "Brazil/East")
    private Date date;


}
