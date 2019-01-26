package main;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import domain.Bird;
import domain.HummingBird;
import domain.Parrot;

@RestController
public class BirdController {

    @PostMapping("/test_bird")
    public String testPolimophism(@RequestBody Bird bird) {
        if (bird instanceof Parrot) {
            return "Received a parrot";
        }
        if (bird instanceof HummingBird) {
            return "Received a hummingBird";
        }
        return "Can't recognize kind of bird";
    }
}
