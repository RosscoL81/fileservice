package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User ross = new User("Ross");
        userRepository.save(ross);

        User billy = new User("Billy");
        userRepository.save(billy);

        Folder java = new Folder("Java", ross);
        folderRepository.save(java);

        Folder ruby = new Folder("Ruby", billy);
        folderRepository.save(ruby);

        File array = new File("arrays", ".md", 2, ruby);
        fileRepository.save(array);

        File hash = new File("hashes", ".md", 3, ruby);
        fileRepository.save(hash);

        File spring = new File("spring", ".md", 4, java);
        fileRepository.save(spring);

    }
}
