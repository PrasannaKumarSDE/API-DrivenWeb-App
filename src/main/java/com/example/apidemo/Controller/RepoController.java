package com.example.apidemo.Controller;



import org.springframework.web.bind.annotation.*;

import com.example.apidemo.Entity.RepositoryEntity;
import com.example.apidemo.Service.GitHubService;

import java.util.List;

@RestController
@CrossOrigin
public class RepoController {

    private final GitHubService service;

    public RepoController(GitHubService service) {
        this.service = service;
    }

    @PostMapping("/search")
    public List<RepositoryEntity> search(@RequestParam String keyword) {
        return service.searchAndSave(keyword);
    }

    @GetMapping("/results")
    public List<RepositoryEntity> results() {
        return service.getAll();
    }
}
