package com.petrushevsky.bookstore.repository;

import com.petrushevsky.bookstore.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {
}
