package feign.aula;

import org.springframework.data.jpa.repository.JpaRepository;
//Fazer persistencia do banco de dados
public interface Repo extends JpaRepository<Usuario, Long>{

}
