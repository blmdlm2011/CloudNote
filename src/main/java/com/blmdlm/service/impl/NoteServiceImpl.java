package com.blmdlm.service.impl;

import com.blmdlm.pojo.Note;
import com.blmdlm.repository.NoteRepository;
import com.blmdlm.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by gejing on 17-3-16.
 */
@Service
@Transactional
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> findAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public void deleteNote(Note note) {
        noteRepository.delete(note);
    }
}
