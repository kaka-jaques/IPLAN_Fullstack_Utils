package br.com.kalil.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kalil.objects.Login;

@Repository
@EnableJpaRepositories
public interface LoginRepository extends JpaRepository<Login, Integer> {

	@Query("FROM Login WHERE")
	Login protectedLogin();
	
}
