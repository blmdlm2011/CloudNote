package com.blmdlm.controller;

import com.blmdlm.pojo.Note;
import com.blmdlm.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gejing on 17-3-15.
 */
@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/all")
    public List<Note> findAllNotes(){
        return  noteService.findAllNotes();
    }

    @GetMapping("/delete/{id}")
    public void deleteNote(@PathVariable Integer id){
        Note note = Note.builder().id(id).build();
        noteService.deleteNote(note);
    }
}
