package com.nhnacademy.resident.controller;

import com.nhnacademy.resident.entity.Resident;
import com.nhnacademy.resident.exception.ResidentNotFoundException;
import com.nhnacademy.resident.service.ResidentService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResidentRestController {
    private final ResidentService residentService;

    public ResidentRestController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @GetMapping("/resident/{residentId}")
    public Resident getResident(@PathVariable("residentId") Long residentId) {
        Resident resident = residentService.getResident(residentId);
        if(Objects.isNull(resident)) {
            throw new ResidentNotFoundException();
        }

        return resident;
    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/resident")
//    public Resident createResident(@Valid @ModelAttribute("resident") Resident resident,
//                                   @RequestBody Resident BindingResult bindingResult) {
//        if(bindingResult.hasErrors()) {
//            throw new ValidationFailedException(bindingResult);
//        }
//
//        return residentService.createResident();
//    }
}
