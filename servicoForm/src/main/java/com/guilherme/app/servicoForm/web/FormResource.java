package com.guilherme.app.servicoForm.web;

import com.guilherme.app.servicoForm.service.FormService;
import com.guilherme.app.servicoForm.service.dto.FormDTO;
import com.guilherme.app.servicoForm.service.dto.NameIdDTO;
import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/user/{id}")
    public ResponseEntity<List<NameIdDTO>> getFormByUsersId(@PathVariable Long id) {
        return ResponseEntity.ok().body(formService.findByUserId(id));
    }

    @GetMapping("/shared/{pageNumber}")
    public ResponseEntity<Page<FormDTO>> getFormsShared(@PathVariable Long pageNumber){
        return ResponseEntity.ok().body(formService.findFormsShared(pageNumber));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteFormById(@PathVariable Long id){
        formService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
