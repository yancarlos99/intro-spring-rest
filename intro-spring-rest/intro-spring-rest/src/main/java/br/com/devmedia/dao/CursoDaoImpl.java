package br.com.devmedia.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.devmedia.curso.domain.Curso;

@Repository
public class CursoDaoImpl implements CursoDao {
	
	@Autowired
	private EntityManager entityManager;

	public void save(Curso curso) {
		entityManager.persist(curso);
	}

	public void update(Curso curso) {
		entityManager.merge(curso);
		
	}

	public void delete(Long id) {
		entityManager.remove(entityManager.getReference(Curso.class, id));
		
	}

	public Curso findById(Long id) {
		Curso curso = entityManager.find(Curso.class, id);
		
		return curso;
	}

	public List<Curso> findAll() {
		return entityManager.createQuery("select c from Curso c", Curso.class)
		.getResultList();
		
	}

}
