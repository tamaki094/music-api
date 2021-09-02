package net.edrialan.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.edrialan.api.entity.Album;
import net.edrialan.api.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController 
{
	@Autowired
	private IAlbumsService serviceAlbum;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos()
	{
		return serviceAlbum.buscarTodos();
	}
	
	
	
}
