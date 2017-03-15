package com.blmdlm.repository;

import com.blmdlm.pojo.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gejing on 17-3-15.
 */
public interface NoteRepository extends JpaRepository<Note,Integer> {
}
