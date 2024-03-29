package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.ReportAsSingleViolation;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
