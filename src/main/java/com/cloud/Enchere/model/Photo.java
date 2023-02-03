package com.cloud.Enchere.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("photo")
public class Photo {
    @Id
    private String id;

    @Field("idenchere")
    private int idenchere;

    @Field("photos")
    private List<String> photos;

    @Override
    public String toString() {
        return "Photo [id=" + id + ", idenchere=" + idenchere + ", photos=" + photos + "]";
    }
}