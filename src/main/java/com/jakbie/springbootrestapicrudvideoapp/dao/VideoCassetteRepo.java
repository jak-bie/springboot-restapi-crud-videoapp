package com.jakbie.springbootrestapicrudvideoapp.dao;

import com.jakbie.springbootrestapicrudvideoapp.dao.entity.VideoCassette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCassetteRepo extends CrudRepository<VideoCassette, Long> {

}
