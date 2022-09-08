package com.lowes.warranty.repository;

import com.lowes.warranty.models.Blog;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.query.CouchbaseEntityInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.ObjectInputStream;

public interface BlogRepository extends CrudRepository<Blog, String> {

}
