package com.xcodefy.custom.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String headline;
    private String newsBody;

    public News(String headline) {
        this.headline = headline;
    }
}
