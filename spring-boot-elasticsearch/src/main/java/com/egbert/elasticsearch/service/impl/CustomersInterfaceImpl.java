package com.egbert.elasticsearch.service.impl;

import com.egbert.elasticsearch.model.Customer;
import com.egbert.elasticsearch.repository.CustomerRepository;
import com.egbert.elasticsearch.service.CustomersInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomersInterfaceImpl implements CustomersInterface {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List <Customer> searchCity(Integer pageNumber, Integer pageSize, String searchContent) {
/*        // 分页参数
        Pageable pageable = new PageRequest(pageNumber, pageSize);

        // Function Score Query
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("cityname", searchContent)),
                        ScoreFunctionBuilders.weightFactorFunction(1000))
                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("description", searchContent)),
                        ScoreFunctionBuilders.weightFactorFunction(100));

        // 创建搜索 DSL 查询
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(functionScoreQueryBuilder).build();

       logger.info("\n searchCity(): searchContent [" + searchContent + "] \n DSL  = \n " + searchQuery.getQuery().toString());

        Page<Customer> searchPageResults = customerRepository.search(searchQuery);
        return searchPageResults.getContent();
        */
        return null;
    }
}
