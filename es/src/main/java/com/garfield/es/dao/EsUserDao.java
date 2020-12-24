package com.garfield.es.dao;

import com.garfield.es.bean.EsUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jingliyuan
 * @date 2020/12/24
 */
@Repository
public interface EsUserDao extends ElasticsearchRepository<EsUser,String> {
    Page<EsUser> findEsUserByName(String name, Pageable pageable);
}
