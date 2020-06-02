package com.example.urlshortener.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
@Table(name="sms_urls")
public class URLShortener {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
​
    @Column(name = "long_url")
    private String longUrl;
​
    @Column(name = "short_url")
    private String shortUrl;
​
    @Column(name = "date")
    private Date created_at;
​
    @PrePersist
    public void addTimestamp() {
        created_at = new Date();
    }
​
    public void ShortenUrl(){}
​
    public void ShortenUrl(String shortUrl, String longUrl){
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
    }

}
