package com.example.yourproject; // Change this to match your package structure

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/api") // Base path for the API
public class FileUploadController {

    @PostMapping("/upload") // Endpoint to handle file uploads
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new ResponseEntity<>("Please upload a file!", HttpStatus.BAD_REQUEST);
        }

        try {
            // You can process the file here (e.g., save it to a directory, read its contents, etc.)
            String fileName = file.getOriginalFilename();
            long fileSize = file.getSize();

            // Here you can implement your logic to handle the uploaded file
            // For example: save it to the filesystem or parse it (if it's an Excel file)

            // Return success response
            return new ResponseEntity<>("File uploaded successfully! Name: " + fileName + ", Size: " + fileSize, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("An error occurred while processing the file.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
