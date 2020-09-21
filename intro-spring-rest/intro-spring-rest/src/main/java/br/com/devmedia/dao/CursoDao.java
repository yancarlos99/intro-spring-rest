package br.com.devmedia.dao;

import java.util.List;

import br.com.devmedia.curso.domain.Curso;

public interface CursoDao {
	
	public void save(Curso curso);
	
	public void update(Curso curso);
	
	public void delete(Long id);
	
	public Curso findById(Long id);
	
	public List<Curso> findAll();

}
