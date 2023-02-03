package com.cloud.Enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.Enchere.model.Photo;
import com.cloud.Enchere.repository.PhotoRepository;

import java.util.List;

@Service
public class PhotoService {
    @Autowired(required=true)
    PhotoRepository photoRepository;

    public List<Photo> findAll(){
        return photoRepository.findAll();
    }

    public void save(Photo photo){
        photoRepository.save(photo);
    }
}