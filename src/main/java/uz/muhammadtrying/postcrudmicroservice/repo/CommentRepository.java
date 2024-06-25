package uz.muhammadtrying.postcrudmicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.muhammadtrying.postcrudmicroservice.dto.CommentDTO;
import uz.muhammadtrying.postcrudmicroservice.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query(nativeQuery = true, value = """
                    select c.post_id as postId, c.content as content from comment c where c.post_id = :postId
            """)
    List<CommentDTO> findAllByPostId(Integer postId);
}