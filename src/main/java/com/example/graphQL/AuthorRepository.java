package com.example.graphQL;

import org.springframework.data.repository.CrudRepository;

interface AuthorRepository extends CrudRepository<Author, Long> {
}
