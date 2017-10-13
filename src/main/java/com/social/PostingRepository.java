package com.social;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by uengine on 2017. 10. 13..
 */
@RepositoryRestResource(collectionResourceRel = "postings", path="posting")
public interface PostingRepository extends PagingAndSortingRepository<Posting, String> {


}