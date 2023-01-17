package sg.edu.nus.iss.app.workshop16.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.app.workshop16.model.Mastermind;

@RestController
@RequestMapping(path="/api/boardgame", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
public class BoardGameController {
    
    @PostMapping
    public ResponseEntity<String> createBoardGame(@RequestBody Mastermind ms){
        System.out.println("MS >" + ms.toString());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body( ms.toJSON().toString());
    }
}
