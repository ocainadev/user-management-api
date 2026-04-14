package dev.ocaina.usercontroller.Tasks;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskModel> getAll(){
        return taskRepository.findAll();
    }

    public TaskModel getById(Long id){
        Optional<TaskModel> model = taskRepository.findById(id);
        return model.orElse(null);
    }

    public TaskModel create(TaskModel model){
        return taskRepository.save(model);
    }

    public void delete(Long Id){
        taskRepository.deleteById(Id);
    }
}

