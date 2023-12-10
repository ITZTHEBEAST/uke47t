package com.example.uke47t;

import com.example.uke47t.Kunde;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class KundeKontroller{

    //opprette en list med arraylist og list importer
    private final List<Kunde> alleKunder = new ArrayList<>();


            //oppretter post
    @PostMapping("/lagre")
    public void lagreKunde(Kunde innKunde){
        alleKunder.add(innKunde);

    }

    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle(){
        return alleKunder;
    }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleKunder.clear();
    }
}

