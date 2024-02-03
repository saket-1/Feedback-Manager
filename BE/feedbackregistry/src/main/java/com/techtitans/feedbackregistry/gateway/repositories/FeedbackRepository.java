package com.techtitans.feedbackregistry.gateway.repositories;

import com.techtitans.feedbackregistry.core.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
