package com.jpoint.physics.model;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

@RestController
@RequiredArgsConstructor
public class PhysicsRest {

    private final ExerciseRepository exerciseRepository;

    @GetMapping("/{q}")
    public List<Exercise> getExercises(@PathVariable int q) {
        final Page<Exercise> exercisePage = exerciseRepository.findAll(PageRequest.of(0, q));
        List<Exercise> exercises = new ArrayList<>(exercisePage.getContent());
        shuffle(exercises);
        return exercises;
    }

}
