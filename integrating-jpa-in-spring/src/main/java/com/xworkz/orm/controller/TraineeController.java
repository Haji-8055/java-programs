package com.xworkz.orm.controller;

import com.xworkz.orm.dto.TraineeDto;
import com.xworkz.orm.service.TraineeService;
import com.xworkz.orm.service.TraineeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class TraineeController {

    @Autowired
    TraineeService traineeService;   /* =new TraineeServiceImpl() */

    public TraineeController() {
        System.out.println("created Trainee controller instance");
    }

    @PostMapping("/saveTrainee")
    public String onSaveTrainee(@Valid TraineeDto traineeDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errorMsg", "please enter valid data");
            return "TraineeInfo";
        }
        String serviceMsg = traineeService.saveTrainee(traineeDto);
        model.addAttribute("message", serviceMsg);
        model.addAttribute("dto", traineeDto);
        return "TraineeInfo";
    }


    @GetMapping("/readAll")
    public String readAll(Model model) {
        List<TraineeDto> traineeDtos = traineeService.readTrainees();
        System.out.println(traineeDtos);
        model.addAttribute("trainees", traineeDtos);
        return "ShowTrainees";
    }

    @GetMapping("/searchTrainee")
    public String searchTrainee(@RequestParam String traineeName, Model model) {
        TraineeDto traineeDto = traineeService.findTraineeByName(traineeName);
        if (traineeDto != null) {
            model.addAttribute("obbane", traineeDto);
            return "ShowTrainees";
        }
        List<TraineeDto> traineeDtos = traineeService.readTrainees();
        model.addAttribute("trainees", traineeDtos);
        model.addAttribute("message", "trainee not found of name : " + traineeName);
        return "ShowTrainees";
    }

    @PostMapping("/updateTrainee")
    public String onUpdatebyName(String oldName, TraineeDto traineeDto, Model model) {

        String msgFromService = traineeService.updateTrainee(oldName, traineeDto);
        List<TraineeDto> traineeDtos = traineeService.readTrainees();
        System.out.println(traineeDtos);
        model.addAttribute("trainees", traineeDtos);
        model.addAttribute("message", msgFromService);
        return "ShowTrainees";

    }

}
