package com.egbert.mongodb.multi.repository.secondary;

import com.egbert.mongodb.multi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author neo
 */
public interface SecondaryRepository extends MongoRepository <User, String> {
}
