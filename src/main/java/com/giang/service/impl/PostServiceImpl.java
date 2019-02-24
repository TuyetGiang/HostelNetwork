package com.giang.service.impl;

import com.giang.repository.PostRepository;
import com.giang.repository.entity.Post;
import com.giang.service.PostService;
import com.giang.service.dto.PostDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDTO> getAll() {
        return postRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public PostDTO updateStatus(Integer id, Boolean status) {
        Post post = postRepository.findById(id);
        Optional.ofNullable(post).orElseThrow(EntityNotFoundException::new);

        post.setStatus(status);
        post = postRepository.saveAndFlush(post);
        return mapToDto(post);
    }

    @Override
    public List<PostDTO> getPostByTimes(LocalDate from, LocalDate to) {
        return postRepository.findAllByTimes(from, to).stream().map(this::mapToDto).collect(Collectors.toList());
    }

    private PostDTO mapToDto(Post entity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(entity, PostDTO.class);
    }
}
