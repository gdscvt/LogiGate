package com.logigate;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface allowing us to 1) create new problems, 2) updates existing ones, 3)
 * delete problems, 4) find problems
 */
interface ProblemRepository extends JpaRepository<Problem, Long> {
    public Problem findBySlug(String slug);
}