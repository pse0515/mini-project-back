package com.korit.post_mini_project_back.mapper;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentMapperTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void findAllCommentByPostId(){
        System.out.println(commentMapper.findAllCommentByPostId(209));
    }
}
