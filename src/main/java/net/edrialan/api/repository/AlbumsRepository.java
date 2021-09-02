package net.edrialan.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.edrialan.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer>
{

}
