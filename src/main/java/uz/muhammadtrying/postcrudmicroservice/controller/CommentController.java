package uz.muhammadtrying.postcrudmicroservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.muhammadtrying.postcrudmicroservice.dto.CommentDTO;
import uz.muhammadtrying.postcrudmicroservice.entity.Comment;
import uz.muhammadtrying.postcrudmicroservice.service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/get/all")
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @GetMapping("/get/{commentId}")
    public Comment findById(@PathVariable Integer commentId) {
        return commentService.findById(commentId);
    }

    @PostMapping("/add")
    public Integer addComment(@RequestBody Comment comment) {
        return commentService.add(comment);
    }

    @PostMapping("/update")
    public Comment updateComment(@RequestBody Comment comment) {
        return commentService.update(comment);
    }

    @DeleteMapping("/delete/{commentId}")
    public Integer deleteById(@PathVariable Integer commentId) {
        return commentService.deleteById(commentId);
    }

    @GetMapping("/get/by/post/id/{postId}")
    public List<CommentDTO> getAllByPostId(@PathVariable Integer postId) {
        return commentService.findAllByPostId(postId);
    }
}
