package github.krebrow.Note_app.model;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message= "Title must be not null and not empty")
    private String title;
    private String description;

    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
