package com.task5.web.controller;
import com.task5.web.service.robotService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.task5.web.model.robotmodel;

@RestController
@RequestMapping(path = "/robot")

public class robotController {
    
    @Autowired
    private robotService RobotService;
    
    @GetMapping("/getAll")
    public List<robotmodel> getAllRobot() {
        return RobotService.getAllRobot();
    }

    @GetMapping("/chooserobot/{robotname}")
    public Optional <robotmodel> getRobotById(@PathVariable String robotname) {
        return RobotService.getRobotById(robotname);
       
    }

}
