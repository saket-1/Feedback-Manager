package com.techtitans.feedbackregistry.repository;

import com.techtitans.feedbackregistry.entity.Feedback;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long> {

    @Query(nativeQuery = true, value = "SELECT rating, COUNT(*) as count_of_ratings FROM feedback_table where feedback_table.user_id=:userId GROUP BY rating")
    Iterable<RatingCountProjection> findByUserId(@Param("userId") Long userId);

    List<Feedback> findAllByUserIdOrderByCreatedTimeDesc(Long userId, Pageable pageable);

    interface RatingCountProjection {
        Long getRating();
        Long getCount_of_ratings();
    }
}
