package uz.muhammadtrying.postcrudmicroservice.service;

import org.springframework.stereotype.Service;
import uz.muhammadtrying.postcrudmicroservice.dto.CommentDTO;
import uz.muhammadtrying.postcrudmicroservice.entity.Comment;

import java.util.List;

@Service
public interface CommentService {
    List<Comment> findAll();

    Comment findById(Integer commentId);

    Integer add(Comment comment);

    Comment update(Comment comment);

    Integer deleteById(Integer commentId);

    List<CommentDTO> findAllByPostId(Integer postId);
}
