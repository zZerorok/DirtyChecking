package project.jpapractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Member {

    @Id
    private Long id;
    private String name;
}
