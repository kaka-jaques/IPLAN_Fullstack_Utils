package br.com.kalil.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import br.com.kalil.objects.Knowledge;

@Repository
@EnableJpaRepositories
public interface KnowledgeRepository extends JpaRepository<Knowledge, Integer> {

	@Query("FROM Knowledge WHERE")
	List<Knowledge> getAllKnowledges();
	
}
