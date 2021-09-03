package net.edrialan.api.service;

import java.util.List;

import net.edrialan.api.entity.Album;

public interface IAlbumsService 
{
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(Integer idAlbum);
}
