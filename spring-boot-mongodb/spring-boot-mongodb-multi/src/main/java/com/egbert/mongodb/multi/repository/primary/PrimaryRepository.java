package com.egbert.mongodb.multi.repository.primary;

import com.egbert.mongodb.multi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author neo
 */
public interface PrimaryRepository extends MongoRepository <User, String> {
}
