package com.example.form_validation.service;

import com.example.form_validation.model.PostcodeTown;
import com.example.form_validation.repo.PostcodeTownRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostcodeTownService {

    @Autowired
    private PostcodeTownRepository postcodeTownRepository;

    public List<PostcodeTown> findTownsByPostcode(String postcode) {
        return postcodeTownRepository.findByPostcode(postcode);
    }
}


