package com.codeclan.example.fileservice.controllers;

import com.codeclan.example.fileservice.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/files")
public class FileControler {

    @Autowired
    FileRepository fileRepository;
}
