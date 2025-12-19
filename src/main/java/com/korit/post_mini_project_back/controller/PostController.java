package com.korit.post_mini_project_back.controller;

import com.korit.post_mini_project_back.dto.request.CreatePostReqDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @PostMapping(value = "", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> createPost(@ModelAttribute CreatePostReqDto dto) {
        System.out.println(dto);
        return ResponseEntity.ok(null);
    }
}