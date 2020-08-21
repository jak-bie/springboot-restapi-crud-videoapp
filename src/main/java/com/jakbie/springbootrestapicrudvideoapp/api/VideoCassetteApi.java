package com.jakbie.springbootrestapicrudvideoapp.api;

import com.jakbie.springbootrestapicrudvideoapp.dao.entity.VideoCassette;
import com.jakbie.springbootrestapicrudvideoapp.manager.VideoCassetteManager;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassettes")
public class VideoCassetteApi {

    private VideoCassetteManager videoCassettes;

    public VideoCassetteApi(VideoCassetteManager videoCassettes) {
        this.videoCassettes = videoCassettes;
    }

    /*private List<VideoCassette> videoCassettes;

    public VideoCassetteApi() {
        this.videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L,"Star Wars: Return of The Jedi",
                LocalDate.of(1983,5,25)));
        videoCassettes.add(new VideoCassette(2L,"Star Wars: A New Hope",
                LocalDate.of(1979,7,19)));
    }*/

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {//List<VideoCassette>
        //return videoCassettes;
        return videoCassettes.findAll();
    }

    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long index) {//VideoCassette
        /*Optional<VideoCassette> first = videoCassettes.stream().
                filter(element -> element.getId() == index).findFirst();
        return first.get();*/
        return videoCassettes.findById(index);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) { //boolean
        //return videoCassettes.add(videoCassette);
        return videoCassettes.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) { //boolean
        //return videoCassettes.add(videoCassette);
        return videoCassettes.save(videoCassette);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long index) { //boolean
        //return videoCassettes.removeIf(element -> element.getId() == index);
        videoCassettes.deleteById(index);
    }

}
