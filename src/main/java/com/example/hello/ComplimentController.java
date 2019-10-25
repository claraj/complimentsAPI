package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by clara on 4/5/18.
 */

@RestController
public class ComplimentController {

    private Compliment[] compliments = {
            new Compliment("You look nice today!"),
            new Compliment("Your code is awesome!"),
            new Compliment("I'm so happy to see you!"),
            new Compliment("You deserve to have a great day!"),
            new Compliment("Super fun to code with you!"),
            new Compliment("You are a smart cookie!"),
            new Compliment("On a scale of 1 to 10, you are an 11!"),
            new Compliment("You are a ray of sunshine!"),
            new Compliment("Thanks for being you!"),
            new Compliment("You have great style!"),
            new Compliment("You light up the room!"),
            new Compliment("You have the best sense of humor!"),
            new Compliment("You are all that and more!"),
            new Compliment("You are even more beautiful on the inside than the outside!"),
            new Compliment("You are an inspiration!"),
            new Compliment("You make a difference to the world!"),
            new Compliment("You are a ray of sunshine!"),
            new Compliment("You are the best thing since sliced bread!"),
            new Compliment("You are so creative!"),
            new Compliment("You have the best ideas!"),
            new Compliment("You rock!"),
            new Compliment("You can accomplish anything!"),
            new Compliment("You are breathtaking!"),
            new Compliment("You are inspiring!"),
            new Compliment("You are so smart!"),
            
    };

    private Random rnd = new Random();


    @RequestMapping("/random")
    ResponseEntity<Compliment> randomCompliment() {
      Compliment randomCompliment = compliments[rnd.nextInt(compliments.length)];
      return new ResponseEntity<>(randomCompliment, HttpStatus.OK);
    }

}
