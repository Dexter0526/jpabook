package jpabook.model.entity.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Movie extends Item{

    private String director;
    private String actor;

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
}
