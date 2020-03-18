package jpabook.jpashop.domain.item;

import jpabook.jpashop.domain.Category;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("A")
public class Album extends Item{
    private String artist;
    private String etc;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getArtist() {
        return artist;
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
