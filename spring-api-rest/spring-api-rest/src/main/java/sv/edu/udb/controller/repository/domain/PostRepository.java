package sv.edu.udb.controller.repository.domain;
import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.repository.domain.Post;
public interface PostRepository extends JpaRepository<Post, Long> {
}

