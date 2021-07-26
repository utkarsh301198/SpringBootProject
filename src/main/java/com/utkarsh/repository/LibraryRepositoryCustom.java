package com.utkarsh.repository;

import java.util.List;

import com.utkarsh.controller.Library;

public interface LibraryRepositoryCustom {
List<Library> findAllByAuthor(String authorName);
}
