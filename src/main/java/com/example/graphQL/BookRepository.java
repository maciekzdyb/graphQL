package com.example.graphQL;

import org.springframework.data.repository.CrudRepository;

interface BookRepository extends CrudRepository<Book, Long> {
}
