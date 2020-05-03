package com.guilherme.app.servicoForm.web;

import com.guilherme.app.servicoForm.service.FormService;
import com.guilherme.app.servicoForm.service.dto.FormDTO;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/form")
public class FormResource {

    private final FormService formService;

    public FormResource(FormService formService) {
        this.formService = formService;
    }

    @PostMapping()
    public ResponseEntity<FormDTO> save(@RequestBody FormDTO formDTO){
        formService.save(formDTO);
        return ResponseEntity.ok(formDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormDTO> getFormById(@PathVariable Long id) throws NotFoundException {
        return ResponseEntity.ok().body(formService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<FormDTO>> findAllForms() {
        return ResponseEntity.ok().body(formService.findAllForms());
    }
}
