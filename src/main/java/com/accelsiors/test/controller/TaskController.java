package com.accelsiors.test.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.accelsiors.test.TestService;
import com.accelsiors.test.model.Activity;
import com.accelsiors.test.model.Task;

@RestController
public class TaskController {

	@Autowired
	TestService tsServ;
	
    @GetMapping("/getTasks")
    @CrossOrigin(origins = "*")
    public Collection<Task> getTasks() {
      
        return tsServ.findAllTasks();
    }
	
    @GetMapping("/getActivities")
    @CrossOrigin(origins = "*")
    public Collection<Activity> getActivities() {

        return tsServ.findAllActivities();
    }
    
    @PostMapping("/saveTask")
    @CrossOrigin(origins = "*")
    public String saveTask(@RequestBody Task task) {
    	try {
    		tsServ.saveTask(task);
		} catch (Exception e) {
			return "Exception: "+e.getMessage();
		}
    	return "Task Saved/Updated successfully";
    }
}
