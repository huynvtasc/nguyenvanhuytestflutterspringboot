package com.example.nguyenvanhuyflutterapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlaceController {
    @GetMapping("/getAllPlace")
    public ResponseEntity<List<Place>> getAllPlaces() {
        List<Place> places = List.of(
                new Place(1, "Hoi An", "https://example.com/hoian.jpg", 4.5),
                new Place(2, "Sai Gon", "https://example.com/saigon.jpg", 4.7)
        );
        return ResponseEntity.ok(places);
    }
}