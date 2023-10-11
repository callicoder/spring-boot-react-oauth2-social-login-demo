package com.example.springsocial.repository;

import com.example.springsocial.model.Upload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadRepository extends JpaRepository<Upload, Long> {
}
