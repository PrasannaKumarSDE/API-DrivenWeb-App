package com.example.apidemo.Service;




import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.apidemo.Entity.RepositoryEntity;
import com.example.apidemo.Entity.RepositoryRepo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

@Service
public class GitHubService {

    private final RepositoryRepo repo;

    public GitHubService(RepositoryRepo repo) {
        this.repo = repo;
    }

    public List<RepositoryEntity> searchAndSave(String keyword) {
        String url = "https://api.github.com/search/repositories?q=" + keyword;
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        JSONObject json = new JSONObject(response);
        JSONArray items = json.getJSONArray("items");

        List<RepositoryEntity> list = new ArrayList<>();
        for (int i = 0; i < Math.min(items.length(), 5); i++) {
            JSONObject obj = items.getJSONObject(i);
            RepositoryEntity r = new RepositoryEntity();
            r.setId(obj.getLong("id"));
            r.setName(obj.getString("name"));
            r.setUrl(obj.getString("html_url"));
            r.setDescription(obj.optString("description", ""));
            r.setStars(obj.getInt("stargazers_count"));
            r.setKeyword(keyword);
            list.add(r);
        }
        return repo.saveAll(list);
    }

    public List<RepositoryEntity> getAll() {
        return repo.findAll();
    }
}
