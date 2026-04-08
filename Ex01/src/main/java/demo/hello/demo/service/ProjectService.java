package demo.hello.demo.service;

import demo.hello.demo.model.Project;
import demo.hello.demo.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo){
        this.repo = repo;
    }

    public List<Project> getAll(){
        return repo.findAll();
    }

    public Project getById(String id){
        return repo.findById(id);
    }
}
