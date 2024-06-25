package uz.muhammadtrying.postcrudmicroservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.muhammadtrying.postcrudmicroservice.dto.CommentDTO;
import uz.muhammadtrying.postcrudmicroservice.entity.Comment;
import uz.muhammadtrying.postcrudmicroservice.repo.CommentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findById(Integer commentId) {
        return commentRepository.findById(commentId).get();
    }

    @Override
    public Integer add(Comment comment) {
        return commentRepository.save(comment).getId();
    }

    @Override
    public Comment update(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Integer deleteById(Integer commentId) {
        commentRepository.deleteById(commentId);
        return commentId;
    }

    @Override
    public List<CommentDTO> findAllByPostId(Integer postId) {
        return commentRepository.findAllByPostId(postId);
    }
}
