package github.krebrow.Note_app.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface NoteRepository extends JpaRepository<Note, Integer> {
}
