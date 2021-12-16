package com.cuatroa.retotres.controller;

import com.cuatroa.retotres.model.Fragance;
import com.cuatroa.retotres.service.FraganceService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/api/fragance")
@CrossOrigin("*")
public class FraganceController {

    @Autowired
    private FraganceService fraganceService;

    @GetMapping("/all")
    public List<Fragance> getAll() {
        return fraganceService.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Fragance> getFragance(@PathVariable("reference") String reference) {
        return fraganceService.getFragance(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Fragance fragance){
        fraganceService.save(fragance);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Fragance update(@RequestBody Fragance fragance) {
        return fraganceService.update(fragance);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return fraganceService.delete(reference);
    }
}
