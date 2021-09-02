package net.edrialan.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.edrialan.api.entity.Album;
import net.edrialan.api.repository.AlbumsRepository;
import net.edrialan.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService 
{

	@Autowired
	private AlbumsRepository repoAlbums;
	
	@Override
	public List<Album> buscarTodos() 
	{
		return repoAlbums.findAll();
	}

}
