package com.example.form_validation.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.form_validation.model.PostcodeTown;

public interface PostcodeTownRepository extends CrudRepository<PostcodeTown, String> {
    List<PostcodeTown> findByPostcode(String postcode);
}
