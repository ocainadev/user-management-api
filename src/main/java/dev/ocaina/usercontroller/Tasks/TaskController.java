package dev.ocaina.usercontroller.Tasks;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/all")
    public List<TaskModel> get() {
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public TaskModel getById(@PathVariable long id) {
        return taskService.getById(id);
    }

    @PostMapping("/create")
    public TaskModel post(@RequestBody TaskModel model){
        return taskService.create(model);
    }

    @PutMapping("/update")
    public String put(){
        return "Atualiza um novo User";
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        taskService.delete(id);
    }

}
