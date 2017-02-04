package com.aviv.assignment2.repository;

import com.aviv.assignment2.domain.Chapter;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Chapter entity.
 */
@SuppressWarnings("unused")
public interface ChapterRepository extends JpaRepository<Chapter,Long> {

}
