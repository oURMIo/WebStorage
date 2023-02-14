package com.example.undemo.webserver;

import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/show")
    public StringBuilder indexForAll() {
        try {
            String[] pathnames;
            StringBuilder listDirectory = new StringBuilder(" ");
            File f = new File(".\\files");
            pathnames = f.list();
            assert pathnames != null;
            for (String pathname : pathnames) {
                listDirectory.append(pathname).append("\n");
            }
            return listDirectory;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return new StringBuilder("pipec");
    }

    public void updateIndexHTML(){

    }
}
