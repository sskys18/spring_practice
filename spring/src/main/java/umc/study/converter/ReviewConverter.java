package umc.study.converter;

import umc.study.domain.Review;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.ReviewResponseDTO;

import java.time.LocalDateTime;

public class ReviewConverter {
    public static ReviewResponseDTO.JoinResultDTO tojoinResultDTO(Review review){
        return ReviewResponseDTO.JoinResultDTO.builder()
                .reviewID(review.getReview_id())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Review toReview(ReviewRequestDTO.JoinDto request){
        return Review.builder()
                .title(request.getTitle())
                .score(request.getScore())
                .build();
    }
}
