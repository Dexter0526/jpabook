package jpabook.model.entity.item;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends Item{

    private String artist;
    private String etc;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getEtc() {
        return etc;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                ", etc='" + etc + '\'' +
                '}';
    }
}
