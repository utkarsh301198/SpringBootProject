package com.utkarsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.controller.Library;

public interface LibraryRepository extends JpaRepository<Library, String>, LibraryRepositoryCustom {

}
