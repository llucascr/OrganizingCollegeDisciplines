package com.llucascr.OrganizingCollegeDisciplines.controller;

import com.llucascr.OrganizingCollegeDisciplines.dto.DiciplineDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.DiciplineIdStudentIdDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.DiciplineMinDTO;
import com.llucascr.OrganizingCollegeDisciplines.entities.Dicipline;
import com.llucascr.OrganizingCollegeDisciplines.services.DiciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/diciplines")
public class DiciplineController {

    @Autowired
    private DiciplineService diciplineService;


    @GetMapping
    public List<DiciplineDTO> findAll() {
        return diciplineService.findAll();
    }

    @GetMapping(value = "/{diciplineId}")
    public DiciplineDTO findById(@PathVariable Long diciplineId) {
        return diciplineService.findById(diciplineId);
    }

    @PostMapping(value = "/{studentId}/insert")
    public DiciplineIdStudentIdDTO insertDicipline(@PathVariable Long studentId, @RequestBody Dicipline dicipline) {
        return diciplineService.insertDicipline(dicipline, studentId);
    }
}
