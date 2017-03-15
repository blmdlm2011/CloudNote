package com.blmdlm.service;

import com.blmdlm.pojo.Note;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gejing on 17-3-15.
 */
public interface NoteService {
    List<Note> findAllNotes();
    void deleteNote(Note note);

}
