package com.example.rohithbackend.repository;

import com.example.rohithbackend.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    Optional<List<Feedback>> findTop50ByOrderByDateDesc();
}
