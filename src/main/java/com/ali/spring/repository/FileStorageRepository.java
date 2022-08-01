package com.ali.spring.repository;

import com.ali.spring.domain.FileStorage;
import com.ali.spring.domain.FileStorageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileStorageRepository  extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    List<FileStorage> findAllByFileStorageStatus(FileStorageStatus status);
}
